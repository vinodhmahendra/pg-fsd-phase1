import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedStreams {

	public static void main(String[] args) {
		try {
			//input stream chaining
			FileReader input = new FileReader("file1");
			BufferedReader bufInput = new BufferedReader(input);
			
			try {
				//output stream chaining
				FileWriter output = new FileWriter("file2");
				BufferedWriter bufOutput = new BufferedWriter(output);
				
				try {
					String line;
					
					//read the first line
					line = bufInput.readLine();
					while ( line != null) {
						//write the lie out to the output file
						bufOutput.write(line,0,line.length());
						bufOutput.newLine();
						//read the next line
						line = bufInput.readLine();
					}
				}finally {
					bufOutput.close();
				}
			}finally {
				bufInput.close();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
