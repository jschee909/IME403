import java.math.*;


public class HydrogenStation {
	int cost, time;
	
	public HydrogenStation(int cost, int time) {
		this.cost = cost;
		this.time = time;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public long calculateCost(long l, long x){
		
		if (x == 0){
			return l;
		}
		return  (long)(l / Math.pow(1.1, x));
	}
	public long[] buildThem(int num){
		long[] x = {0,0,0};
		long counter = 0;
		double realNum = 1;
		long partNum = (long) realNum;
		
		
		while (counter < num){
			if (x[0] >= 52){
				x[0] = x[0] - 52;
				System.out.println("Year: " + x[1] + "   Cost: " + x[2] );
				x[1]++;
			}
			x[0]= x[0] + time;
			
			counter = counter + partNum;
			
			if (partNum < 30){
				realNum = realNum * 1.01;
				partNum = (int) realNum;
			}
			if (partNum > 30){
				partNum = 30;
			}
			
			x[2] =  x[2] + calculateCost(partNum*cost, x[1]);

		}
		return x;
	}
	
}
