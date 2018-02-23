
public class ReadFileToStringBuilder extends AppendStringTask {
	String result;
	public ReadFileToStringBuilder(String filename) {
		super(filename);
		
	}

	public void run(){
		result =  ReadFile.readFileToStringBuilder(filename);
	}
	
	public String toString(){
		return getClass().getSimpleName()+" size: "+result.length()+" char";
	}
}