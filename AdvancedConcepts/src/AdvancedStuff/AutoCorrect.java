package AdvancedStuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoCorrect {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("duel");
		words.add("dule");
		words.add("speed");
		words.add("cars");

		List<String> queries = new ArrayList<>();
		queries.add("spede");
		queries.add("deul");

		getSearchResults(words, queries).stream().forEach(s -> {
			System.out.println(s);
		});
	}

	public static List<List<String>> getSearchResults(List<String> words, List<String> queries) {
		List<List<String>> results = queries.stream().map(s -> {
			List<String> temp = words.stream().filter(t -> isAnagram(s, t)).toList();
			return temp;
		}).toList();

		return results;
	}

	public static boolean isAnagram(String word, String query) {
		if (word.length() != query.length()) {
			return false;
		}
		byte[] wordBytes = word.getBytes();
		Arrays.sort(wordBytes);
		byte[] queryBytes = query.getBytes();
		Arrays.sort(queryBytes);
		for (int i = 0; i < wordBytes.length; i++) {
			if (wordBytes[i] != queryBytes[i]) {
				return false;
			}

		}
		return true;

	}
}
