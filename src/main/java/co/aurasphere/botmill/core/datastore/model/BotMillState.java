/*
 * MIT License
 *
 * Copyright (c) 2016 BotMill.io
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package co.aurasphere.botmill.core.datastore.model;

/**
 * The Interface BotMillState.
 */
public interface BotMillState {
	
	/**
	 * Builds the session.
	 *
	 * @param identifier the identifier
	 * @return the session
	 */
	public Session buildSession(String identifier);
	
	/**
	 * Destroy session.
	 *
	 * @param identifier the identifier
	 */
	public void destroySession(String identifier);
	
	/**
	 * Sets the variable.
	 *
	 * @param identifier the identifier
	 * @param keyValuePair the key value pair
	 * @return the session
	 */
	public Session setVariable(String identifier, KeyValuePair keyValuePair);
	
	/**
	 * Gets the variable.
	 *
	 * @param identifier the identifier
	 * @param key the key
	 * @return the variable
	 */
	public KeyValuePair getVariable(String identifier, String key);
	
}
