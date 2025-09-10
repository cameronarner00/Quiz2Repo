package hw0;
import java.util.Random;

//display a random greeting
public class RandomHello {

	public static void main(String[] argv) {
		RandomHello randomHello = new RandomHello();
		System.out.println(randomHello.getGreeting());
	}
	
	public String getGreeting() {
		Random randomGenerator = new Random();
		//create an array for random greetings
		String[] greetings = new String[5];
		greetings[0] = "Hello, world";
		greetings[1] = "What's up, man";
		greetings[2] = "Heyyy";
		greetings[3] = "Hi!";
		greetings[4] = "What's happening?";
		//index is a random integer from 0 to 4
		int index = randomGenerator.nextInt(5);
		return greetings[index];
	}
	
		
}
