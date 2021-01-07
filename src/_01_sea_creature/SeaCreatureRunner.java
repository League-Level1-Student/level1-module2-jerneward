package _01_sea_creature;

public class SeaCreatureRunner {

public static void main(String[] args) {

	SeaCreature Spongebob = new SeaCreature("Spongebob"); 
	
	Spongebob.eat();
	Spongebob.laugh();
	
	SeaCreature Patrick = new SeaCreature("Patrick");
	
	Patrick.eat();
	Patrick.laugh();
	
	SeaCreature Squidward = new SeaCreature ("Squidward");
	
	Squidward.eat();
	Squidward.laugh();
}	
}
