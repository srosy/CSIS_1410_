package genericMethods;

import java.util.Arrays;

/**
 * Exercise Swap, Reverse
 * 
 * @author SpencerR
 *
 */

public class DemoGenericMethods {

	public static void main(String[] args) {
		// String array, String is a reference type
		String[] words = { "ape", "bee", "cat", "dog", "gnu", "hat" };
		System.out.println("words: " + Arrays.toString(words));

		swap(words, 0, words.length - 1);
		System.out.println("words: " + Arrays.toString(words));
		System.out.println("reversed words: " + Arrays.toString(reverse(words)));
		System.out.println();

		// Integer array, must use reference types when using generics
		Integer[] numbers = { 77, 55, 48, 32, 86, 88, 25, 13 };
		System.out.println("numbers: " + Arrays.toString(numbers));

		swap(numbers, 0, numbers.length - 1);
		System.out.println("numbers: " + Arrays.toString(numbers));
		System.out.println("reversed numbers:" + Arrays.toString(reverse(numbers)));
		System.out.println();

	}

	// swaps the elements of positions index1 and index2 using generics
	private static <T> void swap(T[] words, int index1, int index2) {
		T temp = words[index1];
		words[index1] = words[index2];
		words[index2] = temp;
	}

	private static <T> T[] reverse(T[] array) {
		T[] reversedArray = Arrays.copyOf(array, array.length);
		for (int i = 0; i < array.length; i++) {
			reversedArray[i] = array[array.length - 1 - i];
		}
		return reversedArray;
	}
}
