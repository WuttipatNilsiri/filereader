

public class ReadFileToString extends AppendStringTask {
	String result;
	public ReadFileToString(String filename) {
		super(filename);
	}
	
	
	public void run(){
		result = ReadFile.readFileToString(filename);
	}
	
	public String toString(){
		return getClass().getSimpleName()+" size: "+result.length()+" char";
	}
}
