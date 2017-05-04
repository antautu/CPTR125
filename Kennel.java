package Labs;

public class Kennel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String breed1 = "Lab", breed2 = "Boxer", 
				breed3 = "Pug", breed4 = "Poodle", breed5 = "Pitbull";
		String name1 = "Max", name2 = "Spot", 
				name3 = "Zoey", name4 = "Fluffy", name5 = "Zeus";
		int age1 = 2, age2 = 5, age3 = 1, age4 = 6, age5 = 4;
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		Dog dog4 = new Dog();
		Dog dog5 = new Dog();
		
		// Sets all info about current dogs 
		dog1.setBreed(breed1);
		dog1.setName(name1);
		dog1.setAge(age1);
		dog2.setBreed(breed2);
		dog2.setName(name2);
		dog2.setAge(age2);
		dog3.setBreed(breed3);
		dog3.setName(name3);
		dog3.setAge(age3);
		dog4.setBreed(breed4);
		dog4.setName(name4);
		dog4.setAge(age4);
		dog5.setBreed(breed5);
		dog5.setName(name5);
		dog5.setAge(age5);
		
		System.out.println("Name" + "\t" + "Breed" + "\t" + "Age");
		System.out.println(dog1.getBreed() + "\t" + dog1.getName() + "\t" + dog1.getAge());
		System.out.println(dog2.getBreed() + "\t" + dog2.getName() + "\t" + dog2.getAge());
		System.out.println(dog3.getBreed() + "\t" + dog3.getName() + "\t" + dog3.getAge());
		System.out.println(dog4.getBreed() + "\t" + dog4.getName() + "\t" + dog4.getAge());
		System.out.println(dog5.getBreed() + "\t" + dog5.getName() + "\t" + dog5.getAge());
		
		
	}

}
