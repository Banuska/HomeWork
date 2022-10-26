package code.pages;

import code.util.BrowserUtils;
import code.util.Driver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class renasTechInsurance extends BrowserUtils {
    public renasTechInsurance(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    private static final Logger logger = Logger.getLogger(renasTechInsurance.class);
@FindBy (id = "get-a-quote")
    private WebElement getQuoteButton;

@FindBy(xpath ="//h2[@class='blue']")
    private WebElement quoteHeaderText;
public void setInsurancePageVerification (String expectedText){
    Assert.assertEquals(quoteHeaderText.getText(),expectedText);
}

public void clickGetQuoteButton(){

    getQuoteButton.click();
    logger.error("The get a quote click Failed"   );
}

}
