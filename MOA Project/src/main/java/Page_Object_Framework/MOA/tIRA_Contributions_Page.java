package Page_Object_Framework.MOA;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tIRA_Contributions_Page extends Abstract_Class {
    ExtentTest logger;
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public tIRA_Contributions_Page(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of constructor method

    @FindBy(xpath = "//*[contains(@href,'/IndividualProducts/tiraproductoverview#max')]")
    WebElement contribLimitsLink;
    @FindBy(xpath = "//*[contains(@href,'/IndividualProducts/riraproductoverview')]")
    WebElement rolloverIRALink;

    public tIRA_Contributions_Page contributionLimits (){
        Reusable_Methods_Loggers_Page_Object.click(driver,contribLimitsLink,logger,"Contribution Limits Link");
        return new tIRA_Contributions_Page(driver);
    }//end of the contribution limits link method

    public tIRA_Contributions_Page rIRA (){
        Reusable_Methods_Loggers_Page_Object.click(driver,rolloverIRALink,logger,"Rollover IRA Link");
        return new tIRA_Contributions_Page(driver);
    }//end of rollover IRA link method


}//end of class
