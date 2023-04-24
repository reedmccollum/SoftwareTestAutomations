package contactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactListInsert() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		assertTrue(currService.getContact(0).getContactId().equals("ContactId1"));
	}
	
	@Test
	void testContactListInsertSameIdTwice() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		Contact newContact2 = new Contact("ContactId1","Al2","Adkins2","0000000002","second@here.com");
		currService.addContact(newContact1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			currService.addContact(newContact2);
		});
		
	}
	@Test
	
	void testContactListInsertMultiple() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		assertTrue(currService.getContact(0).getContactId().equals("ContactId1"));
		Contact newContact2 = new Contact("ContactId2","Al2","Adkins2","0000000002","first2@here.com");
		currService.addContact(newContact2);
		assertTrue(currService.getContact(1).getContactId().equals("ContactId2"));
	}
	
	@Test
	void testContactListDelete() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		assertTrue(currService.getContact(0).getContactId().equals("ContactId1"));
		currService.deleteContact("ContactId1");
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			currService.getContact(0).getContactId();
		});
	}
	
	@Test
	void testContactListDeleteIdNotFound() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		assertTrue(currService.getContact(0).getContactId().equals("ContactId1"));
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			currService.deleteContact("ContactId2");
		});
	}
	
	@Test
	void testContactListUpdateFirstName() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		currService.updateFirstName("ContactId1", "UPDATED");
		assertTrue(currService.getContact(0).getFirstName().equals("UPDATED"));
	}
	
	@Test
	void testContactListUpdateFirstNameTooLong() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			currService.updateFirstName("ContactId1", "UPDATED1234");
		});

		}
	
	@Test
	void testContactListUpdateFirstNameIdNotFound() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			currService.updateFirstName("ContactId2", "UPDATED");
		});

		}
	
	@Test
	void testContactListUpdateLastName() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		currService.updateLastName("ContactId1", "UPDATED");
		assertTrue(currService.getContact(0).getLastName().equals("UPDATED"));
	}
	
	@Test
	void testContactListUpdateLastNameTooLong() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			currService.updateLastName("ContactId1", "UPDATED1234");
		});

		}
	@Test
	void testContactListUpdateLastNameIdNotFound() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			currService.updateLastName("ContactId2", "UPDATED");
		});

		}
	@Test
	void testContactListUpdatePhone() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		currService.updatePhone("ContactId1", "UPDATED");
		assertTrue(currService.getContact(0).getPhone().equals("UPDATED"));
	}
	
	@Test
	void testContactListUpdatePhoneTooLong() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			currService.updatePhone("ContactId1", "UPDATED1234");
		});

		}
	
	@Test
	void testContactListUpdatePhoneIdNotFound() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			currService.updatePhone("ContactId2", "UPDATED");
		});
		
		}
	@Test
	void testContactListUpdateAddress() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		currService.updateAddress("ContactId1", "UPDATED");
		assertTrue(currService.getContact(0).getAddress().equals("UPDATED"));
	}
	
	@Test
	void testContactListUpdateAddressTooLong() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			currService.updateAddress("ContactId1", "UPDATED123456789012345678901234567890");
		});

		}
	
	@Test
	void testContactListUpdateAddressIdNotFound() {
		ContactService currService = new ContactService();
		Contact newContact1 = new Contact("ContactId1","Al","Adkins","0000000001","first@here.com");
		currService.addContact(newContact1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			currService.updateAddress("ContactId2", "UPDATED");
		});
		
		}
	

}
