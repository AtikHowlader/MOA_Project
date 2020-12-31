package Page_Object_Framework.MOA;

import Reusable_Library.Abstract_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Class extends Abstract_Class {
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public Base_Class(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
    }//end of constructor method

    public static MOA_Home individualProducts (){
        MOA_Home individualProducts = new MOA_Home(driver);
        return individualProducts;
    }//end of method

    public static Overview_Page overviewHome (){
        Overview_Page overviewHome = new Overview_Page(driver);
        return overviewHome;
    }//end of method

    public static Application_Page applicationForm (){
        Application_Page applicationForm = new Application_Page(driver);
        return applicationForm;
    }//end of method

    public static Overview_Page tIRASubHeader (){
        Overview_Page tIRASubHeader = new Overview_Page(driver);
        return tIRASubHeader;
    }//end of method

    public static Spousal_IRA_Page spousalIraPage (){
        Spousal_IRA_Page spousalIraPage = new Spousal_IRA_Page(driver);
        return spousalIraPage;
    }//end of method

    public static Tax_Advantages_Page taxAdvantagesPage (){
        Tax_Advantages_Page taxAdvantagesPage = new Tax_Advantages_Page(driver);
        return taxAdvantagesPage;
    }//end of method

    public static tIRA_Contributions_Page tIRAContributionsPage (){
        tIRA_Contributions_Page tIRAContributionsPage = new tIRA_Contributions_Page(driver);
        return tIRAContributionsPage;
    }//end of method

    public static rIRA_FnB_Page rIRAFnBPage (){
        rIRA_FnB_Page rIRAFnBPage = new rIRA_FnB_Page(driver);
        return rIRAFnBPage;
    }//end of the method

    public static Savings_To_Income_Page savingsToIncomePage (){
        Savings_To_Income_Page savingsToIncomePage = new Savings_To_Income_Page(driver);
        return savingsToIncomePage;
    }//end of method

    public static Overview_Page rothSubHeader (){
        Overview_Page rothSubHeaders = new Overview_Page(driver);
        return rothSubHeaders;
    }

    public static Overview_Page fpaSubHeader (){
        Overview_Page fpaSubHeader = new Overview_Page(driver);
        return fpaSubHeader;
    }//end of method

    public static FPA_POverview_Page fpaPOverviewPage (){
        FPA_POverview_Page fpaPOverviewPage = new FPA_POverview_Page(driver);
        return fpaPOverviewPage;
    }//end of method

    public static Interest_Account_Page interestAccountPage (){
        Interest_Account_Page interestAccountPage = new Interest_Account_Page(driver);
        return interestAccountPage;
    }//end of method

    public static Maximum_Limits_Page maximumLimitsPage (){
        Maximum_Limits_Page maximumLimitsPage = new Maximum_Limits_Page(driver);
        return maximumLimitsPage;
    }//end of method

}//end of class
