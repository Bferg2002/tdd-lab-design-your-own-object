package object.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void constructorShouldCreatePersonWithValidData() {
        Person person = new Person("Jane", "Smith", 25,
                "jane@email.com", "555-1234");

        assertEquals("Jane", person.getFirstName());
        assertEquals("Smith", person.getLastName());
        assertEquals(25, person.getAge());
        assertEquals("jane@email.com", person.getEmail());
        assertEquals("555-1234", person.getPhoneNumber());
    }

    @Test
    public void constructorWithNegativeAgeShouldThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Person("Jane", "Smith", -1,
                        "jane@email.com", "555-1234")
        );
    }

    @Test
    public void setFirstNameShouldUpdateFirstName() {
        Person person = new Person("Jane", "Smith", 25,
                "jane@email.com", "555-1234");
        person.setFirstName("Jordan");
        assertEquals("Jordan", person.getFirstName());
    }

    @Test
    public void setLastNameShouldUpdateLastName() {
        Person person = new Person("Jane", "Smith", 25,
                "jane@email.com", "555-1234");
        person.setLastName("Eldridge");
        assertEquals("Eldridge", person.getLastName());
    }

    @Test
    public void setAgeShouldUpdateAge() {
        Person person = new Person("Jane", "Smith", 25,
                "jane@email.com", "555-1234");
        person.setAge(30);
        assertEquals(30, person.getAge());
    }

    @Test
    public void setAgeWithNegativeValueShouldThrowException() {
        Person person = new Person("Jane", "Smith", 25,
                "jane@email.com", "555-1234");
        assertThrows(
                IllegalArgumentException.class,
                () -> person.setAge(-1)
        );
    }

    @Test
    public void setEmailShouldUpdateEmail() {
        Person person = new Person("Jane", "Smith", 25,
                "jane@email.com", "555-1234");
        person.setEmail("jordan@email.com");
        assertEquals("jordan@email.com", person.getEmail());
    }

    @Test
    public void setPhoneNumberShouldUpdatePhoneNumber() {
        Person person = new Person("Jane", "Smith", 25,
                "jane@email.com", "555-1234");
        person.setPhoneNumber("555-5678");
        assertEquals("555-5678", person.getPhoneNumber());
    }

    @Test
    public void getFullNameShouldReturnFirstAndLastName() {
        Person person = new Person("Jane", "Smith", 25,
                "jane@email.com", "555-1234");
        assertEquals("Jane Smith", person.getFullName());
    }

    @Test
    public void isAdultShouldReturnTrueWhenAgeIsEighteenOrOver() {
        Person person = new Person("Jane", "Smith", 18,
                "jane@email.com", "555-1234");
        assertTrue(person.isAdult());
    }

    @Test
    public void isAdultShouldReturnFalseWhenAgeIsUnderEighteen() {
        Person person = new Person("Jane", "Smith", 17,
                "jane@email.com", "555-1234");
        assertFalse(person.isAdult());
    }
}