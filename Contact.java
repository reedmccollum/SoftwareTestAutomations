package contactService;

class Contact {
	private String contactId = "";
	private String firstName = "";
	private String lastName = "";
	private String phone = "";
	private String address = "";
	
	
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if(phone == null || phone.length() > 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	
	public String getContactId() {
		return this.contactId;
	}
	
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
	public void setPhone(String phone) {
		if(phone == null || phone.length() > 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.phone = phone;
	}
	public String getPhone() {
		return this.phone;
	}
	
	public void setAddress(String address) {
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
}
