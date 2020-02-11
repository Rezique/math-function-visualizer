/**
 * AdditionFunction.java --- Implements DoubleFunctionOfTwoInts interface.
 * 							   Method returns x+bi.
 * @author Ziqing Zhang
 * @version 1.0
 * @since 2019-10-17
*/

package func;

public class AdditionFunction implements DoubleFunctionOfTwoInts
{
	
	// Method adds x + y
	@Override
	public double fOfXY(int x, int y)
	{
		return x + y;
	}
	
	// Method that gives the name of the function.
	@Override
	public String getName()
	{
		return "Addition";
	}
}
