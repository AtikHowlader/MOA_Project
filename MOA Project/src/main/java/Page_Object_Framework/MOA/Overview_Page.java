package Page_Object_Framework.MOA;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Overview_Page extends Abstract_Class {
    ExtentTest logger;
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public Overview_Page(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of constructor method

    @FindBy(xpath = "//*[@id='downloadkit']")
    WebElement downloadKit;
    @FindBy(xpath = "//*[@id='rating']")
    WebElement ratingAgencies;
    @FindBy(xpath = "//*[@id='indtraditionaliraSubmenuHeader']")
    WebElement tIRASubHeader;
    @FindBy(xpath = "//*[@id='tiraspousalIRA']")
    WebElement tIRASpousal;
    @FindBy(xpath = "//*[@id='tirataxadvantages']")
    WebElement tIRATaxAdv;
    @FindBy(xpath = "//*[@id='tiracontributionswithdrawals']")
    WebElement tIRAContribWithdr;
    @FindBy(xpath = "//*[@id='indrolloveriraSubmenu']")
    WebElement rIRASubHeader;
    @FindBy(xpath = "//*[@id='rirafeaturesbenefits']")
    WebElement rIRAFB;
    @FindBy(xpath = "//*[@id='indrothiraSubmenu']")
    WebElement rothIRASubHeader;
    @FindBy(xpath = "//*[@id='rothiraautomaticcontributions']")
    WebElement rothIRAAutoContrib;
    @FindBy(xpath = "//*[@id='rothirainvestmentfunds']")
    WebElement rothIRAInvestFunds;
    @FindBy(xpath = "//*[@id='rothiraConverting']")
    WebElement rothConvert;
    @FindBy(xpath = "//*[@id='indfpaSubmenu']")
    WebElement fpaSubHeader;
    @FindBy(xpath = "//*[@id='fpaproductoverview']")
    WebElement fpaProductOverview;
    @FindBy(xpath = "//*[@id='fpacontributionswithdrawals']")
    WebElement fpaContribWithdr;
    @FindBy(xpath = "//*[@id='rothiraproductoverview']")
    WebElement rothProductOverview;
    @FindBy(xpath = "//*[@id='inddeferrallimits']")
    WebElement contributionLimits;


    public Overview_Page applicationPage(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,400)");
        Reusable_Methods_Loggers_Page_Object.click(driver,downloadKit,logger,"Download Kit Button");
        return new Overview_Page(driver);
    }//end of Application page method

    public Overview_Page ratingsPage(){
        Reusable_Methods_Loggers_Page_Object.click(driver,ratingAgencies,logger,"Rating Agencies Button");
        return new Overview_Page(driver);
    }//end of ratings page method

    public Overview_Page spousalIRA(){
        Reusable_Methods_Loggers_Page_Object.click(driver,tIRASubHeader,logger,"Traditional IRA Sub Menu");
        Reusable_Methods_Loggers_Page_Object.click(driver,tIRASpousal,logger,"Spousal IRA Button");
        return new Overview_Page(driver);
    }//end of Spousal IRA method

    public Overview_Page taxAdvPage(){
        Reusable_Methods_Loggers_Page_Object.click(driver,tIRASubHeader,logger,"Traditional IRA Sub Menu");
        Reusable_Methods_Loggers_Page_Object.click(driver,tIRATaxAdv,logger,"Tax Advantages Link");
        return new Overview_Page(driver);
    }//end of tax advantages method

    public Overview_Page contribWithdrawal (){
        Reusable_Methods_Loggers_Page_Object.click(driver,tIRASubHeader,logger,"Traditional IRA Sub Menu");
        Reusable_Methods_Loggers_Page_Object.click(driver,tIRAContribWithdr,logger,"Contribution & Withdrawal Link");
        return new Overview_Page(driver);
    }//end of contribution and withdrawal link method

    public Overview_Page featuresBenefitsPage (){
        Reusable_Methods_Loggers_Page_Object.click(driver,rIRASubHeader,logger,"Rollover IRA Sub Menu");
        Reusable_Methods_Loggers_Page_Object.click(driver,rIRAFB,logger,"Features and Benefits");
        return new Overview_Page(driver);
    }//end of features and benefits page method

    public Overview_Page rothAutoContribPage (){
        Reusable_Methods_Loggers_Page_Object.click(driver,rothIRASubHeader,logger,"Roth IRA Sub Menu");
        Reusable_Methods_Loggers_Page_Object.click(driver,rothIRAAutoContrib,logger,"Automatic Contributions");
        return new Overview_Page(driver);
    }//end of automatic contributions page method

    public Overview_Page rothInvestFundsPage (){
        Reusable_Methods_Loggers_Page_Object.click(driver,rothIRASubHeader,logger,"Roth IRA Sub Menu");
        Reusable_Methods_Loggers_Page_Object.click(driver,rothIRAInvestFunds,logger,"Investment Fund");
        return new Overview_Page(driver);
    }//end of investment funds page method

    public Overview_Page rothConvertPage (){
        Reusable_Methods_Loggers_Page_Object.click(driver,rothIRASubHeader,logger,"Roth IRA Sub Menu");
        Reusable_Methods_Loggers_Page_Object.click(driver,rothConvert,logger,"Convert to Roth Ira");
        return new Overview_Page(driver);
    }//end of convert to roth ira page method

    public Overview_Page fpaProductOverviewPage (){
        Reusable_Methods_Loggers_Page_Object.click(driver,fpaSubHeader,logger,"FPA Sub Menu");
        Reusable_Methods_Loggers_Page_Object.click(driver,fpaProductOverview,logger,"FPA Product Overview");
        return new Overview_Page(driver);
    }//end of FPA product overview page method

    public Overview_Page fpaContribWithdrawalPage (){
        Reusable_Methods_Loggers_Page_Object.click(driver,fpaSubHeader,logger,"FPA Sub Menu");
        Reusable_Methods_Loggers_Page_Object.click(driver,fpaContribWithdr,logger,"Contribution & Withdrawal Link");
        return new Overview_Page(driver);
    }//end of contribution and withdrawal link method

    public Overview_Page rothProductOverviewPage (){
        Reusable_Methods_Loggers_Page_Object.click(driver,rothIRASubHeader,logger,"Roth IRA Sub Menu");
        Reusable_Methods_Loggers_Page_Object.click(driver,rothProductOverview,logger,"Roth Product Overview");
        return new Overview_Page(driver);
    }//end of roth product overview page method

    public Overview_Page contribLimitsPage (){
        Reusable_Methods_Loggers_Page_Object.click(driver,contributionLimits,logger,"Contribution Limits");
        return new Overview_Page(driver);
    }//end of contribution limits method




}//end of class
