package Page_Object_Framework.MOA;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Maximum_Limits_Page extends Abstract_Class {
    ExtentTest logger;
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public Maximum_Limits_Page(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of constructor method

    @FindBy(xpath = "//*[contains(@onclick,'button1')]")
    WebElement dollarMax;
    @FindBy(xpath = "//*[contains(@onclick,'button2')]")
    WebElement compensationLimits;
    @FindBy(xpath = "//*[contains(@onclick,'button3')]")
    WebElement dollarLimits;
    @FindBy(xpath = "//*[contains(@onclick,'button4')]")
    WebElement compensationAmounts;
    @FindBy(xpath = "//*[contains(@onclick,'button5')]")
    WebElement saversCredit;

    public Maximum_Limits_Page dollarMaxTable (){
        Reusable_Methods_Loggers_Page_Object.click(driver,dollarMax,logger,"Dollar Maximum for 2020");
        return new Maximum_Limits_Page(driver);
    }//end of dollar max table method

    public Maximum_Limits_Page compensationLimitsTable (){
        Reusable_Methods_Loggers_Page_Object.click(driver,compensationLimits,logger,"Compensation Limits for 2020");
        return new Maximum_Limits_Page(driver);
    }//end of compensation limits method

    public Maximum_Limits_Page dollarLimitsTable (){
        Reusable_Methods_Loggers_Page_Object.click(driver,dollarLimits,logger,"Dollar Limits for 2020");
        return new Maximum_Limits_Page(driver);
    }//end of dollar limits table method

    public Maximum_Limits_Page compensationAmountsTable (){
        Reusable_Methods_Loggers_Page_Object.click(driver,compensationAmounts,logger,"Compensation Amounts for 2020");
        return new Maximum_Limits_Page(driver);
    }//end of compensation amounts table method

    public Maximum_Limits_Page saversCreditTable (){
        Reusable_Methods_Loggers_Page_Object.click(driver,saversCredit,logger,"Saver's Credit for 2020");
        return new Maximum_Limits_Page(driver);
    }//end of saver's credit table method


}//end of class
