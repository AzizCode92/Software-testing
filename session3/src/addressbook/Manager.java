/*
j * Example code used in exercises for lecture "Grundlagen des Software-Testens"
 * Created and given by Ina Schieferdecker, Theo Vassiliou and Julia Martini
 * Technische Universität Berlin
 */
package addressbook;

import java.io.File;

import addressbook.controller.AddressBookControllerImpl;
import addressbook.model.AddressBookModel;
import addressbook.model.AddressBookModelImpl;
import addressbook.view.AddressBookView;
import addressbook.view.SwingAddressBookView;


/**
 * Bootstraps and wires the application's components.
 * @author Edzard Hoefig
 */
public class Manager  {
	
	// Location of the address book file
	private static final File addressBookFile = new File("contacts.xml");
	
	/**
	 * The bootstrap method.
	 * Creates the application and starts with program execution.
	 * @param args Optional arguments for program execution. Currently not in use.
	 */
	public static void main(String[] args) {
		// Instantiate and wire components
		final AddressBookModel model = new AddressBookModelImpl(addressBookFile);
		final AddressBookView view = new SwingAddressBookView();
		new AddressBookControllerImpl(model, view);	
	}
}
