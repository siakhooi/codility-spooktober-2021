package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class AbstractSpooktober2021Test {
	abstract Spooktober2021Interface getTestObject();

	Spooktober2021Interface testObject;

	@BeforeEach
	void setup() {
		testObject = getTestObject();
	}

	@Test
	@DisplayName("Sample 1")
	void test01() {
		int[] A = new int[] { 2, 3, 1, 3 };
		int R = 5;

		assertEquals(R, testObject.solution(A));
	}

	@Test
	@DisplayName("Sample 2")
	void test02() {
		int[] A = new int[] { 3, 7, 0, 5 };
		int R = 9;

		assertEquals(R, testObject.solution(A));
	}

	@Test
	@DisplayName("Sample 3")
	void test03() {
		int[] A = new int[] { 1, 1, 1, 1, 1 };
		int R = 1;

		assertEquals(R, testObject.solution(A));
	}

	@Test
	@DisplayName("Big Side")
	void test04() {
		int[] A = new int[] { 2, 100, 2, 2, 2, 2, 2, 2 };
		int R = 102;

		assertEquals(R, testObject.solution(A));
	}

	@Test
	@DisplayName("Valley")
	void test05() {
		int[] A = new int[] { 1000, 0, 0, 0, 0, 1000 };
		int R = 1031;

		assertEquals(R, testObject.solution(A));
	}

	@Test
	@DisplayName("Mountain")
	void test06() {
		int[] A = new int[] { 7, 8, 7, 1000, 7, 8, 7 };
		int R = 1012;

		assertEquals(R, testObject.solution(A));
	}

	@Test
	@DisplayName("Single Digit")
	void test07() {
		int[] A = new int[] { 3 };
		int R = 3;

		assertEquals(R, testObject.solution(A));
	}

	@Test
	@DisplayName("Two Digits")
	void test08() {
		int[] A = new int[] { 3, 2 };
		int R = 4;

		assertEquals(R, testObject.solution(A));
	}

	@Test
	@DisplayName("All numbers same")
	void test09() {
		int[] A = new int[] { 1000, 1000, 1000, 1000, 1000, 1000 };
		int R = 2625;

		assertEquals(R, testObject.solution(A));
	}

	@Test
	@DisplayName("Ascending")
	void test10() {
		int[] A = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int R = 210;

		assertEquals(R, testObject.solution(A));
	}

	@Test
	@DisplayName("Descending")
	void test11() {
		int[] A = new int[] { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
		int R = 210;

		assertEquals(R, testObject.solution(A));
	}
}
