package tests.searchItem;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.ItemForSearch.PEN;
import static constants.Constant.Urls.IMK_HONE_PAGE;

public class SearchItem extends BaseTest {

    @Test
    public void checkIsRegionChange() {
        basePage.open(IMK_HONE_PAGE);

        imkHomePage.changeRegion().searchSomething(PEN);

        imkListingPage.checkCountCards();
    }
}
