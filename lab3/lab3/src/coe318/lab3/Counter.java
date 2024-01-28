/**
 *
 * @author Your Name
 */
package coe318.lab3;
public class Counter {
    //Instance variables her
    int base;
    Counter leftCount;
    int countVal;
    public Counter(int modulus, Counter left) {
        this.base = modulus;
        this.leftCount = left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return base;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {

        return leftCount;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return countVal;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        countVal = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        countVal++; 
        if (countVal >= base) {
            setDigit(0);
            if (leftCount != null) {
                leftCount.increment();
            }
        }
    
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if (leftCount != null) {
            return base * leftCount.getCount() + countVal;
        }
        return countVal;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}