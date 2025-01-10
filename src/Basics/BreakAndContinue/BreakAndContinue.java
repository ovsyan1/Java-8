package Basics.BreakAndContinue;

public class BreakAndContinue {
    static void b1 () {
        int counter = 0;
        double randomValue;


        do{
            randomValue = Math.random();
            counter++;
        } while(randomValue <= 0.1 || randomValue >= 0.2);
        System.out.println(counter);
    }

    static void b2 (){
        int index = 0;
		int counter = 0;
		
		while(counter <= Integer.MAX_VALUE) {
			double randomValue = Math.random();
			
			if(randomValue >= 0.1 || randomValue <= 0.2) {
				System.out.println(randomValue);
				counter++;
				if(counter == 10) {
					break;
				}
			} else {
				continue;
			}
			
			index++;
		}
    }

    public static void main(String[] args) {
        b1();
        System.out.println();
        b2();
    }
}
