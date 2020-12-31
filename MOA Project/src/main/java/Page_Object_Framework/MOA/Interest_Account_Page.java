package Page_Object_Framework.MOA;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Interest_Account_Page extends Abstract_Class {
    ExtentTest logger;
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public Interest_Account_Page(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of constructor method

    @FindBy(xpath = "//*[contains(@onclick,'FundPerformance?tiernum=022')]")
    WebElement investAndPerform;
    @FindBy(xpath = "//*[contains(@href,'ContractProspec?tiernum=015')]")
    WebElement prospectusesLink;

    public Interest_Account_Page investAndPerformancesPage (){
        Reusable_Methods_Loggers_Page_Object.click(driver,investAndPerform,logger,"Investment and Performance");
        return new Interest_Account_Page(driver);
    }//end of invest and performances page method

    public Interest_Account_Page prospectusesPage (){
        Reusable_Methods_Loggers_Page_Object.click(driver,prospectusesLink,logger,"Prospectuses Link");
        return new Interest_Account_Page(driver);
    }//end of prospectuses page method


}//end of class
