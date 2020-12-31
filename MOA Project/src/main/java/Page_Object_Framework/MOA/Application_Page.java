package Page_Object_Framework.MOA;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Application_Page extends Abstract_Class {
    ExtentTest logger;
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public Application_Page(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of constructor method

    @FindBy(xpath = "//*[@id='TIRA']")
    WebElement tIRACheckbox;
    @FindBy(xpath = "//*[@name='SAL']")
    WebElement title;
    @FindBy(xpath = "//*[@name='FIRST']")
    WebElement firstName;
    @FindBy(xpath = "//*[@name='LAST']")
    WebElement lastName;
    @FindBy(xpath = "//*[@name='ADDRESS']")
    WebElement address;
    @FindBy(xpath = "//*[@name='CITY']")
    WebElement city;
    @FindBy(xpath = "//*[@name='STATE']")
    WebElement state;
    @FindBy(xpath = "//*[@name='ZIP_CODE']")
    WebElement zipCode;
    @FindBy(xpath = "//*[@name='DAY_PHONE1']")
    WebElement phoneFirst;
    @FindBy(xpath = "//*[@name='DAY_PHONE2']")
    WebElement phoneSecond;
    @FindBy(xpath = "//*[@name='DAY_PHONE3']")
    WebElement phoneThird;
    @FindBy(xpath = "//*[@name='EMAIL']")
    WebElement email;
    @FindBy(xpath = "//*[@name='SubmitButtonText']")
    WebElement step2Button;

    public Application_Page fillOutApplication() throws InterruptedException {
        Reusable_Methods_Loggers_Page_Object.click(driver,tIRACheckbox,logger,"Checkbox");
        Reusable_Methods_Loggers_Page_Object.dropDownMenu(driver,title,"Mr.",logger,"Title");
        Reusable_Methods_Loggers_Page_Object.sendKeys(driver,firstName,"John",logger,"First Name");
        Reusable_Methods_Loggers_Page_Object.sendKeys(driver,lastName,"Johnson",logger,"Last Name");
        Reusable_Methods_Loggers_Page_Object.sendKeys(driver,address,"923 US Route 11",logger,"Address");
        Reusable_Methods_Loggers_Page_Object.sendKeys(driver,city,"Kirkwood",logger,"City");
        Reusable_Methods_Loggers_Page_Object.dropDownMenu(driver,state,"New York",logger,"State");
        Reusable_Methods_Loggers_Page_Object.sendKeys(driver,zipCode,"13795",logger,"Zip Code");
        Reusable_Methods_Loggers_Page_Object.sendKeys(driver,phoneFirst,"354",logger,"First 3 Phone#");
        Reusable_Methods_Loggers_Page_Object.sendKeys(driver,phoneSecond,"364",logger,"Second 3 Phone#");
        Reusable_Methods_Loggers_Page_Object.sendKeys(driver,phoneThird,"2837",logger,"Last 4 Phone#");
        Reusable_Methods_Loggers_Page_Object.sendKeys(driver,email,"djgdss@gmail.com",logger,"Email");
        Reusable_Methods_Loggers_Page_Object.click(driver,step2Button,logger,"Step 2 Button");
        return new Application_Page(driver);
    }

}//end of class
