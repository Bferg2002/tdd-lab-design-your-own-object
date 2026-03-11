package object.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {
    @Test
    public void constructorShouldCreatePersonWithValidData() {
        Car car = new Car("Volkswagen", "Jetta", 2015 , "brown", 110_000, false);

        assertEquals("Volkswagen", car.getModel());
        assertEquals("Jetta", car.getBrand());
        assertEquals(2015, car.getYear());
        assertEquals("brown", car.getColor());
        assertEquals(110000, 110_000);
        assertEquals(false, car.isElectric());

    }

    @Test
    public void constructorWithNegativeMileageThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Car("Honda", "Civic", 2010,
                        "grey", -50_000, false)
        );
    }

    @Test
    public void setModeleShouldUpdateModel() {
        Car car = new Car("Honda", "Civic", 2010, "grey", 50_000, false);
        car.setModel("Honda");
        assertEquals("Honda", car.getModel());
    }

    @Test
    public void setBrandShouldUpdate() {
        Car car = new Car("Honda", "Civic", 2010, "grey", 50_000, false);
        car.setBrand("Civic");
        assertEquals("Civic", car.getBrand());
    }

    @Test
    public void setYearShouldUpdateYear() {
        Car car = new Car("Honda", "Civic", 2010, "grey", 50_000, false);
        car.setYear(2010);
        assertEquals(2010, car.getYear());
    }

    @Test
    public void setColorShouldUpdateColor() {
        Car car = new Car("Honda", "Civic", 2010, "grey", 50_000, false);
        car.setColor("grey");
        assertEquals("grey", car.getColor());
    }

    @Test
    public void setMileageShouldUpdateMileage() {
        Car car = new Car("Honda", "Civic", 2010, "grey", 50_000, false);
        car.setMileage(50_000);
        assertEquals(50_000, car.getMileage());
    }

    @Test
    public void setElectricShouldUpdateElectric() {
        Car car = new Car("Honda", "Civic", 2010, "grey", 50_000, false);
        car.setElectric(true);
        assertEquals(true, car.isElectric());
    }

    @Test
    public void testDrive() {
        Car car = new Car("Civic", "Honda", 2020, "Blue", 10000, false);

        car.drive(500);

        assertEquals(10500, car.getMileage());
    }

    @Test
    public void testDisplayCarInfo() {
        Car car = new Car("Model S", "Tesla", 2023, "Red", 15000, true);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        car.displayCarInfo();

        String expectedOutput = """
        **********************
        Model Model S
        Brand Tesla
        Year: 2023
        Color Red
        Mileage 15000
        This vehicle runs on electricity.
        """;

        assertEquals(expectedOutput, output.toString());
    }




}
