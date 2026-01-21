import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TextTestUtils{
	
	
	public static void readTextFile(String path) {
		try {
			FileInputStream testFile = new FileInputStream(path);
			int data;
			while((data = testFile.read()) != -1) {
				System.out.print((char)data);
			}
			testFile.close();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
	public static void writeTestFile(String path) {
		try {
			FileWriter fileWrite = new FileWriter(path, true);
			fileWrite.write("\nSivaprakasam");
			fileWrite.close();
            System.out.println("\nFile written successfully");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[]) {
		String path = "TestData/DemoProject/TextData.txt";
		readTextFile((path));
		writeTestFile(path);
	}
}