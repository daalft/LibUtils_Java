package de.general.util;


/**
 * A convenience class to implement String-Object-key-value-pairs
 *
 * @author knauth
 */
public class KVPStr
{

	////////////////////////////////////////////////////////////////
	// Constants
	////////////////////////////////////////////////////////////////

	////////////////////////////////////////////////////////////////
	// Variables
	////////////////////////////////////////////////////////////////

	String key;
	String value;

	////////////////////////////////////////////////////////////////
	// Constructors
	////////////////////////////////////////////////////////////////

	/**
	 * Constructor.
	 */
	public KVPStr(String key, String value)
	{
		this.key = key;
		this.value = value;
	}

	////////////////////////////////////////////////////////////////
	// Methods
	////////////////////////////////////////////////////////////////

	public String getKey()
	{
		return key;
	}

	public String getValue()
	{
		return value;
	}

}
