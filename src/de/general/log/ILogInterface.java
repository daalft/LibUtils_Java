/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.general.log;

/**
 *
 * @author knauth
 */
public interface ILogInterface
{

	////////////////////////////////////////////////////////////////
	// Constants
	////////////////////////////////////////////////////////////////

	////////////////////////////////////////////////////////////////
	// Variables
	////////////////////////////////////////////////////////////////

	////////////////////////////////////////////////////////////////
	// Constructors
	////////////////////////////////////////////////////////////////

	////////////////////////////////////////////////////////////////
	// Methods
	////////////////////////////////////////////////////////////////

	public void debug(String text);

	public void debug(String text, String param0);

	public void info(String text);

	public void info(String text, String param0);

	public void warn(String text);

	public void warn(String text, String param0);

	public void error(String text);

	public void error(String text, String param0);

	public void error(Throwable ee);

}