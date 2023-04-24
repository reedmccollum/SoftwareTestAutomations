package contactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ContactTest {
	
	@Test
	void testContactClass() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		assertTrue(newContact.getContactId().equals("AContactId"));
		assertTrue(newContact.getFirstName().equals("AFirstName"));
		assertTrue(newContact.getLastName().equals("ALastName"));
		assertTrue(newContact.getPhone().equals("1234567890"));
		assertTrue(newContact.getAddress().equals("someone@place.com"));
	}
	
	@Test
	void testContactClassContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("AAContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		});
	}
	
	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("AContactId","AAFirstName","ALastName", "1234567890", "someone@place.com");
		});
	}
	
	@Test
	void testContactClassLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("AContactId","AFirstName","AAALastName", "1234567890", "someone@place.com");
		});
	}
	
	@Test
	void testContactClassPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("AContactId","AFirstName","AALastName", "123456789000", "someone@place.com");
		});
	}
	
	@Test
	void testContactClassAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("AContactId","AFirstName","AALastName", "1234567890", "someone@place.com0321654987032165496874");
		});
	}
	
	@Test
	void testContactClassSetFirstName() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		newContact.setFirstName("UPDATED");
		assertTrue(newContact.getFirstName().equals("UPDATED"));
	}
	
	@Test
	void testContactClassSetFirstNameTooLong() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName("UPDATEDLONG");
		});
	}
	
	@Test
	void testContactClassSetFirstNameAsNull() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setFirstName(null);
		});
	}
	
	@Test
	void testContactClassSetLastName() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		newContact.setLastName("UPDATED");
		assertTrue(newContact.getLastName().equals("UPDATED"));
	}
	
	@Test
	void testContactClassSetLastNameTooLong() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setLastName("UPDATEDLONG");
		});
	}
	
	@Test
	void testContactClassSetLastNameAsNull() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setLastName(null);
		});
	}
	
	@Test
	void testContactClassSetPhone() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		newContact.setPhone("UPDATED");
		assertTrue(newContact.getPhone().equals("UPDATED"));
	}
	
	@Test
	void testContactClassSetPhoneTooLong() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhone("UPDATEDLONG");
		});
	}
	
	@Test
	void testContactClassSetPhoneAsNull() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setPhone(null);
		});
	}
	
	@Test
	void testContactClassSetAddress() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		newContact.setAddress("UPDATED");
		assertTrue(newContact.getAddress().equals("UPDATED"));
	}
	
	@Test
	void testContactClassSetAddressTooLong() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setAddress("UPDATEDLONG12345678901234567890");
		});
	}
	
	@Test
	void testContactClassSetAddressAsNull() {
		Contact newContact = new Contact("AContactId","AFirstName","ALastName", "1234567890", "someone@place.com");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			newContact.setAddress(null);
		});
	}

}
