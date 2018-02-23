
public class ReadFileBuffered extends AppendStringTask {
	String result;
	public ReadFileBuffered(String filename){
		super(filename);
	}
	
	public void run(){
		result = ReadFile.readFileBuffered(filename);
	}
	
	public String toString(){
		return getClass().getSimpleName()+" size: "+result.length()+" char";
	}
	
	
}
