package problemDomain;

public class Hybrid extends Vehicle {
	private String powerTrain;
	private int electricRange;
	
	

  public Hybrid(String[] arr) {
    super(arr);
    this.powerTrain = arr[10].trim();
    this.electricRange = Integer.parseInt(arr[11]);
  }
	
	
	@Override
	public String toString() {
		return super.toString() +
				"\nPower Train:\t" + powerTrain +
				"\nElectric Range:\t " + electricRange;
	}


	public String getPowerTrain() {
		return powerTrain;
	}


	public int getElectricRange() {
		return electricRange;
	}

}
