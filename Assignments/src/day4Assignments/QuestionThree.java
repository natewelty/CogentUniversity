package day4Assignments;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class QuestionThree {

	public static void main(String[] args) throws IOException{
	       
         
        File src = new File("C:/Users/nate/Documents/demo.txt");
        File dest = new File("C:/Users/nate/Documents/demo2.txt");
             
        
        Files.copy(src.toPath(), dest.toPath());
       
        
             
    }

}
