package streams;

import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Hello", "It's", "Dale");
		strings.stream().map(word -> word.toUpperCase()).forEach(System.out::println);

		System.out.println();

		List<Integer> numbers = Arrays.asList(10, 7, 3, 9, 11, 20, 21, 37, 39, 43, 19, 7, 67);
		numbers.stream().filter(number -> isPrime(number)).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println();

		String concat = strings.stream().collect(Collectors.joining(" "));
		System.out.println(concat);

		List<Integer> sumEven = Arrays.asList(2, 3, 4, 5, 6);
		int sumOf = sumEven.stream().filter(number -> isEven(number)).mapToInt(i -> i).sum();
		System.out.println(sumOf);

	}

	public static boolean isPrime(int x) {

		if (x == 1) {
			return false;
		} else {

			for (int i = 2; i < x / 2; i++) {

				if (x % i == 0) {
					return false;

				}
			}
			return true;

		}

	}

	public static boolean isEven(int y) {

		if (y % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}