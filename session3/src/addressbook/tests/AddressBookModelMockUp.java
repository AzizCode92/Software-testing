package addressbook.tests;
import java.io.IOException;
import java.util.Collection;

import addressbook.model.AddressBookModel;
import addressbook.model.Entry;
import addressbook.model.SizeLimitReachedException;

public class AddressBookModelMockUp implements AddressBookModel {
	private static final int  SIZELIMIT = 10 ;
	private int count = 0 ;
	boolean addentryanswer = true;
	
	@Override
	public boolean addEntry(Entry entry) throws SizeLimitReachedException {
		// TODO Auto-generated method stub
		
		if (SIZELIMIT < count ){
			throw new SizeLimitReachedException("");
		}
		
		++count  ;
		return addentryanswer;
	}

	@Override
	public Entry getEntry(String surName, String firstName) {
		// TODO Auto-generated method stub
		return null ;
	}

	@Override
	public Collection<Entry> getEntries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEntry(Entry entry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
