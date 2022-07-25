
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//Optimize using the parelel streams
public class JavaReadFiles {
	public static void main(String[] args) {
		 Path myPath = Paths.get("m://ListTextFileFile.java");

	        List < String > lines = Files.readAllLines(myPath, StandardCharsets.UTF_8);

	        for(String i :lines) {
	        	
	        	System.out.println(line));
	        }

}
