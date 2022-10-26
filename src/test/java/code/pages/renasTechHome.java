package code.pages;

import code.util.BrowserUtils;
import code.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class renasTechHome extends BrowserUtils {
    public renasTechHome(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "project-Insurance")
    private WebElement insuranceButton;


    public void setInsuranceButton(){
        clickWithWait(insuranceButton);

    }





}
