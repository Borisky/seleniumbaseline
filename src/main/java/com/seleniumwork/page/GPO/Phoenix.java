/**   
* @Title: Phoenix.java 
* @Package com.seleniumwork.page 
* @Description: TODO
* @author wxz  
* @date 2016年12月26日 下午4:28:07 
*/

package com.seleniumwork.page.GPO;

import org.openqa.selenium.WebDriver;

import com.seleniumwork.util.BasePage;
import com.seleniumwork.util.Locator;

/* @author xiaozhe
 *
 * @date 2016年12月26日 下午4:28:07 
 */
public class Phoenix extends BasePage{
	Locator schedule=getLocators().get("Schedule");
	
	public Phoenix(String xmlLocatorPath, WebDriver driver,String sourcePath){
		super(xmlLocatorPath, driver, sourcePath);
	}
	
	public void gotoSchedule(){
		getElement.getElement(driver, schedule).click();
	}
}
