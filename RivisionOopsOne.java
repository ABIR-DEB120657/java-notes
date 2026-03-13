public class RivisionOopsOne {
	public static class Pokemon {
		String name;
		String type;
		int hp;
		int speed;
		int attack;
		int defense;
		Pokemon(String name, String type, int hp, int speed, int attack, int defense) {
			this.name = name;
			this.type = type;
			this.hp = hp;
			this.speed = speed;
			this.attack = attack;
			this.defense = defense;
		}
		void display() {
			System.out.println("Pokemon name = " + name);
			System.out.println("Pokemon type = " + type);
			System.out.println("Pokemon hp = " + hp);
			System.out.println("Pokemon speed = " + speed);
			System.out.println("Pokemon attack  = " + attack);
			System.out.println("Pokemon defense = " + defense);
			System.out.println("🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆🫆");
		}
	}
	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("Pikachu", "Electric", 100, 70, 110, 80);
		p1.display();

		Pokemon p2 = new Pokemon("Charizard", "water", 80, 110, 105, 90);
		p2.display();

		Pokemon p3 = p1;
//p3 is shallow copy of p1 [p3 control p1 (p3 can change p1 values for example)]
		System.out.println("After change value use shallow copy ");
		p3.type = "water";
		p3.hp = 110;
		p3.speed = 90;
		p3.display();





	}
}