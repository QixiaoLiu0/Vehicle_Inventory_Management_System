package problemDomain;

public class Sedan extends Vehicle {
	private char trunkSize;
	
	
  public Sedan(String[] arr) {
    super(arr);
    this.trunkSize = arr[10].charAt(0);
  }
	
	



	public char getTrunkSize() {
		return trunkSize;
	}





	@Override
	public String toString() {
		return super.toString() +
				"\nTrunk Size:\t" + trunkSize;
	}

}
