package ioWrite;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DemoPrintWriter {

	public static void main(String[] args) {
		try (PrintWriter writer = new PrintWriter("src/ioWrite/Resources/Numbers.txt")) {
			writer.printf("| %7s | %5s | %5s | %s%n", "Decimal", "Binary", "Octal", "Hexadecimal");
			writer.println("----------------------------------------------");
			for (int i = 1; i < 20; i++) {
				writer.printf("| %7s | %7s | %5s | %5s |%n", i, Integer.toBinaryString(i), Integer.toOctalString(i),
						Integer.toHexString(i));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
