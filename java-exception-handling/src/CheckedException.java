import java.net.URI;
import java.net.URISyntaxException;

public class CheckedException {

	public static void main(String[] args) {
		
		try {
			URI uri = new URI("http://www.simpllearn.com");
			System.out.println(uri.getHost());
		} catch (URISyntaxException e) {
			
			e.printStackTrace();
		}
	}
	

}
