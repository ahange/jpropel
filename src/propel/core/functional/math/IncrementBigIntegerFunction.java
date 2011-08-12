/*
 ///////////////////////////////////////////////////////////
 //  This file is part of Propel.
 //
 //  Propel is free software: you can redistribute it and/or modify
 //  it under the terms of the GNU Lesser General Public License as published by
 //  the Free Software Foundation, either version 3 of the License, or
 //  (at your option) any later version.
 //
 //  Propel is distributed in the hope that it will be useful,
 //  but WITHOUT ANY WARRANTY; without even the implied warranty of
 //  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 //  GNU Lesser General Public License for more details.
 //
 //  You should have received a copy of the GNU Lesser General Public License
 //  along with Propel.  If not, see <http://www.gnu.org/licenses/>.
 ///////////////////////////////////////////////////////////
 //  Authored by: Nikolaos Tountas -> salam.kaser-at-gmail.com
 ///////////////////////////////////////////////////////////
 */
package propel.core.functional.math;

import propel.core.functional.FunctionWithOneArgument;

import java.math.BigInteger;

/**
 * Function that can be used to provide increments of a specific step.
 */
public final class IncrementBigIntegerFunction
		extends FunctionWithOneArgument<BigInteger, BigInteger>
{
	private final BigInteger step;

	/**
	 * Constructor initializes with the step value
	 */
	public IncrementBigIntegerFunction(BigInteger step)
	{
		super(BigInteger.class, BigInteger.class);
		this.step = step;
	}

	@Override
	public BigInteger operateOn(BigInteger arg)
	{
		return arg.add(step);
	}
}
