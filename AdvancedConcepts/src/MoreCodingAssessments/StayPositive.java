package MoreCodingAssessments;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StayPositive {

	public static void main(String[] args) {
		int[] array = { -4, 3, 2, 1 };
		minStart(array, 5);

		int[] array2 = { 3, -6, 5, -2, 1 };
		minStart(array2, 4);

		int[] array3 = { 5 };
		minStart(array3, 1);
	}

	public static void minStart(int[] array, int startingValue) {
		int[] runningSums = new int[array.length];
		runningSums[0] = array[0] + startingValue;
		IntStream.range(1, array.length).forEach(i -> runningSums[i] = runningSums[i - 1] + array[i]);
		int min = Arrays.stream(runningSums).min().getAsInt();
		min = startingValue - min + 1;
		System.out.println("The minimum starting value = " + min);
	}
}
