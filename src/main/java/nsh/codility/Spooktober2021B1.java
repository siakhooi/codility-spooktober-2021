package nsh.codility;

import java.util.Arrays;

public class Spooktober2021B1 implements Spooktober2021Interface {

	int calcL(int[] A) {
		int coins = 0;
		for (int i = 0; i < A.length; i++) {
			int a = A[i];
			coins = (coins + a) / 2;
		}
		return coins;
	}

	int calcR(int[] A) {
		int coins = 0;
		for (int i = A.length-1; i >= 0; i--) {
			int a = A[i];
			coins = (coins + a) / 2;
		}
		return coins;
	}

	public int solution(int[] A) {
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			int[] le = Arrays.copyOfRange(A, 0, i);
			int[] ri = Arrays.copyOfRange(A, i+1, A.length);

			int coins = calcL(le) + A[i] + calcR(ri);
			ans = Math.max(ans, coins);

		}
		return ans;
	}
}
