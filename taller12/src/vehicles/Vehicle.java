package vehicles;

public class Vehicle {
	
	public static String MAKE = "Augur";
	public static int numVehicles = 0;
	private int ChasisNo;
	private String Model;
	


	private Vehicle(String model) {
		numVehicles = 1;
		ChasisNo = numVehicles;
		this.Model = Model;
		System.out.print("Vehicle Manufactured");
		
		Model = model;
		
		
	}



	public int getChasisNo() {
		return ChasisNo;
	}



	public void setChasisNo(int chasisNo) {
		ChasisNo = chasisNo;
	}



	public String getModel() {
		return Model;
	}



	public void setModel(String model) {
		Model = model;
	}

	

	

}