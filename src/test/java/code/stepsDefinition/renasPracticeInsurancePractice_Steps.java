package code.stepsDefinition;

import code.pages.renasTechHome;
import code.pages.renasTechInsurance;
import code.pages.RenasTechQuoteEntry;
import code.util.BrowserUtils;
import code.util.ConfigurationReader;
import code.util.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class renasPracticeInsurancePractice_Steps extends BrowserUtils {
    renasTechHome renasTechHome = new renasTechHome();
    renasTechInsurance renasTechInsurance = new renasTechInsurance();
    RenasTechQuoteEntry renasTechQuoteEntry=new RenasTechQuoteEntry();
    @Given("The user wants to go to renas practice herokuApp website")
    public void the_user_wants_to_go_to_renas_practice_heroku_app_website() {
        System.out.println("Browser lunched and testing stared");
        Driver.getDriver().get(ConfigurationReader.getProperties("renas_URL"));
        waitForPageToLoad(5);

    }
    @When("The user wants to click Insurance icon")
    public void the_user_wants_to_click_insurance_icon() {

        renasTechHome.setInsuranceButton();
    }
    @Then("The user wants to verify that get quote page is visible")
    public void the_user_wants_to_verify_that_get_quote_page_is_visible() {
        renasTechInsurance.setInsurancePageVerification("You could save 30% on Car Insurance when you're claims free.");


    }
    @Then("The user wants to click Get a Quote button")
    public void the_user_wants_to_click_get_a_quote_button() {
        renasTechInsurance.clickGetQuoteButton();
    }
    @Then("The user wants to verify that Get Quote button navigating to vehicle information")
    public void the_user_wants_to_verify_that_get_quote_button_navigating_to_vehicle_information() {
        renasTechQuoteEntry.setVehicleDetailTextVerification("Vehicle Details");

    }

    @Then("The user wants to  select vehicle year from drop down menu")
    public void the_user_wants_to_select_vehicle_year_from_drop_down_menu() {
        renasTechQuoteEntry.setVehicleYearBox();
        renasTechQuoteEntry.setVehicleYearSelection();
    }
    @Then("The user wants to select Vehicle  brand from drop down")
    public void the_user_wants_to_select_vehicle_brand_from_drop_down() {
        renasTechQuoteEntry.setVehicleMakeBox();
        renasTechQuoteEntry.setVehicleMakeSelection();
    }
    @Then("The user wants to select Vehicle model from dropdown")
    public void the_user_wants_to_select_vehicle_model_from_dropdown() {
      renasTechQuoteEntry.setVehicleModelBox();
      renasTechQuoteEntry.setVehicleModelSelection();
    }
    @Then("The user wants to click next button")
    public void the_user_wants_to_click_next_button() {
        renasTechQuoteEntry.setVehicleNextButton();
    }
    @Then("The user wants to verify that one option selected in finance detail")
    public void the_user_wants_to_verify_that_one_option_selected_in_finance_detail() {
        renasTechQuoteEntry.setFinanceDetails();

    }
    @Then("The user wants to click financeNext button")
    public void the_user_wants_to_click_finance_next_button() {
        renasTechQuoteEntry.setNextFinanceDetail();
       }

    @Then("The user wants to enter distance {string} in to select driving distance box")
    public void the_user_wants_to_enter_distance_in_to_select_driving_distance_box(String distance) {
        renasTechQuoteEntry.getDrivingDistance(distance);
    }
    @Then("The user wants to select I commute to work or school or I use my car to conduct business")
    public void the_user_wants_to_select_i_commute_to_work_or_school_or_i_use_my_car_to_conduct_business() {

        renasTechQuoteEntry.setCommuteWork();
        renasTechQuoteEntry.setConductBusiness();

    }
    @Then("The user wants to click distanceNext button")
    public void the_user_wants_to_click_distance_next_button() {
        renasTechQuoteEntry.setNextButtonForDistance();
    }
    @Then("The user wants to click Coverage Start Date header and choose Coverage Start Date as {string}")
    public void the_user_wants_to_click_coverage_start_date_header_and_choose_coverage_start_date_as(String date) {
        renasTechQuoteEntry.setCoverageDate(date);

    }
    @Then("The user wants to click CoverageNext button")
    public void the_user_wants_to_click_coverage_next_button() {
        renasTechQuoteEntry.setNextButtonCoverage();
    }

    @Then("The user wants to choose yes or no button for answering winter tire question")
    public void the_user_wants_to_choose_yes_or_no_button_for_answering_winter_tire_question() {
        renasTechQuoteEntry.setWinterTireYes();
    }
    @Then("The user wants to choose yes or no button for enrolling TD MyAdvantage saving")
    public void the_user_wants_to_choose_yes_or_no_button_for_enrolling_td_my_advantage_saving() {
        renasTechQuoteEntry.setTdSavingNo();
        renasTechQuoteEntry.setNextSavingDiscount();
    }
    @Then("The user wants to enter licenceNumber and click next button")
    public void the_user_wants_to_enter_licence_number_and_click_next_button(Map<String,String> dataTable) {
        renasTechQuoteEntry.setDrivingLicense(dataTable.get("licenceNumber"));
        renasTechQuoteEntry.setNextDrivingLicense();
          }
    @Then("The user wants to choose yes or no button to confirm possessing a driving license")
    public void the_user_wants_to_choose_yes_or_no_button_to_confirm_possessing_a_driving_license() {
        renasTechQuoteEntry.setObtainDriverLicense();
    }
    @Then("The user wants to click submit button")
    public void the_user_wants_to_click_submit_button() {
        renasTechQuoteEntry.setsubmitButtonDriverLicense();
    }
    @Then("The user wants to verify that LEt us call you button visible")
    public void the_user_wants_to_verify_that_l_et_us_call_you_button_visible() {
        renasTechQuoteEntry.setLetUsCallYouButton();
    }

}