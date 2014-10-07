package chapter6;

import sun.applet.Main;

interface W {
	int w = 1;
}

interface X extends W {
	int x = 2;
}

class Y implements W {
	private int y;

	void setY(int i) {
		y = w + i;
	}

	int getY() {
		return y;
	}
}

class Z extends Y implements X {
	private int z;

	void setZ(int i) {
		z = x + i;
	}

	int getZ() {
		return z;
	}
}

public class c_6_11_DiamondInheritance {
	public static void main(String[] args) {
		Z z = new Z();
		z.setY(10);
		z.setZ(10);
		System.out.println("y = " + z.getY() + ", z = " + z.getZ());
	}
}
