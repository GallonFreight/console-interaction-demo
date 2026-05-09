package main;

public class Main {

	public static void main(String[] args) {
		System.out.printf(
			"Console width: %s\n",
			System.getenv("COLUMNS")
		);

		System.out.printf(
			"Console height: %s\n",
			System.getenv("LINES")
		);
	}
}
