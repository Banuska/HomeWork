package code.pages;

import code.util.BrowserUtils;
import code.util.Driver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RenasTechQuoteEntry extends BrowserUtils {
    public RenasTechQuoteEntry() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    private static final Logger logger = Logger.getLogger(RenasTechQuoteEntry.class);
    @FindBy(xpath = "//h2[.='Vehicle Details']")
    private WebElement vehicleDetailText;
    @FindBy(xpath = "//div[@id='mat-select-value-1']")
    private WebElement vehicleYearBox;
    @FindBy(xpath = "//span[contains(text(),'1993')]")
    private WebElement vehicleYearSelection;
    @FindBy(xpath = "//span[ contains(@class,'tns-c60-9')]")
    private WebElement vehicleMakeBox;
    @FindBy(xpath = "//span[ contains(text(),'Acura')]")
    private WebElement vehicleMakeSelection;
    @FindBy(xpath = "//span[contains(@class,'ng-tns-c60-11')]")
    private WebElement vehicleModelBox;
    @FindBy(xpath = "//span[contains(text(),'Vigor')]")
    private WebElement vehicleModelSelection;
    @FindBy(id = "next-step" )
    private  WebElement  VehicleNextButton;
    @FindBy(xpath ="//button[@id='mat-button-toggle-5-button']/span")
    private WebElement financeDetails;
    @FindBy (id = "next-step2")
    private WebElement nextFinanceDetail;
    @FindBy(id = "mat-input-0")
    private WebElement drivingDistance;
    @FindBy(xpath = "//label[@for='mat-checkbox-1-input']/span")
    private WebElement commuteWork;
    @FindBy(xpath = "//label[@for='mat-checkbox-2-input']/span")
    private WebElement  conductBusiness;
    @FindBy(id ="next-step3")
    private WebElement nextButtonForDistance;
    @FindBy(id="mat-input-1")
    private  WebElement coverageDate;
    @FindBy(id="next-step4")
    private  WebElement nextButtonCoverage;
    @FindBy(xpath = "//button[@id='mat-button-toggle-7-button']/span")
    private  WebElement winterTireYes;
    @FindBy(xpath = "//button[@id='mat-button-toggle-10-button']/span")
    private WebElement TdSavingNo;
    @FindBy(id = "next-step5")
    private WebElement nextSavingDiscount;
    @FindBy(id = "mat-input-2")
    private WebElement drivingLicense;
    @FindBy(id="next-step6")
    private WebElement nextDrivingLicense;
    @FindBy(id = "mat-button-toggle-11-button")
    private WebElement obtainDriverLicense;
    @FindBy(id="next-step7")
    private WebElement submitButtonDriverLicense;
    @FindBy(id = "let-us-call-you")
    private WebElement letUsCallYouButton;







    public void setVehicleDetailTextVerification( String expectedText) {

        Assert.assertEquals(vehicleDetailText.getText(),expectedText);
        logger.error("The option you have provided is not found."   );
    }
    public void setVehicleYearBox() {
        vehicleYearBox.click();
        logger.error("The option you have provided is not found.Please check your selection"   );
    }
    public void setVehicleYearSelection() {
      vehicleYearSelection.click();
        logger.error("The option you have provided is not found.Please check your selection"   );
    }
    public void setVehicleMakeBox() {
        vehicleMakeBox.click();
    }

    public void setVehicleMakeSelection() {
        vehicleMakeSelection.click();
    }

    public void setVehicleModelBox() {
       vehicleModelBox.click();
    }

    public void setVehicleModelSelection() {
        vehicleModelSelection.click();
    }

    public void setVehicleNextButton() {
        VehicleNextButton.click();
    }



    public void setFinanceDetails() {
        BrowserUtils.staticWait(2);
        financeDetails.click();

    }

    public void setNextFinanceDetail() {
        BrowserUtils.staticWait(4);
       nextFinanceDetail.click();


    }

    public void getDrivingDistance(String distance) {
        drivingDistance.sendKeys(distance);
    }

    public void setCommuteWork() {
       commuteWork.click();
    }

    public void setConductBusiness() {
   conductBusiness.click();
    }

    public void setNextButtonForDistance() {
    nextButtonForDistance.click();
    }

    public void setCoverageDate(String date) {
        coverageDate.sendKeys(date);
    }

    public void setNextButtonCoverage() {
       nextButtonCoverage.click();
    }

    public void setWinterTireYes() {
        winterTireYes.click();
    }

    public void setTdSavingNo() {
        TdSavingNo.click();
    }

    public void setNextSavingDiscount() {
       nextSavingDiscount.click();
    }

    public void setDrivingLicense(String DrivingLicense) {
        drivingLicense.sendKeys(DrivingLicense);
    }

    public void setNextDrivingLicense() {
        nextDrivingLicense.click();
    }

    public void setObtainDriverLicense() {
        obtainDriverLicense.click();
    }

    public void setsubmitButtonDriverLicense() {
       submitButtonDriverLicense.click();
    }

    public void setLetUsCallYouButton() {
        Assert.assertTrue(letUsCallYouButton.isDisplayed());
    }
}
