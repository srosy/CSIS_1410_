package genericMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseBoundedTypes {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		Collections.addAll(words, "one", "two", "three", "four", "five");

		System.out.println("The smallest words of: " + words.toString() + " is: "
				+ smallest(words.get(0), words.get(1), words.get(2)));

	}

	public static <T extends Comparable> T smallest(T x, T y, T z) {
		T result = x;

		if (y.compareTo(result) < 0) // check if it is smaller than the current result.
			result = y;
		if (z.compareTo(result) < 0)
			result = z;

		return result;
	}

}
