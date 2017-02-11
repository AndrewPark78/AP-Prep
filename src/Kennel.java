import java.util.ArrayList;
import java.util.List;

public class Kennel {
	
	public static void main(String[] args) {
		Pet good = new Dog("Ivan");
		Pet bad = new Cat("Meow");
		petList.add(good);
		petList.add(bad);
		allSpeak();
	}

	private static ArrayList<Pet> petList = new ArrayList<Pet>();

	/**
	 * For every Pet in the kennel, print the name followed by the result of a
	 * call to its speak method, one line per Pet
	 */
	public static void allSpeak() {
		for (Pet p : petList) {
			System.out.println(p.getName() + ", " + p.speak());
		}
	}

}
