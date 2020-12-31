package Reusable_Library;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Reusable_Methods_Loggers {

    static int timeout = 15;

    public static WebDriver getDriver() throws IOException, InterruptedException {
        //kill all chrome driver instance before opening a new one
        //Thread.sleep(1000);
        //Runtime.getRuntime().exec("taskkill /F /IM chromedriver /T");
        //mac/windows
        //Runtime.getRuntime().exec("pgrep 'chromedriver' | xargs kill");
        //another way
        /*
        String cmds[] = {"killall","chromedriver"};
        Runtime.getRuntime().exec(cmds)
         */
        //set the chrome driver location
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        //setting the chrome options before defining the driver
        ChromeOptions options = new ChromeOptions();
        //set the driver to be maximized
        //options.addArguments("start-maximized");
        //set the driver to be incognito mode(private)
        options.addArguments("incognito");
        //run the driver in headless mode
        //options.addArguments("headless");
        //defining the web driver that you will be using
        WebDriver driver = new ChromeDriver(options); //options variable should be passed here
        driver.manage().window().maximize();
        return driver;
    }//end of get driver

    //reusable method to click on any element on any websites
    public static void click(WebDriver driver, String locator,ExtentTest logger,String elementName){
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            System.out.println("Clicking on element " + elementName);
            logger.log(LogStatus.INFO,"Clicking on element " + elementName);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
        }catch (Exception err){
            System.out.println("Unable to click on element " + err);
            logger.log(LogStatus.FAIL,"Unable to click on element " + err);
            getScreenShot(driver,logger,elementName);
        }//end of exception
    }//end of click method

    //reusable method to click on any element on any websites
    public static void clickByIndex(WebDriver driver, String locator, int indexNumber, ExtentTest logger, String elementName){
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            System.out.println("Clicking on element " + elementName);
            logger.log(LogStatus.INFO,"Clicking on element " + elementName);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator))).get(indexNumber).click();
        }catch (Exception err){
            System.out.println("Unable to click on element " + err);
            logger.log(LogStatus.FAIL,"Unable to click on element " + err);
            getScreenShot(driver,logger,elementName);
        }//end of exception
    }//end of click method

    //reusable method to type on any element on any websites
    public static void sendKeys(WebDriver driver, String locator, String userValue, ExtentTest logger,String elementName){
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            System.out.println("Typing on element " + elementName);
            logger.log(LogStatus.INFO,"Typing on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.clear();
            element.sendKeys(userValue);
        }catch (Exception err){
            System.out.println("Unable to type on element " + err);
            logger.log(LogStatus.FAIL,"Unable to type on element " + err);
            getScreenShot(driver,logger,elementName);
        }//end of exception
    }//end of sendkeys method

    //reusable method to submit on any element on any websites
    public static void submit(WebDriver driver, String locator,ExtentTest logger, String elementName){
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            System.out.println("Submitting on element " + elementName);
            logger.log(LogStatus.INFO,"Submitting on element " + elementName);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).submit();
        }catch (Exception err){
            System.out.println("Unable to submit on element " + err);
            logger.log(LogStatus.FAIL,"Unable to submit on element " + err);
            getScreenShot(driver,logger,elementName);
        }//end of exception
    }//end of submit method

    //reusable method to capture a value/text from a page
    public static String captureResult(WebDriver driver, String locator,ExtentTest logger,String elementName){
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        String result = "";
        try{
            System.out.println("Capturing text on element " + elementName);
            logger.log(LogStatus.INFO,"Capturing text on element " + elementName);
            result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).getText();
        }catch (Exception err){
            System.out.println("Unable to capture text on element " + err);
            logger.log(LogStatus.FAIL,"Unable to capture text on element " + err);
            getScreenShot(driver,logger,elementName);
        }//end of exception

        return result;
    }//end of get result method

    //method to select from drop down menu
    public static void dropDownMenu(WebDriver driver, String locator, String userInput, ExtentTest logger,String elementName)
    {
        WebDriverWait wait = new WebDriverWait(driver,timeout);

        try
        {
            System.out.println("\nSelecting " + userInput + elementName);
            logger.log(LogStatus.INFO,"Clicking on element " + elementName);
            WebElement dropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            Select selectDropDown= new Select(dropDown);
            selectDropDown.selectByVisibleText(userInput);

        }
        catch (Exception err)
        {
            System.out.println("\nUnable to select from drop down " + err);
            logger.log(LogStatus.FAIL,"Unable to submit on element " + err);
            getScreenShot(driver,logger,elementName);
        }
    }//end of drop down by text method


    public static void typeAndSubmit(WebDriver driver,String locator,ExtentTest logger, String userInput, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            System.out.println("Entering a value on element " + elementName);
            logger.log(LogStatus.INFO,"Clicking on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.clear();
            element.sendKeys(userInput);
            Thread.sleep(1000);
            element.sendKeys(Keys.ENTER); //this is another way to submit to an element using key event
        } catch (Exception e) {
            System.out.println("Unable to enter on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Error Occurred while taking SCREENSHOT!!!");
            getScreenShot(driver,logger,elementName);
        }
    }//end of type and submit method


    //method to click on an element
    public static void mouseClick(WebDriver driver,String locator,ExtentTest logger,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        Actions actions = new Actions(driver);
        try{
            System.out.println("Mouse clicking a value on element " + elementName);
            logger.log(LogStatus.INFO,"Clicking on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            actions.moveToElement(element).click().perform();
        } catch (Exception e) {
            System.out.println("Unable to mouse click element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Error Occurred while taking SCREENSHOT!!!");
            getScreenShot(driver,logger,elementName);
        }
    }//end of click method


    //method to capture screenshot when logger fails
    public static void getScreenShot(WebDriver wDriver,ExtentTest logger,String imageName) {
        try {
            String fileName = imageName + ".png";
            String directory = "src/main/java/HTML_Report/Screenshots/";
            File sourceFile = ((TakesScreenshot) wDriver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture("Screenshots/" + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occurred while taking SCREENSHOT!!!");
            e.printStackTrace();
        }
    }//end of screenshot method

    //method to hover on an element
    public static void mouseHover(WebDriver driver,String locator,ExtentTest logger,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        Actions actions = new Actions(driver);
        try{
            System.out.println("Mouse clicking a value on element " + elementName);
            logger.log(LogStatus.INFO,"Clicking on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            actions.moveToElement(element).perform();
        } catch (Exception err) {
            System.out.println("Unable to hover over element " + elementName + " " + err);
            logger.log(LogStatus.FAIL,"Unable to submit on element " + err);
            getScreenShot(driver,logger,elementName);
        }
    }//end of hover method

    public static void uploadFile(String path) throws InterruptedException, AWTException {
            Thread.sleep(4000);

//File Need to be imported

            File file = new File(path);

            StringSelection stringSelection= new StringSelection(file.getAbsolutePath());

//Copy to clipboard Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

            Robot robot = new Robot();

// Cmd + Tab is needed since it launches a Java app and the browser looses focus

            robot.keyPress(KeyEvent.VK_META);

            robot.keyPress(KeyEvent.VK_TAB);

            robot.keyRelease(KeyEvent.VK_META);

            robot.keyRelease(KeyEvent.VK_TAB);

            robot.delay(500);

//Open Goto window

            robot.keyPress(KeyEvent.VK_META);

            robot.keyPress(KeyEvent.VK_SHIFT);

            robot.keyPress(KeyEvent.VK_G);

            robot.keyRelease(KeyEvent.VK_META);

            robot.keyRelease(KeyEvent.VK_SHIFT);

            robot.keyRelease(KeyEvent.VK_G);

//Paste the clipboard value

            robot.keyPress(KeyEvent.VK_META);

            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_META);

            robot.keyRelease(KeyEvent.VK_V);

//Press Enter key to close the Goto window and Upload window

            robot.keyPress(KeyEvent.VK_ENTER);

            robot.keyRelease(KeyEvent.VK_ENTER);

            robot.delay(500);

            robot.keyPress(KeyEvent.VK_ENTER);

            robot.keyRelease(KeyEvent.VK_ENTER);

        }// end of method

}//end of java class

