
public class TaskTimer {
	
	Stopwatch stopWatch = new Stopwatch();
	double dur;
	Runnable task;
	
	public TaskTimer(Runnable task){
		this.task = task;
		stopWatch.reset();
		stopWatch.start();
		this.task.run();
		stopWatch.stop();
		dur = stopWatch.getElapsed();
	}
	
	public double getElapsed(){
		return dur;
	}
	
	public String getTaskDetail(){
		return task.toString();
	}
	
	
	
}
