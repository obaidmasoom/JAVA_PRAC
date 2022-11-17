package in.obaid.practice;

public class Practice1 {
	public static void main(String[] args) {
		int i = 9;
		int n = 100;
		if (i > n) {
			System.out.println("greater");
		} else if (i == n) {
			System.out.println("equal");
		} else {
			System.out.println("lesser");
		}
		forloopprogram();
	}

	static void forloopprogram() {
		int start;
		int end = 100;

		for (start = 10; start <= end; start++) {
			if (start % 10 == 0) {
				System.out.println(start);
			}

		}
		whileloopprogram();
	}

	static void whileloopprogram() {
		int sai = 100;
		int end = 0;
		while (sai > 0) {
			if (sai % 10 == 0) {
				System.out.println(sai);
			}
			sai--;
		}
		DOwhileprogram();
	}

	static void DOwhileprogram() {
		int ibbu = 100;
		int boss = 50;
		do {
			System.out.println(ibbu + "DOwhileprogram");
			ibbu++;
		} while (ibbu < boss);
	}
}
