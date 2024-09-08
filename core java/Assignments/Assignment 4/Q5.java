import java.util.Scanner;

class Toll {
	private int carrate;
	private int truckrate;
	private int motorcylerate;
	private int carcount;
	private int truckcount;
	private int motorcylecount;
	private int carpass;
	private int truckpass;
	private int motocyclepass;

	
	Toll() {
		this.carrate = 0;
		this.truckrate = 0;
		this.motorcylerate = 0;
		this.carcount = 0;
		this.truckcount = 0;
		this.motorcylecount = 0;
		this.carpass = 0;
		this.truckpass = 0;
		this.motocyclepass = 0;
	}

	
	Toll(int carrate, int truckrate, int motorcylerate, int carcount, int truckcount, int motorcylecount, int carpass, int truckpass, int motocyclepass) {
		this.carrate = carrate;
		this.truckrate = truckrate;
		this.motorcylerate = motorcylerate;
		this.carcount = carcount;
		this.truckcount = truckcount;
		this.motorcylecount = motorcylecount;
		this.carpass = carpass;
		this.truckpass = truckpass;
		this.motocyclepass = motocyclepass;
	}

	
	public int getCarrate() {
		return carrate;
	}

	public void setCarrate(int carrate) {
		this.carrate = carrate;
	}

	public int getTruckrate() {
		return truckrate;
	}

	public void setTruckrate(int truckrate) {
		this.truckrate = truckrate;
	}

	public int getMotorcylerate() {
		return motorcylerate;
	}

	public void setMotorcylerate(int motorcylerate) {
		this.motorcylerate = motorcylerate;
	}

	public int getCarcount() {
		return carcount;
	}

	public void setCarcount(int carcount) {
		this.carcount = carcount;
	}

	public int getTruckcount() {
		return truckcount;
	}

	public void setTruckcount(int truckcount) {
		this.truckcount = truckcount;
	}

	public int getMotorcylecount() {
		return motorcylecount;
	}

	public void setMotorcylecount(int motorcylecount) {
		this.motorcylecount = motorcylecount;
	}

	public int getCarpass() {
		return carpass;
	}

	public void setCarpass(int carpass) {
		this.carpass = carpass;
	}

	public int getTruckpass() {
		return truckpass;
	}

	public void setTruckpass(int truckpass) {
		this.truckpass = truckpass;
	}

	public int getMotocyclepass() {
		return motocyclepass;
	}

	public void setMotocyclepass(int motocyclepass) {
		this.motocyclepass = motocyclepass;
	}
}

class Tollutil {
	Toll t1 = new Toll();
	Scanner sc = new Scanner(System.in);

	public void acceptRecord() {
		System.out.println("Enter the car rate:");
		int carrate = sc.nextInt();
		System.out.println("Enter the truck rate:");
		int truckrate = sc.nextInt();
		System.out.println("Enter the motorcycle rate:");
		int motorcylerate = sc.nextInt();
		System.out.println("Enter the car count:");
		int carcount = sc.nextInt();
		System.out.println("Enter the truck count:");
		int truckcount = sc.nextInt();
		System.out.println("Enter the motorcycle count:");
		int motorcylecount = sc.nextInt();
		System.out.println("Enter the number of cars passed:");
		int carpass = sc.nextInt();
		System.out.println("Enter the number of trucks passed:");
		int truckpass = sc.nextInt();
		System.out.println("Enter the number of motorcycles passed:");
		int motocyclepass = sc.nextInt();

		
		t1.setCarrate(carrate);
		t1.setTruckrate(truckrate);
		t1.setMotorcylerate(motorcylerate);
		t1.setCarcount(carcount);
		t1.setTruckcount(truckcount);
		t1.setMotorcylecount(motorcylecount);
		t1.setCarpass(carpass);
		t1.setTruckpass(truckpass);
		t1.setMotocyclepass(motocyclepass);
	}

	public void printRecord() {
		System.out.println("Car rate: ₹" + t1.getCarrate() + ", Car count: " + t1.getCarcount());
		System.out.println("Truck rate: ₹" + t1.getTruckrate() + ", Truck count: " + t1.getTruckcount());
		System.out.println("Motorcycle rate: ₹" + t1.getMotorcylerate() + ", Motorcycle count: " + t1.getMotorcylecount());
		System.out.println("Cars passed: " + t1.getCarpass());
		System.out.println("Trucks passed: " + t1.getTruckpass());
		System.out.println("Motorcycles passed: " + t1.getMotocyclepass());

		
		int totalVehicles = t1.getCarcount() + t1.getTruckcount() + t1.getMotorcylecount();
		System.out.println("Total vehicles passed: " + totalVehicles);

		
		int totalCarCash = t1.getCarcount() * t1.getCarrate();
		int totalTruckCash = t1.getTruckcount() * t1.getTruckrate();
		int totalMotorcycleCash = t1.getMotorcylecount() * t1.getMotorcylerate();
		int totalCashCollected = totalCarCash + totalTruckCash + totalMotorcycleCash;

		System.out.println("Total cash collected from cars: ₹" + totalCarCash);
		System.out.println("Total cash collected from trucks: ₹" + totalTruckCash);
		System.out.println("Total cash collected from motorcycles: ₹" + totalMotorcycleCash);
		System.out.println("Total cash collected: ₹" + totalCashCollected);
	}
}

public class Q5 {
	public static void main(String[] args) {
		Tollutil tollUtil = new Tollutil();
		tollUtil.acceptRecord();
		tollUtil.printRecord();
	}
}
