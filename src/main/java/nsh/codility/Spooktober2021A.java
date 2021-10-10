package nsh.codility;

public class Spooktober2021A implements Spooktober2021Interface {

	public int solution(int[] A) {
		int[] d = new int[A.length];
		int[] u = new int[A.length];

		int r = 0;

		for (int i = 0; i < A.length; i++) {
			d[i] = r;
			r = (r + A[i]) / 2;
		}
		r = 0;
		int m = 0;
		for (int i = A.length - 1; i >= 0; i--) {
			u[i] = r;
			r = (r + A[i]) / 2;

			m = Math.max(m, A[i] + u[i] + d[i]);
		}
		return m;
	}
}
