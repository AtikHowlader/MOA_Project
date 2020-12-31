package Page_Object_Framework.MOA;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rIRA_FnB_Page extends Abstract_Class {
    ExtentTest logger;
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public rIRA_FnB_Page(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of constructor method

    @FindBy(xpath = "//*[contains(@href,'/IndividualProducts/indRIO')]")
    WebElement rSavingTorIncome;

    public rIRA_FnB_Page savingToIncomePage (){
        Reusable_Methods_Loggers_Page_Object.click(driver,rSavingTorIncome,logger,"Saving to Income");
        return new rIRA_FnB_Page(driver);
    }//end of raving to income link method





}//end of class
