package ioSerialization;

import java.io.Serializable;

// in order to serialize an object, you must implement interface serializable
public class Point implements Serializable {

	private static final long serialVersionUID = -561054150887846812L;

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
