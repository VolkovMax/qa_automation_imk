package pages.ImkHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ImkHomePage extends BasePage {

    public ImkHomePage(WebDriver driver) {
        super(driver);
    }

    private final By chooseRegionBtn = By.className("qa-choose-region");
    private final By regionName = By.xpath("//*[@id=\"tippy-2\"]/div[2]/div/div[2]/ul/li[3]/a");
    private final By searchInput = By.ByXPath.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div/div[3]/form/div/input");
    private final By serchBtn = By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div/div[3]/form/input[2]");

    public ImkHomePage changeRegion() {
        driver.findElement(chooseRegionBtn).click();
        driver.findElement(regionName).click();

        return this;
    }

    public ImkHomePage searchSomething(String search) {
        driver.findElement(searchInput).sendKeys(search);
        driver.findElement(serchBtn).click();

        return this;
    }
}
