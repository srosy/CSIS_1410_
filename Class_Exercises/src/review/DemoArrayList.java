//Review Array list

package review;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>(); // create list
		animals.add("ant"); // add three elements
		animals.add("ape");
		animals.add("cat");
		System.out.println("animals: " + animals); // sysout + control + space

		animals.add("dog"); // append (add to end of list)
		System.out.println("animals: " + animals);

		animals.add(2, "bee"); // add "bee" between cat and ape, remember 0 based counting
		System.out.println("animals: " + animals);

		animals.remove(1); // remove the second element
		System.out.println("animals: " + animals);

		System.out.print("animals: ");
		for (String el : animals) { // for each loop, print each el with a space
			System.out.print(el + " ");
		}
		System.out.println();

		String firstAnimal = animals.get(0); // assign firstaAnimal to first element of list
		String lastAnimal = animals.get(animals.size() - 1); // assign lastAnimal to last element of list
		System.out.println("animal: " + firstAnimal);
		System.out.println("animal: " + lastAnimal);
	}
}
