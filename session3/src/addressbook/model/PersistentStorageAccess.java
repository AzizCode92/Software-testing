/*
 * Example code used in exercises for lecture "Grundlagen des Software-Testens"
 * Created and given by Ina Schieferdecker, Theo Vassiliou and Julia Martini
 * Technische Universität Berlin
 */
package addressbook.model;

import java.io.IOException;

/**
 * Defines methods for triggering persistent storage operations
 * @author Edzard Hoefig
 */
public interface PersistentStorageAccess {

	/**
	 * Load data from persistent file storage.
	 * @throws IOException When file loading failed
	 */
	void load() throws IOException;
	
	/**
	 * Write data to persistent storage.
	 * @throws IOException When the file could not be written to
	 */
	void save() throws IOException;
	
}
