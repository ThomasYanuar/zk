/* B95_ZK_4615Test.java

	Purpose:
		
	Description:
		
	History:
		Mon Jul 6 14:26:36 CST 2020, Created by jameschu

Copyright (C) 2020 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.zktest.zats.test2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.zkoss.zktest.zats.WebDriverTestCase;

import java.util.Collections;

/**
 * @author jameschu
 */
public class B95_ZK_4615Test extends WebDriverTestCase {
	@Override
	protected ChromeOptions getWebDriverOptions() {
		return super.getWebDriverOptions()
				.setExperimentalOption("mobileEmulation", Collections.singletonMap("deviceName", "iPad"));
	}

	@Test
	public void test() {
		connect();
		click(jq("@button"));
		waitResponse();
		Assert.assertTrue(jq("$result").text().contains("headshim"));
	}
}
