/*
 * Example code used in exercises for lecture "Grundlagen des Software-Testens"
 * Created and given by Ina Schieferdecker, Theo Vassiliou and Julia Martini
 * Technische Universität Berlin
 */
package addressbook.controller;

import addressbook.model.PersistentStorageAccess;
import addressbook.model.SizeLimitReachedException;

/**
 * Defines actions that can be invoked on the controller.
 * @author Edzard Hoefig
 */
public interface AddressBookController extends PersistentStorageAccess {

	/**
	 * Triggers adding an contact entry.  
	 * The controller should not add malformed entries to the address book.
	 * @param firstName The first name for the contact entry
	 * @param lastName The last name for the contact entry
	 * @param gender The gender for the contact entry: either "M" or "F"
	 * @param phoneContactInformation The contact number. Needs to be a positive number and has to consist of only digits. If emailContactInformation is set, this parameter needs to be null
	 * @param emailContactInformation The email address. If phoneContactInformation is set, this parameter needs to be null
	 * @throws ParameterException In case that a parameter is incorrect. An entry in the address book has not been made
	 * @throws SizeLimitReachedException When the address book is full
	 */
	void add(String firstName, String lastName, String gender, String phoneContactInformation, String emailContactInformation) throws ParameterException, SizeLimitReachedException;
	
	/**
	 * Triggers removal of an contact entry.
	 * @param entry The number of the entry (starts counting at 0, alphabetical order of entries)
	 */
	void remove(int entry);
	
	/**
	 * Triggers clearing of the whole address book.
	 */
	void erase();
}
