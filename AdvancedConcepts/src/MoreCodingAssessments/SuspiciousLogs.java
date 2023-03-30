package MoreCodingAssessments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class SuspiciousLogs {

	public static void main(String[] args) {
		String[] logs = { "88 99 200", "88 99 300", "99 32 100", "12 12 15" };
		String[] logs2 = { "" };
		int threshold = 2;

		findSuspiciousUsers(logs, threshold);
		findSuspiciousUsers(logs2, 2);

	}

	public static void findSuspiciousUsers(String[] logs, int threshold) {
		ArrayList<Transaction> transactions = new ArrayList<>();
		for (String log : logs) {
			String[] splitLog = log.split("\s");
			transactions.add(new Transaction(Integer.parseInt(splitLog[0]), Integer.parseInt(splitLog[1]),
					Integer.parseInt(splitLog[2])));
		}
		HashSet<Integer> users = new HashSet<>();
		users.addAll(transactions.stream().map(t -> t.sender_user_id).toList());
		users.addAll(transactions.stream().map(t -> t.recipient_user_id).toList());

		HashMap<Integer, Long> userCounts = new HashMap<>();
		users.stream().forEach(u -> {
			userCounts.put(u,
					transactions.stream().filter(t -> (t.recipient_user_id == u || t.sender_user_id == u)).count());
		});
		System.out.println("User | Transaction Count");
		System.out.println("-------------------------");
		userCounts.entrySet().stream().sorted(new EntryComparator())
				.forEach(s -> System.out.println(s.getKey() + " | " + s.getValue()));
		System.out.println();
		System.out.println("Suspicious User | Transaction Count");
		System.out.println("-------------------------------------");
		userCounts.entrySet().stream().filter(s -> s.getValue() >= threshold).sorted(new EntryComparator())
				.forEach(s -> System.out.println(s.getKey() + " | " + s.getValue()));
	}
}

class Transaction {
	int sender_user_id;
	int recipient_user_id;
	int amount;

	public Transaction(int sender_user_id, int recipient_user_id, int amount) {
		super();
		this.sender_user_id = sender_user_id;
		this.recipient_user_id = recipient_user_id;
		this.amount = amount;
	}

}

class EntryComparator implements Comparator<Entry<Integer, Long>> {

	@Override
	public int compare(Entry<Integer,Long> o1, Entry<Integer,Long> o2) {
		if ((Integer) o1.getKey() > (Integer) o2.getKey()) {
			return 1;
		}
		if ((Integer) o1.getKey() < (Integer) o2.getKey()) {
			return -1;
		}
		return 0;
	}

}