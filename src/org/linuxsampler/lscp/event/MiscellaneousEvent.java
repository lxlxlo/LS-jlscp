/*
 *   jlscp - a java LinuxSampler control protocol API
 *
 *   Copyright (C) 2005 Grigor Kirilov Iliev
 *
 *   This file is part of jlscp.
 *
 *   jlscp is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License version 2
 *   as published by the Free Software Foundation.
 *
 *   jlscp is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with jlscp; if not, write to the Free Software
 *   Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 *   MA  02111-1307  USA
 */

package org.linuxsampler.lscp.event;

/**
 * A semantic event which provides some miscellaneous or debugging information.
 *
 * @author  Grigor Iliev
 */
public class MiscellaneousEvent extends java.util.EventObject {
	private String message;
	
	/**
	 * Constructs a <code>MiscellaneousEvent</code> object.
	 *
	 * @param source The object that originated the event.
	 * @param message A <code>String</code> instance describing the event.
	 */
	public
	MiscellaneousEvent(Object source, String message) {
		super(source);
		this.message = message;
	}
	
	/**
	 * Gets a <code>String</code> instance describing the event.
	 * @return A <code>String</code> instance describing the event.
	 */
	public String
	getEventMessage() { return message; }
}