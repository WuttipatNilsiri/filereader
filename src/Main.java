
public class Main {
	public static void main(String[] q){
		String file = "C://workspace P2//StopWatch//src//Alice-in-Wonderland.txt";
		String file2 = "C://workspace P2//StopWatch//src//Alice-in-Wonderland-big.txt";
		TaskTimer tasktimer = new TaskTimer(new ReadFileToString(file2));
		
		System.out.printf(tasktimer.getTaskDetail()+" dur: %.6f\n",tasktimer.getElapsed());
		tasktimer = new TaskTimer(new ReadFileToStringBuilder(file2));
		System.out.printf(tasktimer.getTaskDetail()+" dur: %.6f\n",tasktimer.getElapsed());
		tasktimer = new TaskTimer(new ReadFileBuffered(file2));
		System.out.printf(tasktimer.getTaskDetail()+" dur: %.6f\n",tasktimer.getElapsed());

	}
}
