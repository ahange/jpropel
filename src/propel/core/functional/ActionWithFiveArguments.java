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
package propel.core.functional;

import propel.core.utils.SuperTypeToken;

/**
 * This encapsulates a generic action that uses five arguments.
 */
public abstract class ActionWithFiveArguments<T1, T2, T3, T4, T5>
{
	private final Class<?> genericTypeParameter1;
	private final Class<?> genericTypeParameter2;
	private final Class<?> genericTypeParameter3;
	private final Class<?> genericTypeParameter4;
	private final Class<?> genericTypeParameter5;

	public ActionWithFiveArguments()
	{
		genericTypeParameter1 = SuperTypeToken.getClazz(this.getClass(), 0);
		genericTypeParameter2 = SuperTypeToken.getClazz(this.getClass(), 1);
		genericTypeParameter3 = SuperTypeToken.getClazz(this.getClass(), 2);
		genericTypeParameter4 = SuperTypeToken.getClazz(this.getClass(), 3);
		genericTypeParameter5 = SuperTypeToken.getClazz(this.getClass(), 4);
	}

	public ActionWithFiveArguments(Class<T1> genericTypeParameter1, Class<?> genericTypeParameter2, Class<?> genericTypeParameter3, Class<?> genericTypeParameter4, Class<?> genericTypeParameter5)
	{
		if(genericTypeParameter1 == null)
			throw new NullPointerException("genericTypeParameter1");
		if(genericTypeParameter2 == null)
			throw new NullPointerException("genericTypeParameter2");
		if(genericTypeParameter3 == null)
			throw new NullPointerException("genericTypeParameter3");
		if(genericTypeParameter4 == null)
			throw new NullPointerException("genericTypeParameter4");
		if(genericTypeParameter5 == null)
			throw new NullPointerException("genericTypeParameter5");

		this.genericTypeParameter1 = genericTypeParameter1;
		this.genericTypeParameter2 = genericTypeParameter2;
		this.genericTypeParameter3 = genericTypeParameter3;
		this.genericTypeParameter4 = genericTypeParameter4;
		this.genericTypeParameter5 = genericTypeParameter5;
	}

	/**
	 * Execute the action
	 */
	public abstract void executeWith(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5);

	/**
	 * Returns the first generic type parameter used to initialize this class.
	 */
	public Class<?> getGenericTypeParameter1()
	{
		return genericTypeParameter1;
	}

	/**
	 * Returns the second generic type parameter used to initialize this class.
	 */
	public Class<?> getGenericTypeParameter2()
	{
		return genericTypeParameter2;
	}

	/**
	 * Returns the third generic type parameter used to initialize this class.
	 */
	public Class<?> getGenericTypeParameter3()
	{
		return genericTypeParameter3;
	}

	/**
	 * Returns the fourth generic type parameter used to initialize this class.
	 */
	public Class<?> getGenericTypeParameter4()
	{
		return genericTypeParameter4;
	}

	/**
	 * Returns the fifth generic type parameter used to initialize this class.
	 */
	public Class<?> getGenericTypeParameter5()
	{
		return genericTypeParameter5;
	}
}
