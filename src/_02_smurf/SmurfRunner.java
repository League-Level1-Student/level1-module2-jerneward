package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		
		Smurf handysmurf = new Smurf("Handy");
		
		String name1 = handysmurf.getName();
		System.out.println(name1);
		handysmurf.eat();
		
		Smurf papasmurf = new Smurf("Papa");
		
		String name2 = papasmurf.getName();
		System.out.println(name2);
		String hat1 = papasmurf.getHatColor();
		System.out.println(hat1);
		String gender1 = papasmurf.isGirlOrBoy();
		System.out.println(gender1);
		
		
		Smurf smurfette = new Smurf("Smurfette");
		
		String name3 = smurfette.getName();
		System.out.println(name3);
		String hat2 = smurfette.getHatColor();
		System.out.println(hat2);
		String gender2 = smurfette.isGirlOrBoy();
		System.out.println(gender2);
		
		
	}
}
