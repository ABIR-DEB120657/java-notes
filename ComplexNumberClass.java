class complex {
	int x;
	int y;
	complex(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void display() {
		if (y <0) {
			System.out.println("The math equation is = " + x + y + "i");
		} else {
			System.out.println("The math equation is = " + x + "+" + y + "i");
		}

	}
}
public class ComplexNumberClass {
	public static void main(String[] args) {
		complex c1 = new complex(10, -5);
		c1.display();

	}
}