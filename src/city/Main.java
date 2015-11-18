package city;

import java.util.Random;

import letter.Letter;
import letter.SimpleLetter;
import letter.content.Content;
import letter.content.Text;

public class Main {
	
	public static int randomInt(int i) {
		Random random = new Random();
		return random.nextInt(i);
	}
	
	
	public static void main(String[] args) {
	  City lille = new City ("lille");
	  
	  for (int i = 0 ; i < 100 ; i++) {
		  lille.addInhabitant(new Inhabitant("inhabitant"+i, lille));
	  }
	  
	  for (int i = 1 ; i <= 2 ; i++) {
		  
		  for(int j = 0 ; j< randomInt(100) ; j++) {
			  lille.sendLetter(new SimpleLetter(lille.inhabitants.get(randomInt(100)), lille.inhabitants.get(randomInt(100)), new Text("blabla")));
		  }
		  lille.distributeLetter();
	  }
	}
}
