package Page_Object_Framework.MOA;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MOA_Home extends Abstract_Class {
    ExtentTest logger;
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public MOA_Home(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of constructor method

    //locate individual products
    @FindBy(xpath = "//*[@data-text='Individual Products']")
    WebElement individualProducts;
    @FindBy(xpath = "//*[contains(@href,'IndividualProducts/indoverview')]")
    WebElement overview;

    public MOA_Home overviewPage() throws InterruptedException {
        Reusable_Methods_Loggers_Page_Object.mouseHover(driver,individualProducts,logger,"Individual Products");
        Thread.sleep(2000);
        Reusable_Methods_Loggers_Page_Object.mouseClick(driver,overview,logger,"Overview");
        return new MOA_Home(driver);
    }//end of overview page method



}//end of class
