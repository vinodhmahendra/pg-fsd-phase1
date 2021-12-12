import java.io.File;
import java.io.IOException;

public class WorkingWithFile {

	public static void main(String[] args) throws IOException {
		File myDir = new File("MyDocs");
		
		if ( myDir.mkdir() ) {
			System.out.println("the directory is created");
		}else {
			System.out.println("the directory is already exists");
		}
		File subDir  = new File (myDir,"subdir");
		subDir.mkdir();
		File myFile = new File (myDir,"myFile.txt");
		myFile.createNewFile();
		
		System.out.println("Name: " + myFile.getName());
		System.out.println("Path: "+ myFile.getPath());
		System.out.println("AbsolutePath : " + myFile.getAbsolutePath());
		System.out.println("Parent: " + myFile.getParent());
		System.out.println("Last Modified : " +myFile.lastModified());
		System.out.println("Length:" +myFile.length());
		
		//rename the file
		myFile.renameTo(new File(myDir,"sample.txt"));
		
		File d = new File(myDir,"sample.txt");
		if ( d.delete()) {
			System.out.println(d.getName() + " Deleted");
		}else {
			System.out.println("Failed");
		}
	}

}
