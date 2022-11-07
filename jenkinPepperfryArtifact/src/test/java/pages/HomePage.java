package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumUtils;

public class HomePage extends SeleniumUtils {

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body[@class='active']")
	WebElement modalPresent;

	@FindBy(xpath = "//*[@id=\"regPopUp\"]/a")
	WebElement modalClose;

	@FindBy(xpath = "//input[@id='search']")
	WebElement searchBox;

	@FindBy(xpath = "//input[@id='searchButton']")
	WebElement searchIcon;

	public void modalwindowClose(String text) {

		ActionClick(modalClose);
		enterText(searchBox, text);
		seleClick(searchIcon);

	}

}
