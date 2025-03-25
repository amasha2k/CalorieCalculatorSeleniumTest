import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static java.sql.DriverManager.getDriver;

public class Test_Example extends TestBase {

    static ExtentReports report;

    static ExtentTest test;

    static ExtentReports extent = new ExtentReports();


//    @Test
//
//    public void SearchModule_TC001_VerifyGoogleSearch_FP() throws InterruptedException {
//
//        WebDriver driver = getDriver();
//        driver.get("https://www.selenium.dev/documentation/webdriver/");
//
//
//        //driver.get("https://www.google.com");
//        // driver.findElement (By.name("q")).sendKeys("Sri Lanka");
//        // driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//        // Thread.sleep(10000);
//        // driver.quit();
//    }
//    @Test
//    public void TC_ReporterTest() throws InterruptedException {
//
//        WebDriver driver = getDriver();
//
//        //Navigate to calculator page
//        driver.get("https://www.calculator.net/calorie-calculator.html");
//
//        //Clear existing data
//        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/form/table[4]/tbody/tr[3]/td[2]/input[4]")).click();
//
//        // Enter Age
//        driver.findElement(By.id("cage")).sendKeys("20");
//
//        // Enter Height
//        driver.findElement(By.id("cheightmeter")).sendKeys("100");
//
//        // Enter Weight
//        driver.findElement(By.id("ckg")).sendKeys("180");
//
//        //Press calculate button
//        driver.findElement(By.name("x")).click();
//
//        //Assert Results
//        String ExpectedTitle = "Result";
//        WebElement titleElement = driver.findElement(By.xpath("//*[@id='content']/h2[1]"));
//        String ActualTitle = titleElement.getText();
//
//        //Print expected and actual results
//        System.out.println(ExpectedTitle);
//        System.out.println(ActualTitle);
//
//        //Compare actual vs expected result
//        Assert.assertEquals(ActualTitle, ExpectedTitle);
//
//        Thread.sleep(10000);
//        driver.quit();
//    }
//    @Test
//
//    public void ReporterTest() throws InterruptedException {
//
//        WebDriver driver = getDriver();
//        driver.get("https://www.calculator.net/calorie-calculator.html");
//
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/form/table[4]/tbody/tr[3]/td[2]/input[4]")).click();
//        //input age
//        driver.findElement(By.id("cage")).sendKeys("20");
//        //input height
//        driver.findElement(By.id("cheightmeter")).sendKeys("100");
//        //input weight
//        driver.findElement(By.id("ckg")).sendKeys("180");
//        //press calculate button
//        driver.findElement(By.name("x")).click();
//
//        //Assert Results
//        String ExpectedTitle = "Result";
//        WebElement titleElement = driver.findElement(By.xpath("//*[@id='content']/h2[1]"));
//        String ActualTitle = titleElement.getText();
//
//        //Print expected and actual results
//        System.out.println(ExpectedTitle);
//        System.out.println(ActualTitle);
//
//        //Compare actual vs expected result
//        Assert.assertEquals(ActualTitle, ExpectedTitle);
//
//
//        Thread.sleep(10000);
//        driver.quit();
//    }


    @Test

    public void Tc_ExtendReporterTest() throws InterruptedException {

        WebDriver driver = getDriver();
        //Navigate to calculator page
        driver.get("https://www.calculator.net/calorie-calculator.html");

        //Generate Extent Reports
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        test = extent.createTest("Validate calculator functionality", "This is to calculate calories");

        //clear existing data
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/form/table[4]/tbody/tr[3]/td[2]/input[4]")).click();
        //input age
        driver.findElement(By.id("cage")).sendKeys("20");
        //input height
        driver.findElement(By.id("cheightmeter")).sendKeys("100");
        //input weight
        driver.findElement(By.id("ckg")).sendKeys("180");
        //press calculate button
        driver.findElement(By.name("x")).click();

        //Assert Results
        String ExpectedTitle = "Result";
        WebElement titleElement = driver.findElement(By.xpath("//*[@id='content']/h2[1]"));
        String ActualTitle = titleElement.getText();

        //Print expected and actual results
        System.out.println(ExpectedTitle);
        System.out.println(ActualTitle);

        //Compare actual vs expected result
        Assert.assertEquals(ActualTitle, ExpectedTitle);


        Thread.sleep(10000);

        extent.flush();
        driver.quit();
    }

//    @Test
//
//    public void Tc_DataDrivenTest() throws InterruptedException, IOException {
//
//        //create and load property files
//        //Create and load property file
//        Properties prop = new Properties();
//        FileInputStream input = new FileInputStream("C:\\ama\\SeleniumProject2\\src\\main\\resources\\DataFiles\\testData.properties");
//        prop.load(input);
//
//        WebDriver driver = getDriver();
//        driver.get(prop.getProperty("url"));
//
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/form/table[4]/tbody/tr[3]/td[2]/input[4]")).click();
//        //input age
//        driver.findElement(By.id("cage")).sendKeys(prop.getProperty("age"));
//        //input height
//        driver.findElement(By.id("cheightmeter")).sendKeys(prop.getProperty("height"));
//        //input weight
//        driver.findElement(By.id("ckg")).sendKeys(prop.getProperty("weight"));
//        //press calculate button
//        driver.findElement(By.name("x")).click();
//
//        //Assert Results
//        String ExpectedTitle = "Result";
//        WebElement titleElement = driver.findElement(By.xpath("//*[@id='content']/h2[1]"));
//        String ActualTitle = titleElement.getText();
//
//        //Print expected and actual results
//        System.out.println(ExpectedTitle);
//        System.out.println(ActualTitle);
//
//        //Compare actual vs expected result
//        Assert.assertEquals(ActualTitle, ExpectedTitle);
//
//
//        Thread.sleep(10000);
//        driver.quit();
//    }


}