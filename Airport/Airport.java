import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;


public class Airport {
		static Queue<Integer>  landings = new LinkedList<Integer>();
		static Queue<Integer>  takeoffs = new LinkedList<Integer>();
	   
	   int landing = 15;
	   int takeoff = 15;
	   int runWayTime = 15;
	   int runningTime = 120;
	   int interval = 5;
	   int oldTime = 0;
	   int averageTime = 0;
	   int time = 0;
	   static int runway1 = 0;
	   static int runway2 = 0;
	   List<Integer> waitingTime1 = new ArrayList<Integer>();
	   List<Integer> waitingTime2 = new ArrayList<Integer>();
	   
	  
	   public void Simulate() {
		   for (time = 0; time < runningTime; time += interval ) {
			   //generate landing or takeoff requests
			   Random r = new Random();
			   int k = r.nextInt(2); 
			   	if (k == 0) {
			   		landings.offer(time);
			   	}
			  	else if (k == 1) {
			   		takeoffs.offer(time);	
			   	}
			   	//check each of the runways, and prosecute the landing/takeoff requests if runway becomes availalbe
			  	
			   	if (!landings.isEmpty() && runway1 == 0) {
			  		oldTime = landings.poll();
			  		waitingTime1.add(time - oldTime);
			  		runway1 = runWayTime; 
			  	}
			  	if (!landings.isEmpty() && runway2 ==0) {
			  		oldTime = landings.poll();
			  		waitingTime1.add(time - oldTime);
			  		runway2 = runWayTime;
			  	}
			   	
			   	if (!takeoffs.isEmpty() && runway1 == 0) {
			  		oldTime = takeoffs.poll();
			  		waitingTime2.add(time - oldTime);
			  		runway1 = runWayTime; 
			  	}
			  	if (!takeoffs.isEmpty() && runway2 == 0) {
			  		oldTime = takeoffs.poll();
			  		waitingTime2.add(time - oldTime);
			  		runway2 = runWayTime;
			  	}
			   	
			   	if (runway1 > 0)
			   		runway1 -= interval;

			   	if (runway2 > 0)
			   		runway2 -= interval;

			  
			   	
                		   
		   }
		   int sum1 = 0;
		   for (int i = 0; i < waitingTime1.size(); i ++) {
			   sum1 += waitingTime1.get(i);
		   }
		   int totalLanding = waitingTime1.size();
		   int avg1 = 0;
		   if (totalLanding == 0)
			   avg1 = 0;
		   else
		   avg1 = sum1 / totalLanding;
		   
		   int sum2 = 0;
		   for (int j = 0; j < waitingTime2.size(); j++) {
			   sum2 += waitingTime2.get(j);
		   }
		   int totaltakeoff = waitingTime2.size();
		   int avg2 = 0;
		   if (totaltakeoff == 0)
			   avg2 = 0;
		   else
		   avg2 = sum2 / totaltakeoff;
		   
		   
		   System.out.println("Average Time for landing: " + avg1);
		   System.out.println("Average TIme for takeoff: " + avg2);
		   
		   
		  
	   }
	   
			   
	   
	  
	   public static void main(String[] args) {
		   Airport test = new Airport();
		   test.Simulate();
		   System.out.println("The total numebr of landing is: " + landings.size());
		   System.out.println(landings);
		   System.out.println("The total number of takeoffs is: " + takeoffs.size());
		   System.out.println(takeoffs);

		 
	   }
	   
	      
	   
	  
	   
	   
	   
	   
	   
	 
	
}