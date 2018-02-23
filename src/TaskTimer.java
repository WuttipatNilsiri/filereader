
public class TaskTimer {
	
	Stopwatch stopWatch = new Stopwatch();
	double dur;
	Runnable task;
	/**
	 * initial TaskTimer with Runnable
	 * @param task that have run() method
	 */
	public TaskTimer(Runnable task){
		this.task = task;
		stopWatch.reset();
		stopWatch.start();
		this.task.run();
		stopWatch.stop();
		dur = stopWatch.getElapsed();
	}
	/**
	 * to Know Elapsed
	 * @return
	 */
	public double getElapsed(){
		return dur;
	}
	/**
	 * to Know Task detail
	 * @return
	 */
	public String toString(){
		return task.toString();
	}
	
	
	
}
