class Pokemon {
	private String name;
	private String type;
	private int hp;
	private int speed;
	private int attack;
	private int defense;
	//constractor
	Pokemon(String name) { //constractor chaining
		this(name, null, 0, 0, 0, 0);
	}
	//constractor overloading
	//constractor Chaining
	Pokemon(String name, String type) {
		this(name, type, 0, 0, 0, 0);
	}
	//constractor overloading
	//constractor chaining
	Pokemon(String name, String type, int hp) {
		this(name, type, hp, 0, 0, 0);
	}
	//constractor overloading
	//constractor chaining
	Pokemon(String name, String type, int hp, int speed) {
		this(name, type, hp, speed, 0, 0);
	}
	//constractor overloading
	//constractor chaining
	Pokemon(String name, String type, int hp, int speed, int attack) {
		this(name, type, hp, speed, attack, 0);
	}
	//constractor overloading
	//constractor chaining
	Pokemon(String name, String type, int hp, int speed, int attack, int defense) {
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.speed = speed;
		this.attack = attack;
		this.defense = defense;
	}
	//use getter and setter
	String getName() {
		return name;
	}
	void setName(String x) {
		name = x;
	}
	//use getter and setter
	String getType() {
		return type;
	}
	void setType(String y) {
		type = y;
	}
	//use getter and setter
	int getHp() {
		return hp;
	}
	void setHp(int z) {
		hp = z;
	}
	//use getter and setter
	int getSpeed() {
		return speed;
	}
	void setSpeed(int k) {
		speed = k;
	}
	//use getter and setter
	int getAttack() {
		return attack;
	}
	void setAttack(int l) {
		attack = l;
	}
	//use getter and setter
	int getDefense() {
		return defense;
	}
	void setDefense(int a) {
		defense = a;
	}
	//use method
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

public class RivisionOopsFour {
	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("Pikachu", "Electric", 100, 70, 110, 80);
		p1.display();

		Pokemon p2 = new Pokemon("Charizard", "water");
		p2.display();

		Pokemon p3 = new Pokemon("Pikachu", "Electric", 100, 70);
		p3.display();

		Pokemon p4 = new Pokemon("Charizard", "water", 80, 110, 105);
		p4.display();

		Pokemon p5 = new Pokemon("Pikachu", "Electric", 100);
		p5.display();

		Pokemon p6 = new Pokemon("Charizard");
		p6.display();


		Pokemon p7 = new Pokemon("Pikachu", "electricity", 100, 70, 110, 80);
		System.out.println("without change information ");
		p7.display();
		System.out.println("After change information ");
		p7.setName("Abir deb");
		p7.setType("water");
		p7.setHp(200);
		p7.setSpeed(60);
		p7.setAttack(100);
		p7.setDefense(140);
		p7.display();

		//now we can use getter setter and change every private variables value



	}
}