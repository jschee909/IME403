
public class Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HydrogenStation station1 = new HydrogenStation(500000,1);
		
		long[] status = station1.buildThem(13500);
		
		System.out.println( "Total Time: " + status[0] + " weeks " + status[1] + " years  Total Cost: " + status[2]);
		
		
		
		ElectricStation station2 = new ElectricStation(50000, 1);
		
		long[] status2 = station2.buildThem(13500);
		
		System.out.println( "Total Time: " + status2[0] + " weeks " + status2[1] + " years  Total Cost: " + status2[2]);
	}

}
