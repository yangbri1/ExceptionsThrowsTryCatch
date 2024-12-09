// test custom created exception here (compile & run this .java file as it's brain of operation -- main() method is what JVM looks for)
public class Main {
    
    public static void main(String[] args) {
        // try-catch for error-handling
        // needed here to handle any unexpected exceptions from .sumOddNumbers() 
        try{
            // 1) create an instance of 'OddCalculator' class
            OddCalculator calculate = new OddCalculator();
            // 2) invoke 'sumOddNumbers()' method
            int sum = calculate.sumOddNumbers(1, 3);
            System.out.println(sum);
        }
        // catch any thrown exception -- here 'e' references to any caught'EvenNumberException'
        catch(EvenNumberException e){   // Exception e
            // printing a stack track is for any functionality that can occur w/ anything inherited from 'Throwable' class
            e.printStackTrace();
            // System.out.println(e);
        }
        
    }
}
