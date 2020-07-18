import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.JavascriptExecutor;

import javax.annotation.meta.When;
import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CV {

    private WebDriver driver;
    private String baseURL = "https://interviewme.pl/kreator-cv";
    //private Image photo;

    //public void setPhoto(Image photo) {
    //this.photo = photo;
    //}

    @Before
    public void SetUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Testowanie\\Selenium Drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(baseURL);


    }


    @Test
    public void Test1() {

        WebElement choseTemplate = driver.findElement(By.xpath("/html/body/main/section/div/section[3]/div/a[2]"));
        choseTemplate.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement beginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[2]/a/div/span"));

        Actions actions = new Actions(driver);
        actions.moveToElement(beginButton).build().perform();


        WebElement clickOnElement = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[2]/a/div/span")));
        actions.click(clickOnElement).build().perform();


        WebElement nameInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[1]/div/div[1]/input"));
        nameInput.sendKeys("Marta");

        WebElement surnameInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[2]/div/div[1]/input"));
        surnameInput.sendKeys("Handke");

        WebElement titleInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[3]/div/input"));
        titleInput.sendKeys("Junior Tester");

        WebElement numberInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[3]/div[2]/div/div[1]/input"));
        numberInput.sendKeys("770939034");

        WebElement emailInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[3]/div[1]/div/div[1]/input"));
        emailInput.sendKeys("tester1@bla.pl");

        WebElement adressInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[3]/div[3]/div/div[1]/textarea"));
        adressInput.sendKeys("ul.Nowaka 4, 89-898 Warszawa");

        //WebElement photoInput = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[2]/div[1]/div/div[1]"));
        //photoInput.click();

        WebElement nextButton1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/a[2]"));
        nextButton1.click();

        WebElement firmInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[1]/div[1]/div[1]/input"));
        firmInput.sendKeys("Company");

        WebElement cityInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/input"));
        cityInput.sendKeys("Warszawa");

        WebElement jobInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[2]/input"));
        jobInput.sendKeys("Tester manualny");

        WebElement jobClick = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[2]/ul/li"));
        jobClick.click();

        Select yearStart = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[3]/div/div[1]/div[1]/div/div[1]/select")));
        yearStart.selectByValue("2015");

        Select monthStart = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[3]/div/div[1]/div[2]/div/div[1]/select")));
        monthStart.selectByVisibleText("Luty");


        ((JavascriptExecutor) driver).executeScript("tinyMCE.activeEditor.setContent('<h1>Praca jako tester manualny</h1>')");


        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[3]/div/div[2]/label/span[1]"));
        checkbox.click();

        Select yearEnd = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[3]/div[2]/div[1]/div[1]/div/div[1]/select")));
        yearEnd.selectByValue("2020");

        Select monthEnd = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/select")));
        monthEnd.selectByVisibleText("Czerwiec");

        WebElement nextButton2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[3]/div/button"));
        nextButton2.click();

        driver.switchTo().activeElement();

        WebElement proceed = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/a")));
        proceed.click();

        WebElement schoolInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[1]/div[1]/input"));
        schoolInput.sendKeys("Akademia Muzyczna");

        WebElement uniCityInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[1]/input"));
        uniCityInput.sendKeys("Poznan");

        WebElement degreeInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[3]/div[1]/div[1]/input"));
        degreeInput.sendKeys("Magister");

        WebElement fieldInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[3]/div[2]/div[1]/input"));
        fieldInput.sendKeys("Fagot");

        Select yearStStart = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[4]/div/div[1]/div[1]/div/div[1]/select")));
        yearStStart.selectByValue("2010");

        Select monthStStart = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[4]/div/div[1]/div[2]/div/div[1]/select")));
        monthStStart.selectByVisibleText("Październik");

        WebElement checkbox2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[4]/div/div[2]/label/span[1]"));
        checkbox2.click();

        Select yearStEnd = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[4]/div[2]/div[1]/div[1]/div/div[1]/select")));
        yearStEnd.selectByValue("2015");

        Select monthStEnd = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[4]/div[2]/div[1]/div[2]/div/div[1]/select")));
        monthStEnd.selectByVisibleText("Czerwiec");

        WebElement nextButton3 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/a[4]"));


        Actions actions2 = new Actions(driver);
        actions2.moveToElement(nextButton3).build().perform();


        WebElement clickOnButton3 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/a[4]")));
        actions.click(clickOnButton3).build().perform();


        WebElement skillInput1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[3]/div/div[1]/input"));
        skillInput1.sendKeys("Java");

        WebElement clickSkillInput1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[3]/div/div[1]/div[2]/ul/li[2]"));
        clickSkillInput1.click();

        WebElement skillInput2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[4]/div/div[1]/input"));
        skillInput2.sendKeys("SQL");

        WebElement clickSkillInput2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[4]/div/div[1]/div[2]/ul/li[2]"));
        clickSkillInput2.click();

        WebElement skillInput3 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[5]/div/div[1]/input"));
        skillInput3.sendKeys("Jira");


        WebElement skillStar1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[3]/div/div[2]/div/span[1]"));
        skillStar1.click();

        WebElement skillStar2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[4]/div/div[2]/div/span[1]"));
        skillStar2.click();

        WebElement skillStar3 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[5]/div/div[2]/div/span[1]"));
        skillStar3.click();

        WebElement nextButton4 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[7]/div/a[2]"));
        nextButton4.click();

        ((JavascriptExecutor) driver).executeScript("tinyMCE.activeEditor.setContent('<h1>Gotowe</h1>')");


        WebElement nextButton5 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[2]/div/a[2]"));
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(nextButton5).build().perform();
        WebElement clickOnButton5 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[2]/div/a[2]")));
        actions.click(clickOnButton5).build().perform();


        WebElement nextButton6 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[2]/div/a[2]"));
        Actions actions4 = new Actions(driver);
        actions4.moveToElement(nextButton6).build().perform();
        WebElement clickOnButton6 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[2]/div/a[2]")));
        actions.click(clickOnButton6).build().perform();

        String linkText = driver.getCurrentUrl();
        System.out.println(linkText);


        if (driver.getCurrentUrl().equalsIgnoreCase(linkText)){

            WebElement languageInput = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[1]/div[2]/label/span[1]"));
            languageInput.click();

            WebElement hobbyInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[3]/div[2]/label/span[1]"));
            hobbyInput.click();

            WebElement saveButton = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[2]/div/button"));

            Actions actions5 = new Actions(driver);
            actions5.moveToElement(saveButton).build().perform();

            WebElement saveButton1 = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[2]/div/button")));
            actions.click(saveButton1).build().perform();

            WebElement textarea = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/iframe"));
            Actions actiontext = new Actions(driver);
            actiontext.moveToElement(textarea).build().perform();


            ((JavascriptExecutor) driver).executeScript("tinyMCE.activeEditor.setContent('<h1>Testowanie jako hobby</h1>')");

            WebElement button7 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[2]/div/a"));
            Actions actionButton7 = new Actions(driver);
            actionButton7.moveToElement(button7).build().perform();


            WebElement clickOnButton7 = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[2]/div/a")));
            actions.click(clickOnButton7).build().perform();

            WebElement LanguageName = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[2]/div/div[1]/input"));
            LanguageName.sendKeys("angielski");

            WebElement skillStar5 = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div/span[1]"));
            skillStar5.click();

            WebElement finishButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/div[4]/div/a"));
            finishButton.click();
        } else {
            WebElement downloadButton = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div/div/button"));
            downloadButton.click();

            driver.switchTo().activeElement();

            WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/form/div[2]/div[1]/input"));
            passwordInput.sendKeys("blablaa1");

            WebElement agreeCheckbox = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/form/div[3]/label/span[1]"));
            agreeCheckbox.click();

            WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/button/div/span"));
            loginButton.click();

            WebElement loginButton2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/form/button"));
            loginButton2.click();

            Assert.assertEquals("CV | InterviewMe", driver.getTitle());

            //driver.close();

        }


    }

}
