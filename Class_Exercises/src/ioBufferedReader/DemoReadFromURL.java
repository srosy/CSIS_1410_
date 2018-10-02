package ioBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DemoReadFromURL {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("https://www.gutenberg.org/files/11/11-0.txt");
		} catch (MalformedURLException e) {
			System.out.println("Please double check the URL.");
			e.printStackTrace();
		}

		// read text file from url
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
			while (reader.ready()) {
				System.out.println(reader.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
