/**
 * HypotFunction.java --- Implements DoubleFunctionOfTwoInts interface. Method return the 
 * 							hypotenuse of a right triangle whose legs have length x and y.
 * @author Ziqing Zhang
 * @version 1.0
 * @since 2019-10-17
*/

package func;

import java.lang.Math;

public class HypotFunction implements DoubleFunctionOfTwoInts
{
	// Method that calculates the hypotenuse of right triangle.
	@Override
	public double fOfXY(int x, int y)
	{
		return Math.hypot(x,y);
	}
	
	// Method that gives the name of the function.
	@Override
	public String getName()
	{
		return "Hypotenuse";
	}
}