class complex {
	int real;
	int imagine;
	complex(int real, int imagine) {
		this.real = real;
		this.imagine = imagine;
	}
	void subtraction(complex c2) {
		this.real = this.real - c2.real;
		this.imagine = this.imagine - c2.imagine;
		if (this.imagine < 0) {
			System.out.println("The equation is = " + this.real + this.imagine + "i");
		} else {
			System.out.println("The equation is = " + this.real + "+" + this.imagine + "i");
		}
	}
}
public class ComplexSubtraction {
	public static void main(String[] args) {
		complex c1 = new complex(2, 3);
		complex c2 = new complex(3, 5);
		c1.subtraction(c2);

	}
}