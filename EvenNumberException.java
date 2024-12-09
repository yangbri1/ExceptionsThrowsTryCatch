// We are extending to 'Exception' super class (parent of this)
/* Side Note: could go a step above 'Exception' class & extend to 'Throwable' class ...
 * but why re-invent the wheel when there are built-in Exceptions provided by this class already ...
*/
// Aside: 'EvenNumberException' is a checked exception (not RuntimeException)
class EvenNumberException extends Exception {
    // create a Constructor
    // Recall: Constructor's naming convention must be the SAME as the overarching class
    EvenNumberException(String message) {
        // leverage built-in functionality from 'Exception' class for this case
        super(message);
    }
}