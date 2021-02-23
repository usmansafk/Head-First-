
public class Dog {
	
	String name;
	String colour;
	int age;
	
	Dog(String dogName, String dogCol, int dogAge){
		name = dogName;
		colour = dogCol;
		age = dogAge;
	}
	
	
	void bark() {
		System.out.println(name + " goes Woof!");
		
	}
	
	void eat() {
		System.out.println(name + " is eating.");
		
	}
	
	void chaseCat() {
		System.out.println(name + " is chasing the nieghbours Cat");
		
	}
	
	public static void main(String[] args) {
		
		Dog myDog = new Dog("Alfie", "Black and White" , 11);
		myDog.chaseCat();
		
		Dog[] dogs = new Dog[3];
		
		dogs[0] = new Dog("Bart", "Brown" , 5);
		dogs[1] = new Dog(null, "Black" , 9);
		dogs[2] = myDog;
		
		System.out.println();
		
		System.out.println(dogs[1].name);
		dogs[1].name = "Fred";
		System.out.println(dogs[1].name);
		
		System.out.println();
		
		System.out.println("The last dogs my Dog, and his name is " + dogs[2].name);
		System.out.println("He is " + myDog.colour + " and " + dogs[2].age + " years old");
		System.out.print("At the moment, ");
		myDog.eat();
		
		System.out.println()
		;
		for (int i = 0; i< dogs.length; i++) {
			dogs[i].bark();
		}
	}
}






// Dog UML:
//__________
//	name;
//	colour;
//	age;
//__________
//	bark()
//	eat()
//	chaseCat()



//create myDog, make it bark,give it name Alfie
//create Dog[3], dog[0],[1] new Dog & dog[2] = myDog[]
//give first 2 dogs a name
//print> the last dogs name is + dog[2].name
//now loop through an array and tell all dogs to bark




