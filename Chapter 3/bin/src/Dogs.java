
public class Dogs {
	
	
	String name; 
	
	public static void main(String[] args) {
		
		Dogs[] myDogs = new Dogs[7];
		
		myDogs[0] = new Dogs();
		myDogs[1] = new Dogs();
		
		myDogs[0].name = "Alfie";
		
		System.out.println(myDogs[0].name);
		
		
	}

}



//create array of dogs
//create dog objects