/*
 * Example code used in exercises for lecture "Grundlagen des Software-Testens"
 * Created and given by Ina Schieferdecker, Theo Vassiliou and Julia Martini
 * Technische Universität Berlin
 */
package addressbook.model;

/**
 * Raised when the data model already contains a datum with a similar label.
 * @author Edzard Hoefig
 */
public class SizeLimitReachedException extends Exception {
	
	// For serialisation purposes (having it keeps java happy)
	private static final long serialVersionUID = 5722947736920796262L;

	/**
	 * Parametrized Ctor.
	 * @param message A message that indications the condition for the raised exception
	 */
	public SizeLimitReachedException(final String message) {
		super(message);
	}
	
}
