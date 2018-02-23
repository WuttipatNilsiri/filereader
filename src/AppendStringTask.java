
public class AppendStringTask implements Runnable {
	String filename;
	
	AppendStringTask(String filename){
		this.filename = filename;
	}
	
	String readFile(){
		return filename;
	}
	
	public void run(){
		readFile();
	}
	
	public String toString(){
		return readFile();
	}
}
