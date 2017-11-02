package code;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	public List<String> showListOfCourses() throws IOException{
		
		String filename = "courses.txt";
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        List<String> courseList = new ArrayList<>();

        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }

            courseList.add(line);
        }
        
        br.close();
        return courseList;
    }




}
