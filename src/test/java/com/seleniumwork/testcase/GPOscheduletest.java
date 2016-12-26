package com.seleniumwork.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.seleniumwork.page.HPEFSHome;
import com.seleniumwork.page.LoginGPO;
import com.seleniumwork.util.DriverFactory;

public class GPOscheduletest {

	@Test
	public void createSchedule(){
		
		WebDriver driver = DriverFactory.getIEDriver();
	    driver.get("http://g1w6334g.austin.hpecorp.net/portal/server.pt?open=space&name=Login&control=Login&doLogout=&clearsession=true&in_hi_userid=10418&cached=true");//访问地址，这个环节以后可以封装到 page 类中
		LoginGPO lg=new LoginGPO("\\page-locator-repository.xml",driver,"/login.xls");
		lg.loginGPO();
		HPEFSHome hpefsHome=new HPEFSHome("\\page-locator-repository.xml", driver, null);
		hpefsHome.goToPhoenix();
	}
	
}
