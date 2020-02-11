package func;

public class ReziCreativeFunction implements DoubleFunctionOfTwoInts
{
	@Override
	public double fOfXY(int x, int y) 
	{
		if(y == 0)
			y = 1;
		
		if(x == 0)
			x = 1;

		double c = Math.pow(x/y, 24);
		double d = Math.pow(x, 2) + Math.pow(y - 4, 2);
		double e = Math.pow(y/(4*x), 48);
		double g = x * y;
		
		//return c; // X red blue black pink
		//return d; // Page full of circles
		//return f; // Plaid shirt red, green pink
		//return g; // 九宫格
		return (c + g * e) / d;
	}

	// Method that gives the name of the function.
	@Override
	public String getName()
	{
		return "Rezi's Creative Function";
	}
}

