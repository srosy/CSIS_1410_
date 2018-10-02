package ioSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class DemoSerialization {

	public static void main(String[] args) {

		Point p1 = new Point(3, 9);
		Point p2 = new Point(4, 8);
		Point p3 = new Point(5, 7);

		String fileName = "src/ioSerialization/Resources/Points.ser";

		System.out.printf("P1:%s P2:%s P3:%s%n", p1, p2, p3);

		// serialize
		try (ObjectOutputStream serializer = new ObjectOutputStream( // try with resource...
				new FileOutputStream(fileName))) {
			serializer.writeInt(3); // number of points in file
			serializer.writeObject(p1);
			serializer.writeObject(p2);
			serializer.writeObject(p3);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done serializing");

		// deserialize
		Point[] points = new Point[0]; // create array, intialize it empty in case of null in file
		createPointArray(fileName);

	}

	private static void createPointArray(String fileName) {
		Point[] points;
		try (ObjectInputStream deSerializer = new ObjectInputStream(new FileInputStream(fileName))) {

			int size = deSerializer.readInt(); // read the first object, i.e. size
			points = new Point[size];
			for (int i = 0; i < size; i++) {
				points[i] = (Point) deSerializer.readObject();
			}
			System.out.println("all points: " + Arrays.toString(points));
			System.out.println("done deserialzing");

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
