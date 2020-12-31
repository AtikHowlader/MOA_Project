package Mutual_Of_America_TC;

import Page_Object_Framework.MOA.Base_Class;
import Reusable_Library.Abstract_Class;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class TC_21 extends Abstract_Class {

    @Test
    public void saversCreditTest () throws InterruptedException {
        logger.log(LogStatus.INFO, "Navigating to Mutual Of America Homepage");
        driver.navigate().to("https://www.mutualofamerica.com");
        Base_Class.individualProducts().overviewPage();
        Base_Class.overviewHome().contribLimitsPage();
        Base_Class.maximumLimitsPage().saversCreditTable();
    }//end of test




}//end of class
