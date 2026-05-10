package main;

import libraries.CLibrary;

public class Main {

	public static void main(String[] args) {
		CLibrary.Winsize dimensions = new CLibrary.Winsize();
		if (CLibrary.INSTANCE.ioctl(0, 0x5413, dimensions) == -1) {
			System.out.println("System call to 'ioctl' returned -1.\nTerminating...");
			return;
		}

		System.out.printf(
			"Console width: %s\n",
			dimensions.ws_col
		);

		System.out.printf(
			"Console height: %s\n",
			dimensions.ws_row
		);
	}
}
