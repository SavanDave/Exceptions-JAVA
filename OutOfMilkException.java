import java.util.Arrays;

public class OutOfMilkException extends Exception {
	private long timeOfException;
	private long start;
	
	
	public OutOfMilkException(long start) {
		setTimeOfException(timeOfException);
		setStart(start);
	}
	

	public long getStart() {
		return start;
	}


	public void setStart(long start) {
		this.start = start;
	}


	public long getTimeOfException() {
		return timeOfException;
	}


	public void setTimeOfException(long timeOfException) {
		this.timeOfException = System.currentTimeMillis();
	}


	@Override
	public String toString() {
		return "OutOfMilkException occured at: "+getTimeOfException();
	}
	
	
}
