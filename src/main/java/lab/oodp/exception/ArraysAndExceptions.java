package lab.oodp.exception;

import lab.oodp.Keyboard;

/**
 * A simple program that generates an array of random numbers, then displays one
 * of them (user's choice).
 */
public class ArraysAndExceptions {

	/**
	 * Runs the program.
	 */
	public void start() {

		int[] myArray = generateArray();

		int index = -1;
		boolean needInput = true;

		while (needInput) {
			// TODO: add try catch for handling InvalidIndexException, IndexTooLowException, and IndexTooHighException appropriately.

			System.out.print("Enter an index:\n>> ");
			String indexStr = Keyboard.readInput();

			index = getArrayIndex(indexStr);
			needInput = false;

		}

		System.out.println("The element at index " + index + " is: " + myArray[index]);
	}

	/**
	 * Gets an array index from the given user. Currently error-prone as it doesn't
	 * check whether the user inputs valid numbers of the correct size.
	 *
	 * TODO Follow these steps:
	 * <ol>
	 * <li>Create three new checked Exception classes (i.e. extends Exception):
	 * <ul>
	 * <li>InvalidIndexException</li>
	 * <li>IndexTooLowException</li>
	 * <li>IndexTooHighException</li>
	 * </ul>
	 * </li>
	 * <li>Declare this method to throw these three kinds of exceptions (using the
	 * throws clause)</li>
	 * <li>Throw InvalidIndexException if the user doesn't enter an integer</li>
	 * <li>Throw IndexTooLowException if the user enters an integer that's too small
	 * to be a valid index</li>
	 * <li>Throw IndexTooHighException if the user enters an integer that's too
	 * large to be a valid index</li>
	 * </ol>
	 */

	public int getArrayIndex(String indexStr) {

		try {
			int index = Integer.parseInt(indexStr);
			// TODO: check index value and return proper exception

			return index;

		} catch (NumberFormatException e) {

			// TODO: remove below return, throw the proper exception
			return 0;
		}

	}

	/**
	 * Creates and returns an array with five random numbers.
	 */
	public int[] generateArray() {

		// TODO Create an array of length five, and fill it with random integers
		// TODO (say, between 1 - 1000, but doesn't really matter).
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000 + 1);
		}

		return array;
	}

	public static void main(String[] args) {
		new ArraysAndExceptions().start();
	}

}
