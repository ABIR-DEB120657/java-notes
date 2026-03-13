class complex{
      int x;
      int y;
      complex(int x, int y ){
            this.x = x;
            this.y = y;
      }
      
      void sum(complex c2){
            this.x = this.x+c2.x;
            this.y = this.y+c2.y;
            if(this.y<0){
            System.out.println("the equation is = "+this.x+this.y+"i");
            
      }
      else{
            System.out.println("the equation is = "+this.x+"+"+this.y+"i");
      }
            
}
}
            
public class ComplexAddition{
	public static void main(String[] args) {
		complex c1 = new complex(1,2);
		complex c2 = new complex(2,3);
		c1.sum(c2);
		
		
	}
}