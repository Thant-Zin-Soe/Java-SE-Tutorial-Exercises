 enum Animal{
	 DOG("Bo Nyo"),CAT("Shwe War"),BIRD("Shwe gae");
	 
	 private String name;
	 
	 Animal(String name){
		 this.name=name;
	 }
	 public String getName(){
		 return this.name;
	 }
 }
public class App {
	public static void main(String []args){
		// TODO Auto-generated method stub
		Animal animal;
		animal=Animal.DOG;
		//Animal animal=Animal.DOG;

		switch(animal){
		case DOG:
			System.out.println("Dog..");
			break;
		case CAT:
			System.out.println("Cat..");
			break;
		case BIRD:
			System.out.println("Bird...");
			break;
		}
		System.out.println(Animal.BIRD.getClass());
		System.out.println(Animal.CAT instanceof Enum);
		System.out.println(Animal.BIRD.getName());
	}
	
}
