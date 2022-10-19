class BloodData{
	// number 2
	static String bloodType;
	static String rhFactor;

	//number 3
	public BloodData(){
	bloodType="O";
	rhFactor="+";
	}
	//number 4
	public BloodData(String bt, String rh){
	bloodType=bt;
	rhFactor=rh;
	}
	
	//number 8
	public void display(){
	System.out.println(bloodType+rhFactor+" is added to the blood bank");
	}
	
}