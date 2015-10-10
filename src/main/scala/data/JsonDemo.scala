package data

import play.api.libs.json._

class Splitters(sep: String) {
  def unapply(string: String) = string.split(sep) match {
    case Array(prefix, suffix) => Some((prefix, suffix))
    case _                     => None
  }
}


object JsonDemo {

  val :: = new Splitters(":")
  val || = new Splitters("|")

  def transform(json: JsValue): JsValue = json match {
    case JsNumber(value)           => JsNumber(value * value)
    case JsString("urn" :: suffix) => JsString(suffix)
    case JsString("urn" || suffix) => JsString(suffix)
    case JsString(value)           => JsString(s"Hello $value")
    case JsArray(values)           => JsArray(values.map(transform))
    case JsObject(pairs)           => JsObject(pairs.map(transformPair))
    case x                         => x
  }

  def transformPair(pair: (String, JsValue)) = pair match {
    case (key@("m" | "n"), v) => s"hello $key" -> v
    case (k, v)               => k -> transform(v)
  }
}



