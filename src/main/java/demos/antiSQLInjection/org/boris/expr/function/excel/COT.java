
package org.boris.expr.function.excel;

import org.boris.expr.ExprException;
import org.boris.expr.function.DoubleInOutFunction;

public class COT extends DoubleInOutFunction
{

	protected double evaluate( double value ) throws ExprException
	{
		return 1 / Math.tan( value );
	}
}
