package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QueConstraints {


	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(87);
		al.add(55);
		al.add(3);
		al.add(4);
		al.add(22);
		al.add(17);
		al.add(59);
		al.stream().forEach(x -> System.out.print(x + ","));

		Collections.sort(al, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		ArrayList<Integer> alnew = new ArrayList<Integer>();

		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;
		int mark = 0;
		for (int i = 0; i < al.size();) {
			if (al.size() <= 0) {
				break;
			}
			if (0 <= al.get(i) && al.get(i) <= 5) {
				alnew.add(al.get(i));
				al.remove(i);
				continue;
			} else if (flag == false) {
				mark = i;
				i = al.size() - 1;
				flag = true;

			}
			if (60 <= al.get(i) && al.get(i) <= 90) {
				alnew.add(al.get(i));
				al.remove(i);
				i = al.size() - 1;
				continue;
			} else if (flag1 == false) {
				i = mark;
				flag1 = true;
			}
			if (6 <= al.get(i) && al.get(i) <= 12) {
				alnew.add(al.get(i));
				al.remove(i);
				continue;
			} else if (flag2 == false) {
				i = al.size() - 1;
				flag2=true;
			}
			if (13 <= al.get(i) && al.get(i) <= 59) {
				alnew.add(al.get(i));
				al.remove(i);
				i = al.size() - 1;
			}
		}
		System.out.println();
		alnew.stream().forEach(x -> System.out.print(x + ","));
	}
}