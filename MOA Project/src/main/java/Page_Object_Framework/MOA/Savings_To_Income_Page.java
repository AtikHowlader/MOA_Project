package Page_Object_Framework.MOA;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Savings_To_Income_Page extends Abstract_Class {
    ExtentTest logger;
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public Savings_To_Income_Page(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of constructor method

    @FindBy(xpath = "//*[contains(@href,'/regionaloffices')]")
    WebElement regionalOffices;

    public Savings_To_Income_Page regionalOfficesLink (){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,400)");
        Reusable_Methods_Loggers_Page_Object.click(driver,regionalOffices,logger,"Regional Offices");
        return new Savings_To_Income_Page(driver);
    }//end of regional offices link method


}//end of class
