class Pokemon{
     private  String name;
      private String type;
      private int hp;
      private int speed;
      private int attack;
      private int defense;
      //constractor
      Pokemon(String name,String type,int hp,int speed,int attack,int defense ){
            this.name = name;
            this.type = type;
            this.hp = hp;
            this.speed = speed;
            this.attack= attack;
            this.defense = defense;
      }
      void display (){
            System.out.println("Pokemon name = " +this.name);
			System.out.println("Pokemon type = " + this.type);
			System.out.println("Pokemon hp = " + this.hp);
			System.out.println("Pokemon speed = " + this.speed);
			System.out.println("Pokemon attack  = " + this.attack);
			System.out.println("Pokemon defense = " + this.defense);
			System.out.println("🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆");
      }
}
public class RivisionOopsThree{
	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("Pikachu", "Electric", 100, 70, 110, 80);
		p1.display();

		Pokemon p2 = new Pokemon("Charizard", "water", 80, 110, 105, 90);
		p2.display();
		
	}
}