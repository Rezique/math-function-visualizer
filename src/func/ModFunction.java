/**
 * ModFunction.java --- Implements DoubleFunctionOfTwoInts interface. Method return the 
 * 							method return x modulus y. Avoids y to be equal to 0.
 * @author Ziqing Zhang
 * @version 1.0
 * @since 2019-10-17
*/

package func;

public class ModFunction implements DoubleFunctionOfTwoInts
{
	// Method that calculates x modulus y.
	@Override
	public double fOfXY(int x, int y)
	{
		if(y == 0)
			y = 1;
	
		return x % y;	
	}
	
	// Method that gives the name of the function.
	@Override
	public String getName()
	{
		return "Modulus";
	}

}
