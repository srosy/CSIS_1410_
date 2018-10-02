package ioBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Demonstrates how to use BufferedReader
 */
public class DemoBufferReader {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("src/ioBufferedReader/Resources/Cities.txt"))) {
			int currentLine = 1;
			while (reader.ready()) {
				// format aligned with line number with zero in front
				System.out.printf("%02d %s%n", currentLine++, reader.readLine());
			}

		} catch (IOException e) { // two catches are generated, but the other exception was type IOException
			e.printStackTrace();
		}

	}
}
