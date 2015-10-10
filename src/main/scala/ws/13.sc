
trait JsonValue
case object JsonNull extends JsonValue
case class JsonString(value: String) extends JsonValue
case class JsonNumber(value: Double) extends JsonValue
case class JsonBoolean(value: Boolean) extends JsonValue
case class JsonArray(value: List[JsonValue]) extends JsonValue
case class JsonObject(value: List[(String, JsonValue)]) extends JsonValue
