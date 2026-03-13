class Pokemon {
	private  String name;
	private String type;
	private int hp;
	private int speed;
	private int attack;
	private int defense;
	
	//now we can access it use constractor 
	Pokemon(String name,String type,int hp,int speed,int attack,int defense){
	      this.name = name;
	      this.type = type;
	      this.hp = hp;
	      this.speed = speed;
	      this.attack = attack;
	      this.defense= defense;
	}
	void display(){
	      System.out.println("Pokemon name = " + name);
			System.out.println("Pokemon type = " + type);
			System.out.println("Pokemon hp = " + hp);
			System.out.println("Pokemon speed = " + speed);
			System.out.println("Pokemon attack  = " + attack);
			System.out.println("Pokemon defense = " + defense);
			System.out.println("🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆");
	}
}
	
	

	public class RivisionOopsTwo {
		public static void main(String[] args) {
		      Pokemon p1 = new Pokemon("Pikachu", "Electric", 100, 70, 110, 80);
		      p1.display();
		
		// we can not change any value without use getter setter 
	//	p1.type= water; this line show me error bcz this variable is private
	//	System.out.println(p1.type); same this line show me error bcz type is a private variable 

		Pokemon p2 = new Pokemon("Charizard", "water", 80, 110, 105, 90);
		p2.display();


		}
	}