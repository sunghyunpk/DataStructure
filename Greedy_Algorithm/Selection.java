import java.util.*;

public class Selection implements Comparable<Selection> {
	private String classroom;
	private double meetingTime; 
	private double endTime;
	
	public Selection() {
		classroom = "";
		meetingTime = 0;
		endTime = 0;
	}
	public Selection(String classroom, double meetingTime, double endTime) {
		this.classroom = classroom;
		this.meetingTime = meetingTime;
		this.endTime = endTime;		
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public void setMeetingTime(double meetingTime) {
		this.meetingTime = meetingTime;
	}
	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}
	public String getClassroom() {
		return classroom;
	}
	public double getMeetingTime() {
		return meetingTime;
	}
	public double getEndTime() {
		return endTime;
	}
	@Override
	public int compareTo(Selection other) {
		if (getEndTime() < other.getEndTime()) {
			return -1;
		}
		else if (getEndTime() > other.getEndTime()) {
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		PriorityQueue<Selection> SL = new PriorityQueue<Selection>();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for (int k = 0; k <i; k++) {
			String s = sc.next();
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			Selection sl = new Selection(s, a, b);
			SL.add(sl);
		}
		double lastendTime = 0;
		while(!SL.isEmpty()) {
			Selection s2 = SL.poll();
			if (s2.meetingTime < lastendTime) {
			}
			else if (s2.meetingTime >= lastendTime) {
				System.out.println(s2.classroom + " " + s2.meetingTime + " " + s2.endTime + " ");
				lastendTime = s2.getEndTime();
			}
		
			
		}
		
	}
}