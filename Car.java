
public class Car extends Vehicle {
private int noOfPassengers;
public Car() {
	super();
}
public Car(String regno, String company, String colour, int noOfPassengers) {
	super(regno, company, colour);
	this.noOfPassengers = noOfPassengers;
}
public int getNoOfPassengers() {
	return noOfPassengers;
}
public void setNoOfPassengers(int noOfPassengers) {
	this.noOfPassengers = noOfPassengers;
}
public void start() {
	System.out.println("Car is started");
}
public void stop() {
	System.out.println("Car is stoped");
}
public void accelerate() {
	System.out.println("Car is accelerated");
}
public void display() {
	System.out.println("Registered number:"+getRegno());
	System.out.println("Company"+getCompany());
	System.out.println("colour#:"+getColour());
	System.out.println("Number of passengers"+getNoOfPassengers());
}

}
