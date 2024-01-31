import org.junit.Test;
import static org.junit.Assert.*;

public class PhoneBookTest {

   @Test
    public void testsetName(){
    phoneBook phonebook = new phoneBook();
	phoneBook.setName("John Doe");
   asserEquals("JohnDoe",phoneBook.getName());

    @Test
    public void testAddEntry() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("John Doe", "123-456-7890");

        assertEquals(1, phoneBook.getAllEntries().size());
    }

    @Test
    public void testFindPhoneNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("John Doe", "123-456-7890");

        String phoneNumber = phoneBook.findPhoneNumber("John Doe");

        assertEquals("123-456-7890", phoneNumber);
    }

    @Test
    public void testFindPhoneNumberNotFound() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("John Doe", "123-456-7890");

        String phoneNumber = phoneBook.findPhoneNumber("Jane Doe");

        assertEquals("Entry not found", phoneNumber);
    }

    @Test
    public void testAddMultipleEntries() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("John Doe", "123-456-7890");
        phoneBook.addEntry("Jane Doe", "987-654-3210");

        assertEquals(2, phoneBook.getAllEntries().size());
    }

    @Test
    public void testFindPhoneNumberCaseInsensitive() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("John Doe", "123-456-7890");

        String phoneNumber = phoneBook.findPhoneNumber("john doe");

        assertEquals("123-456-7890", phoneNumber);
    }

    @Test
    public void testFindPhoneNumberWithMultipleEntries() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("John Doe", "123-456-7890");
        phoneBook.addEntry("Jane Doe", "987-654-3210");

        String phoneNumber = phoneBook.findPhoneNumber("Jane Doe");

        assertEquals("987-654-3210", phoneNumber);
    }

    @Test
    public void testFindPhoneNumberWithSpecialCharacters() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("John Doe", "123-456-7890");

        String phoneNumber = phoneBook.findPhoneNumber("John@Doe");

        assertEquals("Entry not found", phoneNumber);
    }

    @Test
    public void testGetAllEntries() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("John Doe", "123-456-7890");
        phoneBook.addEntry("Jane Doe", "987-654-3210");

        assertEquals(2, phoneBook.getAllEntries().size());
    }
}