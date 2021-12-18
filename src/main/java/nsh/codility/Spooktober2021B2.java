package nsh.codility;

public class Spooktober2021B2 implements Spooktober2021Interface {

	int[] calcL(int[] A) {
		int[] pref = new int[A.length];
		int coins = 0;
		for (int i = 0; i < A.length; i++) {
			pref[i] = coins;
			int a = A[i];
			coins = (coins + a) / 2;
		}
		return pref;
	}

	int[] calcR(int[] A) {
		int[] pref = new int[A.length];
		int coins = 0;
		for (int i = A.length - 1; i >= 0; i--) {
			pref[i] = coins;
			int a = A[i];
			coins = (coins + a) / 2;
		}
		return pref;
	}

	public int solution(int[] A) {
		int ans = 0;
		int[] le = calcL(A);
		int[] ri = calcR(A);
		for (int i = 0; i < A.length; i++) {

			int coins = le[i] + A[i] + ri[i];
			ans = Math.max(ans, coins);

		}
		return ans;
	}
}
