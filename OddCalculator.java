// some class to test previously created 'EvenNumberException' in package
public class OddCalculator {
    // method using the created 'EvenNumberException'
    // Note: In order to use previously created Exception ... declare it on the method signature
    /* Aside: 'EvenNumberException' DN inherit from RunTimeException so it's an checked exception 
     * thus to communicate w/ rest of program if problem may arise ..
    */
    //  'throws' this 'sumOddNumbers' method if encounters problem
    public int sumOddNumbers(int a, int b) throws EvenNumberException {
        // if input 'a' is divisible by 2 --- aka even ...
        if(a % 2 == 0){
            // throw this Exception along w/ custom message to output stream
            throw new EvenNumberException("1st input was even desu! 🥇");
        }
        // otherwise if input 'b' is even ...
        else if(b % 2 == 0){
            // throw this Exception along w/ custom message to console log
            throw new EvenNumberException("2nd input was even! ⚁");
        }
        return(a + b);
    }
}
// To handle this exception as it occurs in the program ...
// 1) create an isntance of 'OddCalculator'
// 2) invoke 'sumOddNumbers() method'
// * Navigate to 'Main.java'
