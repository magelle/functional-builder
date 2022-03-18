import CarFactory.aCar
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CarTest {

    @Test
    fun `create a car with a factory`() {
        val aRedCar = aCar(
            color = "green",
            serialNumber = 17
        )

        assertEquals("green", aRedCar.color)
        assertEquals(17, aRedCar.serialNumber)
    }

    @Test
    fun `create a car with a composed builder`() {
        val aRedCar = carWith(
            color("green"),
            serialNumber(17)
        )

        assertEquals("green", aRedCar.color)
        assertEquals(17, aRedCar.serialNumber)
    }

    @Test
    fun `create a car with the second composed builder`() {
        val aRedCar = carWith2(
            color2("green"),
            serialNumber2(17)
        )

        assertEquals("green", aRedCar.color)
        assertEquals(17, aRedCar.serialNumber)
    }

}