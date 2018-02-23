
public class ReadFileToStringBuilder extends AppendStringTask {
//	String result;
	/**
	 * initial ReadFileToStringBuilder with file
	 * @param filename
	 */
	public ReadFileToStringBuilder(String filename) {
		super(filename);
		
	}
	@Override
	public void run(){
		super.result =  ReadFile.readFileToStringBuilder(filename);
	}
	
//	public String toString(){
//		return getClass().getSimpleName()+" size: "+result.length()+" char";
//	}
}