package pages.listing;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.NumberOfItems.NUMBER_OF_CARD_PER_PAGE;

public class ImkListingPage extends BasePage {
    public ImkListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//li[contains(@class, 'js-product')]");

    public ImkListingPage checkCountCards() {
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, NUMBER_OF_CARD_PER_PAGE);
        return this;
    }
}
