

public class ReadFileToString extends AppendStringTask {
//	String result;
	/**
	 * initial ReadFileToString with file
	 * @param filename
	 */
	public ReadFileToString(String filename) {
		super(filename);
	}
	
	@Override
	public void run(){
		super.result = ReadFile.readFileToString(filename);
	}
	
//	public String toString(){
//		return getClass().getSimpleName()+" size: "+result.length()+" char";
//	}
}
