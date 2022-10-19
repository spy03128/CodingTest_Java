package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S2_4358 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int total = 0;
		Map<String, Integer> map = new HashMap<>();
		while ((s = br.readLine()) != null) {
			total++;
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String tree = entry.getKey();
			list.add(tree);
		}
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for (String tree : list) {
			int count = map.get(tree) * 100;
			sb.append(tree + " " + String.format("%.4f", (double) count / (double) total) + "\n");
		}
		System.out.print(sb);
	}
}