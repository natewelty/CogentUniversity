package MoreCodingAssessments;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatrixSearch {

	public static void main(String[] args) {
		int[][] matrix = { { 2, 1, 3 }, { 2, 2, 4 } }; // should return 2
		int[][] matrix2 = { { 5, 7, 9 }, { 2, 3, 5 }, { 1, 5, 2 } };// should return 5
		int[][] matrix3 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };// should return 7
		System.out.println(search(2, 3, matrix));
		System.out.println(search(3, 3, matrix2));
		System.out.println(search(3, 3, matrix3));
	}

	public static int search(int rowSize, int colSize, int[][] matrix) {
		for (int i = 0; i < colSize; i++) {
			int j = i;
			int[] rowsToCheck = column(i, matrix);
			int[] success = Arrays.stream(rowsToCheck).filter(s -> row(matrix[j][s], s, matrix, rowSize)).toArray();

			if (success.length > 0) {
				return matrix[j][success[0]];
			}
		}
		return -1;
	}

	public static boolean row(int value, int index, int[][] matrix, int rowSize) {
		int[] row = IntStream.range(0, rowSize).map(i -> matrix[i][index]).toArray();
		return !Arrays.stream(row).anyMatch(s -> s > value);
	}

	public static int[] column(int index, int[][] matrix) {
		int[] column = matrix[index];
		int minimum = Arrays.stream(column).min().getAsInt();
		return IntStream.range(0, column.length).filter(s -> column[s] == minimum).toArray();

	}
}
