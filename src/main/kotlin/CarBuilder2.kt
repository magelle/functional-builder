
// This is my Builder
fun carWith2(vararg properties: (Car) -> Car): Car =
    properties.toList()
        .fold(Car(
            color = "Red",
            serialNumber = 1,
            price = 60_000f
        ))
        { carBuilder, propertyToApply -> propertyToApply(carBuilder) }

fun color2(color: String): (Car) -> Car = {
    it.copy(color = color)
}

fun serialNumber2(serialNumber: Int): (Car) -> Car = {
    it.copy(serialNumber = serialNumber)
}

fun price2(price: Float): (Car) -> Car = {
    it.copy(price = price)
}