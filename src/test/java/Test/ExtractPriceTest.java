
package Test;

import Page.FlightsPage;
import Page.ListPricePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtractPriceTest extends BaseWebTest{

    @Test
    public void extractPrice(){
        FlightsPage flightsPage = new FlightsPage(driver, explicitWait);
        ListPricePage ListPricePage = new ListPricePage(driver, explicitWait);
        flightsPage.search();
        ListPricePage.setExtractPrice();
        String txtExpPrice = "₹ 12,575\n" + "per adult";
        Assert.assertEquals(txtExpPrice, ListPricePage.setExtractPrice());
    }

}