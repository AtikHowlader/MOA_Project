package Page_Object_Framework.MOA;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tax_Advantages_Page extends Abstract_Class {
    ExtentTest logger;
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public Tax_Advantages_Page(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of constructor method

    @FindBy(xpath = "//*[contains(@href,'/AutoContribution/tira')]")
    WebElement autoContribLink;

    public Tax_Advantages_Page autoContribution (){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,400)");
        Reusable_Methods_Loggers_Page_Object.click(driver,autoContribLink,logger,"Auto Contributions Link");
        return new Tax_Advantages_Page(driver);
    }//end of auto contribution link method





}//end of class
