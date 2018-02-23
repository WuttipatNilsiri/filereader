
import java.io.*;
import java.util.Scanner;

public class ReadFile {
	public static String readFileToString(String filename){
		File file = new File(filename);
		String string = "";
//		if (!file.exists()) {
//			throw new FileNotFoundException("file not found");
//		}
//		if (!(file.isFile() && file.canRead())) {
//			System.out.println(file.getName() + " cannot be read from.");
//			throw new FileNotFoundException("file not found");
//		}
		try {
			FileInputStream fis = new FileInputStream(file);
			char current;
			while (fis.available() > 0) {
				current = (char) fis.read();
				string = string + current;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return string;
	}
	
	public static String readFileToStringBuilder(String filename){
		File file = new File(filename);
		StringBuilder string = new StringBuilder();
//		if (!file.exists()) {
//			throw new FileNotFoundException("file not found");
//		}
//		if (!(file.isFile() && file.canRead())) {
//			System.out.println(file.getName() + " cannot be read from.");
//			throw new FileNotFoundException("file not found");
//		}
		try {
			FileInputStream fis = new FileInputStream(file);
			char current;
			while (fis.available() > 0) {
				current = (char) fis.read();
				string.append(current);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return string.toString();
	}
	
	public static String readFileBuffered(String filename){
		BufferedReader s = null;
		String init = "";
		String line;
        try {
            s = new BufferedReader(new FileReader(filename));
            while ((line = s.readLine()) != null)
            {
//               String str = s.readLine(); 
               init = init + line + "\n";
            }
            
            
        } 
        catch(IOException ex){
        	System.out.println(ex.getMessage());
        }
        finally {
            if (s != null) {
                try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        }
        return init;
	}
	
}
