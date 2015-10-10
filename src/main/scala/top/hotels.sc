import top._

val hotelDb = HotelDb(
  Hotel("Lakewood", 3, Map(
    Booking(Regular, Weekday) -> 110,
    Booking(Rewards, Weekday) -> 80,
    Booking(Regular, Weekend) -> 90,
    Booking(Rewards, Weekend) -> 80
  )),
  Hotel("Bridgewood", 4, Map(
    Booking(Regular, Weekday) -> 160,
    Booking(Rewards, Weekday) -> 110,
    Booking(Regular, Weekend) -> 60,
    Booking(Rewards, Weekend) -> 50
  )),
  Hotel("Ridgewood", 5, Map(
    Booking(Regular, Weekday) -> 220,
    Booking(Rewards, Weekday) -> 100,
    Booking(Regular, Weekend) -> 150,
    Booking(Rewards, Weekend) -> 40
  ))
)

val bookingRequests = Seq(
  BookingRequest(Regular, Seq(Weekday, Weekday, Weekday)),
  BookingRequest(Regular, Seq(Weekday, Weekend, Weekend)),
  BookingRequest(Rewards, Seq(Weekday, Weekday, Weekend))
)

bookingRequests.map(hotelDb.findBestHotel)
