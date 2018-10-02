package balloon;

/**
 * Represents a balloon with a given size and type.
 * 
 * @author SpencerR
 *
 */

public class Balloon {
	private Size size;
	private String type; // air or helium

	public Balloon(Size size, String type) {
		this.size = size;
		this.type = type;
	}

	public Size getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balloon other = (Balloon) obj;
		if (size != other.size)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return type + " " + size;
	}

}
