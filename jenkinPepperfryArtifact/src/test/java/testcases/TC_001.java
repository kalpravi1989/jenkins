package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.SearchPage;

public class TC_001 extends BaseClass {

	@Test
	@Parameters({ "url", "searchItem" })
	public void searchItem(String url, String itemName) {
		driver.get(url);
		HomePage hm = new HomePage(driver);
		hm.modalwindowClose(itemName);
		SearchPage sp = new SearchPage(driver);
		sp.printSearchedItems();

	}


}
