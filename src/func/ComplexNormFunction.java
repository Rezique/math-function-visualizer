/**
 * ComplexNormFunction.java --- Implements DoubleFunctionOfTwoInts interface. 
 * 								 Method return the norm of this complex number.
 * @author Ziqing Zhang
 * @version 1.0
 * @since 2019-10-17
*/

package func;

public class ComplexNormFunction implements DoubleFunctionOfTwoInts
{
	
	// Method that computes x and y in the form of (x^2 + y^2)
	@Override
	public double fOfXY(int x, int y)
	{
		return Math.sqrt(Math.pow(x, 2) +Math.pow(y, 2));
	}
	
	// Method that gives the name of the function.
	@Override
	public String getName()
	{
		return "Complex Norm";
	}
}
