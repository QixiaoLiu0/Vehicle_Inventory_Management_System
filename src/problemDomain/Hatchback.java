package problemDomain;

public class Hatchback extends Vehicle {
	private char hatchType;
	
  public Hatchback(String[] arr) {
    super(arr);
    this.hatchType = arr[10].charAt(0);
}
	
	
	
	public char getHatchType() {
		return hatchType;
	}



	@Override
	public String toString() {
		return super.toString() +
				"\nHatch Type:\t" + hatchType;
		
	}

}
