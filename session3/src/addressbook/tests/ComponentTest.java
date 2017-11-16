package addressbook.tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import java.io.*;

import addressbook.model.AddressBookModelImpl;
import addressbook.model.Contact;
import addressbook.model.Entry;
import addressbook.model.Gender;
import addressbook.model.SizeLimitReachedException;
public class ComponentTest {
	
	private AddressBookModelImpl bookaccess ; 
	
	@Rule
	public TemporaryFolder tempFolder = new TemporaryFolder();
	
	@Before
    public void testTempFileWithRule() throws IOException {
		File contact  = tempFolder.newFile("contemp.xml");
		/*
		File src = new File("contacts.xml");
		assertTrue(contact.isFile());
		assertEquals(tempFolder.getRoot(), contact.getParentFile());
		FileChannel source_file = new FileInputStream(src).getChannel();
		FileChannel dest_file = new FileOutputStream(contact).getChannel();
		dest_file.transferFrom(source_file, 0, source_file.size());
		source_file.close();
		dest_file.close();*/ 
		// an empty file satisfy our need :) 
		bookaccess = new AddressBookModelImpl(contact);
	}
	
	/* test for AddEntry */
	@Test
	public void AddEntry_test() throws SizeLimitReachedException{
		
		Entry entry = new Entry ("Aziz","Ben Othman",Gender.Male, new Contact(){});
		assertTrue(bookaccess.addEntry(entry));
	}
	
	/*test for multiple Entries
	 * Limit is 10
	 *  */
	@Test
	public void AddMuEntry_test() throws SizeLimitReachedException{
		
		
		for (int i = 0 ; i < 10 ; i++)
		{
			Entry entry = new Entry ("Aziz","ben othman" + i,Gender.Male, new Contact(){});
			assertTrue(bookaccess.addEntry(entry));
			
		}
	
	}
	
	/* Test for getEntry */
	@Test
	public void getEntry_test() throws SizeLimitReachedException{
		Entry entry = new Entry("Aziz","Ben",Gender.Male,new Contact(){});
		assertEquals("Ben",entry.getFirstName());
		assertEquals("Aziz",entry.getSurName());
	}
	
	/* Test for deleteEntry */ 
	@Test
	public void deleteEntry_test() throws SizeLimitReachedException{
		Entry entry = new Entry("Aziz","Ben OThman",Gender.Male,new Contact(){});
		assertTrue(bookaccess.addEntry(entry));
		assertTrue(bookaccess.deleteEntry(entry));
		
	}
	
	/* Test for multiple deletion of entries */
	@Test
	public void deletEntries_test() throws SizeLimitReachedException{
		
		for (int i = 0 ; i< 10 ; i++){
			Entry entry = new Entry("foo","foo"+i,Gender.Female,new Contact(){});
			assertTrue(bookaccess.addEntry(entry));
			assertTrue(bookaccess.deleteEntry(entry));
		}
	}
	
	/* Test for two entries with the same surname */ 
	/* SHOULD FAIL */ 
	
	@Test
	public void sameEntry_test() throws SizeLimitReachedException {
		
		Entry entry1 = new Entry ("foo","oof",Gender.Female,new Contact(){});
		Entry entry2 = new Entry("foo","oof",Gender.Female,new Contact(){});
		assertTrue(bookaccess.addEntry(entry1));
		assertTrue(bookaccess.addEntry(entry2));
		
	}
	
	
}
