class complex {
	int real;
	int imagine;
	complex(int real, int imagine) {
		this.real = real;
		this.imagine = imagine;
	}
	void multiplication(complex c2) {
		int newreal= (this.real * c2.real) - (this.imagine * c2.imagine);
		int newimagine= (this.real* c2.imagine) + (this.imagine * c2.real);
		this.real= newreal;
		this.imagine= newimagine;		
		if (this.imagine < 0) {
			System.out.println("The equation is = " + this.real + this.imagine + "i");
		} 
		else {
			System.out.println("The equation is = " + this.real + "+" + this.imagine + " i ");
		}
	}
}
public class ComplexMultiplication{
	public static void main(String[] args) {
		complex c1 = new complex(7, 2);
		complex c2 = new complex(3, 4);
		c1.multiplication(c2);

	}
}