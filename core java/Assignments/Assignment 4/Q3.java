import java.util.Scanner;

class BMITracker {
	private int height;
	private int weight;
	
	public BMITracker() {
		this.height=0;
		this.weight=0;
	}
	
	 BMITracker(int height, int weight) {
		this.height=height;
		this.weight=weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	 
	public int BMICalculation() {
		
		return this.weight / (this.height * this.height);
		
	}
	 
}


class BMITrackerUtil {
	BMITracker bmi = new BMITracker();
	int height;
	int weight;
	int BMI;
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your height");
		this.height = sc.nextInt();
		System.out.println("Enter your weight");
		this.weight = sc.nextInt();
		bmi.setHeight(height);
		bmi.setWeight(weight);
		}
	
	public void printRecord() {
		System.out.println("you entered youe height is "+this.height);
		System.out.println("your entered your weight is "+this.weight);
		System.out.println();
		double value = bmi.BMICalculation();
		
		if(value <= 18.4) {
			System.out.println("you are underweight");
		} else if(value >= 18.5 || value <=24.9) {
			System.out.println("you are normal");
		} else if(value >= 25 || value<= 29) {
			System.out.println("you are overweight");
		} else {
			System.out.println("you are obese");
		}
	}

//	bmi.BMICalculation(height,weight);
	
	
}
public class Q3 {
	public static void main(String[] args) {
		BMITrackerUtil calc = new BMITrackerUtil();
		
		calc.acceptRecord();
		calc.printRecord();
	}

}
