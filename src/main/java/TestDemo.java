import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		// Checking if parameter is zero or negative
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Both parameters must be positive");
		}
		// Returns the sum if parameters are positive
		return a +b;
	}
	   // returns the number given in half if the number is even, if the number is odd 1 is added to it.
	public int halved(int a) {
		
		if(a % 2 == 0) {
			
		return a / 2;
		
		} else {
			
			return(a + 1) / 2;
			
		}	
	}
    public int randomNumberSquared() {
    	int result = getRandomInt();
    	return result * result;
    }
    public int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}
