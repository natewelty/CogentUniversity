import java.util.ArrayList;
import java.util.List;

public class Hello3 {
	public static void main(String[] args) {
		int[] arrival= {1,3,3,5,7};
		int[] duration = {2,2,1,2,1};
		Hello3 hello = new Hello3();
		hello.solveSchedule(arrival, duration);
	}
	
	public void solveSchedule(int[] arrival, int[] duration){
		List<TimeBlock> times = new ArrayList<>();
		for(int i=0;i<arrival.length;i++) {
			times.add(new TimeBlock(arrival[i],duration[i]));
		}
		int numberOfPresentations = checkConflicts(times);
		System.out.println("The maximum presentations is " + numberOfPresentations);
		
	}
	public int checkConflicts(List<TimeBlock> times) { //use recursion
		boolean failed = false;
		int maxSuccess = 0;
		for(int i=0;i<times.size()-1;i++) {
			if (times.get(i).intersects(times.get(i+1))) {
				failed = true;
				//System.out.println(times.get(i) + " intersects " + times.get(i+1));
				break;
			}
		}
		if(failed == false) {
			if(maxSuccess<times.size()) {
				maxSuccess = times.size();
			}
			//System.out.println("Max number of presentations is at least " + times.size());
			
		}
		else if (times.size()>1){
			//System.out.println("Going down to " + (times.size()-1));
			for(int i = 0; i<times.size();i++) {
				if(times.size()==5) {
					//System.out.println("Removing block " +i);
					if(i ==1) {
						//System.out.println(times);
					}
				}
				List<TimeBlock> newTimes = new ArrayList<>();
				newTimes.addAll(times);
				newTimes.remove(i);
				int newSuccess = checkConflicts(newTimes);
				if(newSuccess>maxSuccess) {
					maxSuccess=newSuccess;
				}
			}
		}
		return maxSuccess;
		
	}
	
}
class TimeBlock {
	int startTime;
	int endTime;
	
	public boolean intersects(TimeBlock other) {
		if (this.startTime<other.endTime && other.startTime < this.endTime) {
			return true;
		}
		else if (this.endTime>other.startTime) {
			return true;
		}
		return false;
	}
	public TimeBlock(int arrival, int duration) {
		this.startTime=arrival;
		this.endTime = arrival+duration;
	}
	@Override
	public String toString() {
		return "TimeBlock [startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
}