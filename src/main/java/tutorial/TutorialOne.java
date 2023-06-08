package main.java.tutorial;

import java.util.ArrayList;

public class TutorialOne {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			if (i == list.size() - 1) {
				int j;
				System.out.println();
				System.out.print(" ");
				for (j = 1; j < list.size(); j++) {
					System.out.print(list.get(j) + " ");
					if (j == list.size() - 1) {
						int k;
						System.out.println();
						System.out.print(" " + " ");
						for (k = 2; k < list.size(); k++) {
							System.out.print(list.get(k) + " ");
							if (k == list.size() - 1) {
								int l;
								System.out.println();
								System.out.print(" " + " " + " ");
								for (l = 3; l < list.size(); l++) {
									System.out.print(list.get(l) + " ");
									if (l == list.size() - 1) {
										int m;
										System.out.println();
										System.out.print(" " + " " + " " + " ");
										for (m = 4; m < list.size(); m++) {
											System.out.print(list.get(m) + " ");
											if (m == list.size() - 1) {
												int n;
												System.out.println();
												System.out.print(" " + " " + " " + " " + " ");
												for (n = 5; n < list.size(); n++) {
													System.out.print(list.get(n) + " ");
													if (n == list.size() - 1) {
														int o;
														System.out.println();
														System.out.print(" " + " " + " " + " " + " " + " ");
														for (o = 6; o < list.size(); o++) {
															System.out.print(list.get(o) + " ");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		for (int i = list.size(); i >= 0; i--) {
			if (i == 5) {
				System.out.println();
				System.out.print(" " + " " + " " + " " + " ");
				for (int j = 5; j < list.size(); j++) {
					System.out.print(list.get(j) + " ");
				}
			}
			if (i == 4) {
				System.out.println();
				System.out.print(" " + " " + " " + " ");
				for (int j = 4; j < list.size(); j++) {
					System.out.print(list.get(j) + " ");
				}
			}
			if (i == 3) {
				System.out.println();
				System.out.print(" " + " " + " ");
				for (int j = 3; j < list.size(); j++) {
					System.out.print(list.get(j) + " ");
				}
			}
			if (i == 2) {
				System.out.println();
				System.out.print(" " + " ");
				for (int j = 2; j < list.size(); j++) {
					System.out.print(list.get(j) + " ");
				}
			}
			if (i == 1) {
				System.out.println();
				System.out.print(" ");
				for (int j = 1; j < list.size(); j++) {
					System.out.print(list.get(j) + " ");
				}
			}
			if (i == 0) {
				System.out.println();
				for (int j = 0; j < list.size(); j++) {
					System.out.print(list.get(j) + " ");
				}
			}
		}

	}
}