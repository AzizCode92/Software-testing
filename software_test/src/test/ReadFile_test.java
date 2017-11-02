package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import code.ReadFile;

public class ReadFile_test {

	@Test
	public void test() {
		ReadFile object1 = new ReadFile();
		try {
			List<String> result = object1.showListOfCourses();
			List<String> reader = Arrays.asList("Machine Learning", "Text-Mining", "Software-testing");
			assertEquals(reader,result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
