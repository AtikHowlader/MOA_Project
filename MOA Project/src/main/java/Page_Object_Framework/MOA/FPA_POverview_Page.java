package Page_Object_Framework.MOA;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FPA_POverview_Page extends Abstract_Class {
    ExtentTest logger;
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public FPA_POverview_Page(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of constructor method

    @FindBy(xpath = "//*[contains(@href,'/InvestmentChoices/InvestOptionMain')]")
    WebElement separateAccount;

    public FPA_POverview_Page separateAccountInvestFundsPage (){
        Reusable_Methods_Loggers_Page_Object.click(driver,separateAccount,logger,"Separate Account Investment Funds");
        return new FPA_POverview_Page(driver);
    }//end of separate account invest funds page method





}
