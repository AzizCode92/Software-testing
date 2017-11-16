package addressbook.tests;

import static org.junit.Assert.*;
import addressbook.controller.AddressBookController;
import addressbook.controller.AddressBookControllerImpl;
import addressbook.controller.ParameterException;
import addressbook.model.Contact;
import addressbook.model.EmailAddress;
import addressbook.model.Entry;
import addressbook.model.PhoneNumber;
import addressbook.model.SizeLimitReachedException;
import addressbook.model.Gender;
import org.junit.Before;
import org.junit.Test;

public class AddressBookControllerTest {
	
	
		// Model component for the test
		AddressBookModelMockUp model;
		
		// View component for the test
		AddressBookViewMockUp view;
		
		// Controller component for the test
		AddressBookController controller;

		
		@Before
		public void setUp() {
			// Instantiate and wire components
			this.model = new AddressBookModelMockUp();
			this.view = new AddressBookViewMockUp();
			this.controller = new AddressBookControllerImpl(model, view);
	}
		
		
		
		
		
		
		
		
				
		
	
		
			
		 
}