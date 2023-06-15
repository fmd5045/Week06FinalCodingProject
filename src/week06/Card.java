package week06;

public class Card {
	// 		a. name field
	String name;
	//		b. suit field
	int value;
	
	void describe(){
	//		a. describe() to display the card information to the Console.
		System.out.println(name+" with a value of "+value);
		
	}
	
	//Constructor
	public Card(String name,int value){
		this.name = name;
		this.value = value;
	}
	
	//Re adding the default constructor
	public Card() {}
	
	//		b. Getters & Setters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
