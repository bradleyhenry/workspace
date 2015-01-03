package orientation;

public class LearningObjects {

	public static void main(String[] args) {
		//make new dog
		Dog myDog = new Dog();
		Dog yourDog = new Dog("connor",17,false);
		myDog.setAge(1);
		myDog.setName("brad");
		
		System.out.println("your dogs mane is "+ yourDog.getName());
		
		final int DOGYEARS = 7;
		System.out.println(yourDog.getAge()*DOGYEARS);
		myDog.bark();
		yourDog.bark();
		
		//array
		Dog[] litter = new Dog[5];
		//must make each dog 
		//or  null pointer excption
		for(int i = 0 ; i <litter.length; i++){
			litter[i] = new Dog();
		}
	}

}
