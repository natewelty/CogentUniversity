package com.cogent;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntroToMaps {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("John", 40);
		map.put("Jacob", 37);
		map.put("Jingleheimer",51);
		map.put("Schmidt", 13);
		Set<String> keyset = map.keySet();
		Collection<Integer> values = map.values();
		System.out.println(keyset);
		System.out.println(values);
		for(String key:keyset) {
			System.out.println("Key:" + key + " Value: " + map.get(key));
		}
	}

}
