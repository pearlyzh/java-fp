package com.pearly.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BasicStream {
	public static void main(String[] args) {
		/*
		Example 1: Declare Function, Predicate and Consumer
		*/
		/* Declare a function which takes an integer as the input, and produce an integer as an output by multiply the input by 2 */
		Function<Integer, Integer> function = a -> a * 2;

		/* Declare a predicate which takes an integer as the input, then filter if it's smaller than 10 */
		Predicate<Integer> predicate = x -> x < 10;

		/* Declare a consumer which takes an integer as the input, and print it to standard output */
		Consumer<Integer> consumer = x -> System.out.println(x);

		/*
		* Equivalent way:
		* Consumer<Integer> consumer = System.out::println;
		* We could use it because println is a static function of PrintStream out
		*/

		/*
		Now we are using the **forEach** terminal operation
		*/
		Arrays.asList(1,2,3,4,5).stream() // return a stream
				.map(function)
				.filter(predicate)
				.forEach(consumer);
		/*
		* Produces:
		2
		4
		6
		8
		* */

		/*
		Example 2: Now we are using a **min** as a terminal operation
		 */
		int[] array = new int[]{1,2,3,4,5};
		int min = Arrays.stream(array) // return an IntStream
				.map(operand -> operand * 2) // cannot use function anymore because it requires an IntUnaryOperator
				.filter(value -> value < 10) // cannot use predicate anymore because it requires an IntPredicate
				.min() // return an optional
				.getAsInt();

		System.out.printf("Min is " + min);
		/*
		* Produces:
		Min is 2
		 */
	}
}
