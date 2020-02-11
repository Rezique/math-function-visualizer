/**
 * ComplexSquaredNormFunction.java --- Implements DoubleFunctionOfTwoInts interface. 
 * 								 Method return the norm of (x+bi)*(x+bi).
 * @author Ziqing Zhang
 * @version 1.0
 * @since 2019-10-17
*/

package func;

public class ComplexSquaredNormFunction implements DoubleFunctionOfTwoInts
{
	
	// Computes the norm of (x + y) * (x + y).
	@Override
	public double fOfXY(int x, int y)
	{
		return Math.pow(x, 2) + Math.pow(y, 2);
	}
	
	// Method that gives the name of the function.
	@Override
	public String getName()
	{
		return "Complex Squared Norm";
	}
	
}
