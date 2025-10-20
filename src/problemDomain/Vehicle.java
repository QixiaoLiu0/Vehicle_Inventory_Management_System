package problemDomain;

public abstract class Vehicle {
	protected String carID;
	protected String vehicleType;
	protected String subtype;
	protected int speed;
	protected double fuel; 
	protected int seats;
	protected String year;
	protected String drivetrain;
	protected int price;
	protected int quantity;
	
  public Vehicle(String[] arr) {
    this.carID = arr[0];
    this.vehicleType = arr[1];
    this.subtype = arr[2];
    this.speed = Integer.parseInt(arr[3]);
    this.fuel = Double.parseDouble(arr[4]);
    this.seats = Integer.parseInt(arr[5]);
    this.year = arr[6];
    this.drivetrain = arr[7];
    this.price = Integer.parseInt(arr[8]);
    this.quantity = Integer.parseInt(arr[9]);
}
	
	@Override
	public String toString() {
		return "Car ID:\t\t" + carID +
        "\nVehicle Type:\t" + vehicleType +
        "\nSub Type:\t" + subtype +
        "\nSpeed:\t\t" + speed +
        "\nFuel:\t\t" + fuel +
        "\nNumber of Seats:" + seats +
        "\nYear:\t\t" + year +
        "\nDriveTrain:\t" + drivetrain +
        "\nPrice:\t\t" + price +
        "\nAvailable:\t" + quantity;
		
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getCarID() {
		return carID;
	}

	public int getSpeed() {
		return speed;
	}

	public double getFuel() {
		return fuel;
	}

	public int getSeats() {
		return seats;
	}

	public String getYear() {
		return year;
	}

	public String getDrivetrain() {
		return drivetrain;
	}

	public int getPrice() {
		return price;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public String getSubtype() {
		return subtype;
	}



	
	
	
}
