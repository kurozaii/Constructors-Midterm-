import java.util.Scanner;
public class RunBloodData{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter blood type of patient: ");
	String input1 = sc.nextLine();
	System.out.print("Enter the Rhesus factor (+ or -):");
	String input2=sc.nextLine();
	if(input1.isEmpty()){
		if(input2.isEmpty()){
		BloodData bd = new BloodData();
		bd.display();		
		}
		else{
		System.out.print("Invalid");
		}
		//default constructor
	}else if(input1.equalsIgnoreCase("A")||input1.equalsIgnoreCase("B")||input1.equalsIgnoreCase("O")||input1.equalsIgnoreCase("AB")){
		//constructor overloading
		if(input2.equals("+")||input2.equals("-")){
		BloodData bd = new BloodData(input1,input2);
		bd.display();
		}else{
			System.out.println("invalid");
		}
	}else if((input1.equalsIgnoreCase("A")||input1.equalsIgnoreCase("B")||input1.equalsIgnoreCase("O")||input1.equalsIgnoreCase("AB"))){
		if(input2.equals("+")||input2.equals("-")){
		BloodData bd = new BloodData();
		bd.display();
		}else{
			System.out.print("invalid");
		}
	}
	else{
		System.out.println("Incorrect input");
	}
	
	
	}
}