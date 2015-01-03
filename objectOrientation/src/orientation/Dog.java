package orientation;

public class Dog {

	//attributes (var that describe dog)
	//these are private
	
	//private/public - visiablity modifier
	private String name;
	private int age;
	private boolean alive;
	
	//constructor - build dog
	
	//default constructor
	
	public Dog() {
		name = "";
		age = 0 ;
		alive = true;
		
	}
	public Dog(String name, int age, boolean alive){
		// "this" refers to global attribute 
		this.name = name; 
		this.age = age;
		this.alive = alive;
		
		
	}
	//getter and setter section
	//getter methods - "get" info from class
	//setter methods - " set " info in the class
	
	
	//getters 
	public int getAge(){
		return age;
	}
	public String getName (){
		return name;	
	}
	public boolean alive(){
		return alive;
	}
	
	
	//setters 
	//use peramitors to bring info in to set them to
	public void setAge(int age){
		this.age = age;
		
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAlive(boolean alive){
		this. alive = alive;
	}

	//OTHER METHOD
	public void bark (){
		for(int i = 0; i< getAge();i++)
			System.out.println("BARK");
	}
	
}
