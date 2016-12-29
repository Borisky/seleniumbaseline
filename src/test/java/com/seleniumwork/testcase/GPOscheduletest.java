package com.seleniumwork.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.seleniumwork.page.GPO.HPEFSHome;
import com.seleniumwork.page.GPO.LoginGPO;
import com.seleniumwork.page.GPO.Phoenix;
import com.seleniumwork.util.DriverFactory;

public class GPOscheduletest {

	@Test
	public void createSchedule(){
		
		WebDriver driver = DriverFactory.getIEDriver();
	    driver.get("http://hpfs-itg-int-portal.austin.hpecorp.net/portal/server.pt");//访问地址，这个环节以后可以封装到 page 类中
	    //Login GPO
	    LoginGPO lg=new LoginGPO("\\page-locator-repository.xml",driver,"/login.xls");
		lg.loginGPO();
		//Go to Phoenix page
		HPEFSHome hpefsHome=new HPEFSHome("\\page-locator-repository.xml", driver, null);
		hpefsHome.goToPhoenix();
		//Go to Schedule page
		Phoenix phoenix=new Phoenix("\\page-locator-repository.xml", driver, null);
		phoenix.gotoSchedule();
	}
	
}
