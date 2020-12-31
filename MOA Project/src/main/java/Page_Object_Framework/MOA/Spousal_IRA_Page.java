package Page_Object_Framework.MOA;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spousal_IRA_Page extends Abstract_Class {
    ExtentTest logger;
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public Spousal_IRA_Page(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of constructor method

    @FindBy(xpath = "//*[contains(@href,'IndividualProducts/tiraproductoverview#catchup')]")
    WebElement age50Link;

    public Spousal_IRA_Page age50Page (){
        Reusable_Methods_Loggers_Page_Object.click(driver,age50Link,logger,"Age 50 Link");
        return new Spousal_IRA_Page(driver);
    }//end of age 50 method


}//end of class
