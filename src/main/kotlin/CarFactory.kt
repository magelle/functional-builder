package CarFactory

import Car

// This is my "Factory"
fun aCar(
    serialNumber: Int = 1,
    color: String = "Blue",
    price: Float = 60_000.0f
) =
    Car(
        serialNumber = serialNumber,
        color = color,
        price = price
    )