package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * @author Your Name
 */
public class ComplexNumber {
//Instance variable declarations
    private final double real;
    private final double imaginary;
    /**
     * Construct a ComplexNumber given its real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(final double re, final double im) {
//Initialize the instance variables
        real = re;
        imaginary = im;
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
        return real;	//A stub: to be fixed
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return imaginary;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber number that is the negative of <em>this</em>.
     * Note: the original ComplexNumber is <b>NOT</b>
     * modified.
     *
     * @return -this
     */
    public ComplexNumber negate() {
        return  new ComplexNumber(-real, -imaginary); //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the sum of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
        double new_real = this.real+z.real;
        double new_imaginary = this.imaginary+z.imaginary;
        return new ComplexNumber(new_real, new_imaginary);	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the difference of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
//    public ComplexNumber subtract(ComplexNumber z) {
//        this.add(z.negate());
//        double new_real = this.real-z.real;
//        double new_imaginary =  this.imaginary-z.imaginary;
//        return new ComplexNumber(new_real, new_imaginary);
//    }
    
    public ComplexNumber subtract(ComplexNumber z) {
        double new_real = this.add(z.negate()).real;
        double new_imaginary =  this.add(z.negate()).imaginary;
        return new ComplexNumber(new_real, new_imaginary); //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the product of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
        double new_real = (this.real* z.real) - (this.imaginary * z.imaginary); 
        double new_imaginary = (this.real* z.imaginary) + (this.imaginary* z.real);
        return new ComplexNumber(new_real, new_imaginary);		//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the reciprocal of <em>this</em>.
     * Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        double denominator =this.real * this.real + this.imaginary * this.imaginary;
    
    if (denominator == 0.0) {
        System.out.println("Reciprocal is undefined for a complex number with a zero denominator.");
        return null;
    }
    
    double reciprocalReal =this.real/ denominator;
    double reciprocalImaginary = -this.imaginary / denominator;
    
    return new ComplexNumber(reciprocalReal, reciprocalImaginary); //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this / z
     */
//    public ComplexNumber divide(ComplexNumber z) {
//        double denominator = z.real * z.real + z.imaginary * z.imaginary;
// 
//        if (denominator == 0.0) {
//            System.out.println("Division by zero is not allowed.");
//            return null;
//        }
//        double resultReal = (this.real* z.real + this.imaginary * z.imaginary) / denominator;
//       
//        double resultImaginary = (this.imaginary * z.real -this.real * z.imaginary) / denominator;
//        
//        return new ComplexNumber(resultReal, resultImaginary);	//A stub: to be fixed
//    }
      public ComplexNumber divide(ComplexNumber z) {
      
        double resultReal = this.multiply(z.reciprocal()).real; 
        double resultImaginary = this.multiply(z.reciprocal()).imaginary;
        
        return new ComplexNumber(resultReal, resultImaginary);	//A stub: to be fixed
    }
    

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imagrinary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}