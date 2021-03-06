/* Progress.java

	Purpose:
		
	Description:
		
	History:
		Tue Nov 14 10:19:42 2017, Created by jameschu

Copyright (C) 2017 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under LGPL Version 2.1 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.zhtml;

import org.zkoss.zhtml.impl.AbstractTag;
import org.zkoss.zk.ui.WrongValueException;

/**
 * The PROGRESS tag.
 * 
 * @author jameschu
 */
public class Progress extends AbstractTag {
	public Progress() {
		super("progress");
	}

	/**
	 * Returns the max of this progress tag.
	 * <p>Notice that this attribute refers to the corresponding attribute of the HTML5 specification.
	 * Hence, it would still be rendered to client-side as a DOM attribute even if the browser doesn’t support it.
	 * @since 8.5.1
	 */
	public Integer getMax() {
		return (Integer) getDynamicProperty("max");
	}

	/**
	 * Sets the max of this progress tag.
	 * <p>Notice that this attribute refers to the corresponding attribute of the HTML5 specification.
	 * Hence, it would still be rendered to client-side as a DOM attribute even if the browser doesn’t support it.
	 * @since 8.5.1
	 */
	public void setMax(Integer max) throws WrongValueException {
		setDynamicProperty("max", max);
	}

	/**
	 * Returns the value of this progress tag.
	 * <p>Notice that this attribute refers to the corresponding attribute of the HTML5 specification.
	 * Hence, it would still be rendered to client-side as a DOM attribute even if the browser doesn’t support it.
	 * @since 8.5.1
	 */
	public Integer getValue() {
		return (Integer) getDynamicProperty("value");
	}

	/**
	 * Sets the value of this progress tag.
	 * <p>Notice that this attribute refers to the corresponding attribute of the HTML5 specification.
	 * Hence, it would still be rendered to client-side as a DOM attribute even if the browser doesn’t support it.
	 * @since 8.5.1
	 */
	public void setValue(Integer value) throws WrongValueException {
		setDynamicProperty("value", value);
	}
}
