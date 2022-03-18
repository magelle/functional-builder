data class CarBuilder(
    val serialNumber: Int = 1,
    val color: String = "Yellow",
    val price: Float = 60_000.0f
)

typealias propertySetter =  (CarBuilder) -> CarBuilder

// This is my Builder
fun carWith(vararg properties: propertySetter): Car =
    properties.toList()
        .fold(CarBuilder()) { carBuilder, propertyToApply -> propertyToApply(carBuilder) }
        .let {
            Car(
                serialNumber = it.serialNumber,
                color = it.color,
                price = it.price
            )
        }

fun color(color: String): propertySetter = {
    it.copy(color = color)
}

fun serialNumber(serialNumber: Int): propertySetter = {
    it.copy(serialNumber = serialNumber)
}

fun price(price: Float): propertySetter = {
    it.copy(price = price)
}