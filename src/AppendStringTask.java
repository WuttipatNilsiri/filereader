/**
 * AppendStringTask parent class for String Reading classes
 * @author Wuttipat Nilsiri
 *
 */
public class AppendStringTask implements Runnable {
	String filename = "";
	String result = "";
	/**
	 * initial task with file
	 * @param filename
	 */
	AppendStringTask(String filename){
		this.filename = filename;
	}
	/**
	 * to know task detail
	 */
	public String toString(){
		return filename+" "+getClass().getSimpleName()+" size: "+result.length()+" char";
	}
	
	@Override
	public void run() {
		//plz do it sub class 
	}
}
