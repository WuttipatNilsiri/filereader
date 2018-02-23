
public class ReadFileBuffered extends AppendStringTask {
//	String result;
	/**
	 * initial ReadFileBuffered with file
	 * @param filename
	 */
	public ReadFileBuffered(String filename){
		super(filename);
	}
	
	@Override
	public void run(){
		super.result = ReadFile.readFileBuffered(filename);
	}
	
//	public String toString(){
//		return getClass().getSimpleName()+" size: "+result.length()+" char";
//	}
	
	
}
