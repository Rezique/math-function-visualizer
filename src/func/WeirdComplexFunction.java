/**
 * WeirdComplexFunction.java --- Implements DoubleFunctionOfTwoInts interface.
 * @author Ziqing Zhang
 * @version 1.0
 * @since 2019-10-17
*/

package func;

public class WeirdComplexFunction implements DoubleFunctionOfTwoInts
{
	@Override
	public double fOfXY(int x, int y) 
	{
		Complex cOriginal = new Complex(x/125f, y/125f);
		Complex c = new Complex(cOriginal);
		
		for (int n=1; n<=255; n++)
		{
			if (c.norm() >= 2)
			{
				if (n%2 == 0) 
					//n = 0;
					n *= 30;
				return n;
			}
			c = Complex.multiply(c, c);
			c = Complex.add(c, cOriginal);
		}
		return 0;
	}
	
	
	// Method that gives the name of the function.
	@Override
	public String getName()
	{
		return "Weird complex function";
	}
}
