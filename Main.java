// test custom created exception here (compile & run this .java file as it's brain of operation -- main() method is what JVM looks for)
public class Main {
    
    public static void main(String[] args) {
        // try-catch for error-handling
        // needed here to handle any unexpected exceptions from .sumOddNumbers() 
        try{
            // 1) create an instance of 'OddCalculator' class
            OddCalculator calculate = new OddCalculator();

            // 2) invoke 'sumOddNumbers()' method
            // int sum = calculate.sumOddNumbers(1, 3);
            // System.out.println(sum);    // pass

            int sum2 = calculate.sumOddNumbers(2, 3);
            System.out.println(sum2);   // fail 

            // 2) invoke 'sumDifferentOddNumbers()' method -- check if inputs either inputs are even OR duplicates 
            int sum3 = calculate.sumDifferentOddNumbers(3, 3);
            System.out.println(sum3);   // fail -- won't reach this as Line #15 triggers an Exception already
        }
        // catch any thrown 'EvenNumberException' -- here 'e' references to any caught'EvenNumberException'
        catch(EvenNumberException e){   // Exception e
            // printing a stack track is for any functionality that can occur w/ anything inherited from 'Throwable' class
            e.printStackTrace();
            // System.out.println(e);
        }
        // catch any thrown 'DuplicateInputException'
        catch(DuplicateInputException e){
            // once against accessing stack trace to combat any issues inheriting from 'Throwable' parent-parent class 
            e.printStackTrace();
        }
        
    }
}
