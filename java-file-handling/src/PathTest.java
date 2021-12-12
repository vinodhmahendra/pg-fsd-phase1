import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		
		Path path = Paths.get("/home/vinodhmahendrag/file1.txt");
		
		System.out.format("Get File Name:%s%n ", path.getFileName());
		System.out.format("Get  Parent: %s%n",path.getParent());
		System.out.format("Get Name Count : %s %n", path.getNameCount());
		System.out.format("Get Root: %s %n",path.getRoot());
		
		System.out.format("Is Absolute : %b%n", path.isAbsolute());
		
		System.out.format("To Absolute Path : %s%n", path.toAbsolutePath());
		System.out.format("To URI : %s%n", path.toUri());

	}

}
