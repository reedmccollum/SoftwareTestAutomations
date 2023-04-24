package contactService;

import java.util.Arrays;

class ContactService{
	
	private Contact[] contactList = {};
	
	public ContactService() {
		
	}
	
	public void addContact(Contact newContact) {
		
		for(Contact currContact: contactList) {
			if(newContact.getContactId().equals(currContact.getContactId())) {
				throw new IllegalArgumentException("Contact ID in use");
			}
		}
		
		contactList = Arrays.copyOf(contactList, (contactList.length + 1));
		contactList[contactList.length - 1] = newContact;
	}
	
	public void deleteContact(String contactId) {
		
		Contact[] newContactList = {};
		
		for(Contact currContact: contactList) {
			if(!contactId.equals(currContact.getContactId())) {
				newContactList = Arrays.copyOf(newContactList, (newContactList.length + 1));
				newContactList[newContactList.length-1] = currContact;
			}
		}
		if(newContactList.length == contactList.length) {
			throw new IllegalArgumentException("Contact ID not in use");
		}
		
		contactList = newContactList;
		
		
	}
	
	
	public Contact getContact(int arrPlacement) {
		return contactList[arrPlacement];
	}
	
	public void updateFirstName(String contactId, String firstName) {
		for(Contact currContact: contactList) {
			if(contactId.equals(currContact.getContactId())) {
				currContact.setFirstName(firstName);
				return;
			}
		}
		throw new IllegalArgumentException("Contact ID not in use");
		
	}

	
	
	public void updateLastName(String contactId, String lastName) {
		for(Contact currContact: contactList) {
			if(contactId.equals(currContact.getContactId())) {
				currContact.setLastName(lastName);
				return;
			}
		}
		throw new IllegalArgumentException("Contact ID not in use");
		
	}
	public void updatePhone(String contactId, String phone) {
		for(Contact currContact: contactList) {
			if(contactId.equals(currContact.getContactId())) {
				currContact.setPhone(phone);
				return;
			}
		}
		throw new IllegalArgumentException("Contact ID not in use");
		
	}
	public void updateAddress(String contactId, String address) {
		for(Contact currContact: contactList) {
			if(contactId.equals(currContact.getContactId())) {
				currContact.setAddress(address);
				return;
			}
		}
		throw new IllegalArgumentException("Contact ID not in use");
		
	}
}
