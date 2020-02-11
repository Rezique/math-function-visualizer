/**
 * Complex.java --- Contains multiple methods, instantiate variables and 
 * 					complex number methods; add, multiply, and norm.
 * @author Ziqing Zhang
 * @version 1.0
 * @since 2019-10-17
*/

package func;

public class Complex 
{
	private double			real;
	private double			imaginary;
	
	
	// Constructs an instance, given its real and imaginary components.
	public Complex(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	
	// Constructs an instance that duplicates source.
	public Complex(Complex source)
	{
		real = source.real;
		imaginary = source.imaginary;
	}
	
	
	// Getter method.
	public double getReal()
	{
		return real;
	}
	

	// Getter method.
	public double getImaginary()
	{
		return imaginary;
	}
	
	
	// Constructs and returns a new instance of Complex that represents the sum of its inputs,
	// according to the following formula:
	//
	// (a+bi) plus (c+di) = (a+c) + (b+d)i
	public static Complex add(Complex c1, Complex c2)
	{
		return new Complex((c1.real + c2.real), (c1.imaginary + c2.imaginary));
	}
	
	
	// Constructs and returns a new instance of Complex that represents the product of its inputs,
	// according to the following formula:
	//
	// (a+bi) times (c+di) = a*c + a*di + bi*c + bi*di = ac + (ad+bc)i + bd*ii
	// Since ii is -1 by definition, the last term is -bd ==> the result is ac-bd + (ad+bc)i
	public static Complex multiply(Complex c1, Complex c2)
	{
		return new Complex(c1.real * c2.real - c1.imaginary * c2.imaginary , (c1.real * c2.imaginary + c1.imaginary * c2.real));
	}
	
	
	// The "norm" of complex number a+bi is the square root of (a^2 + b^2).
	public double norm()
	{
		return Math.sqrt(Math.pow(real, 2) +Math.pow(imaginary, 2));
	}
}
