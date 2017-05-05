package weekend;

public class Powerof10 {
	public String power(int number) {
		boolean valid=true;
		String word = "";
		switch (number) {
		case 6:
			word = "million";
			break;
		case 9:
			word = "Billion";
			break;
		case 12:
			word = "Trillion";
			break;
		case 15:
			word = "Quadrillion";
			break;
		case 18:
			word = "Quintillion";
			break;
		case 21:
			word = "sextillion";
			break;
		case 30:
			word = "Nonillion";
			break;
		case 100:
			word = "Googol";
			break;
		default:
        valid=false;
		}
		if(valid)
		System.out.println("10 raised to the"+ number+ "th power is a"+word+"");
		else
			System.out.println("enter valid number");
		
		return word;
	}
}