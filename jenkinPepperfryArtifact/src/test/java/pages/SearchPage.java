package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utils.SeleniumUtils;

public class SearchPage extends SeleniumUtils {
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='clipCard__contatiner main-cntnt-crd']//h2/a")
	List<WebElement> searcheditems;

	public void printSearchedItems() {

		List<String> itemsName = new ArrayList<String>();
		for (WebElement e : searcheditems) {
			String s = e.getText();
			itemsName.add(s);
		}
		Collections.sort(itemsName);
		Reporter.log("--------------------------");
		Reporter.log("      Ascending order");
		Reporter.log("-------------------------");
		for (String s : itemsName) {
			Reporter.log(s);
			System.out.println(s);
		}
		Collections.reverse(itemsName);
		Reporter.log("--------------------------");
		Reporter.log("     Descending order");
		Reporter.log("--------------------------");
		for (String s : itemsName) {
			Reporter.log(s);
			System.out.println(s);
		}
	}
}

