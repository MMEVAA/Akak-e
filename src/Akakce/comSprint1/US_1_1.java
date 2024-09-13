package Akakce.comSprint1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class US_1_1 extends BaseDriver {

    @Test
    public void Test1() {

        driver.manage().window().maximize();
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement newAccount;
        newAccount = driver.findElement(By.xpath("//a[text()='Hesap Aç']"));
        newAccount.click();
        MyFunc.Bekle(2);

        WebElement name = driver.findElement(By.xpath("//input[@type='text'][@name='rnufn']"));
        name.sendKeys("Alperen");
        MyFunc.Bekle(2);

        WebElement lastName = driver.findElement(By.xpath("//input[@type='text'][@name='rnufs']"));
        lastName.sendKeys("Tanlı");
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.xpath("//input[@type='email'][@name='rnufe1']"));
        email.sendKeys("tanlialperen20@gmail.com");
        MyFunc.Bekle(2);

        WebElement tryEmail = driver.findElement(By.xpath("//input[@type='email'][@name='rnufe2']"));
        tryEmail.sendKeys("tanlialperen20@gmail.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@type='password'][@name='rnufp1']"));
        password.sendKeys("projeicin1A");
        MyFunc.Bekle(2);

        WebElement password2 = driver.findElement(By.xpath("//input[@type='password'][@name='rnufp2']"));
        password2.sendKeys("projeicin1A");
        MyFunc.Bekle(2);

        WebElement gender = driver.findElement(By.xpath("//input[@type='radio'][@name='rngc'][@id='rngm']"));
        gender.click();
        MyFunc.Bekle(2);

        WebElement city = driver.findElement(By.xpath("//option[text()='Ankara']"));
        city.click();
        MyFunc.Bekle(2);

        WebElement county = driver.findElement(By.xpath("//option[text()='Akyurt']"));
        county.click();
        MyFunc.Bekle(2);

        WebElement webDay = driver.findElement(By.id("bd"));
        Select day = new Select(webDay);
        day.selectByVisibleText("11");
        MyFunc.Bekle(2);

        WebElement webMonth = driver.findElement(By.id("bm"));
        Select month = new Select(webMonth);
        month.selectByValue("1");
        MyFunc.Bekle(2);

        WebElement webYear = driver.findElement(By.id("by"));
        Select year = new Select(webYear);
        year.selectByVisibleText("1940");
        MyFunc.Bekle(2);

        WebElement usageAgreement = driver.findElement(By.xpath("//input[@type='checkbox'][@id=\"rnufpca\"]"));
        usageAgreement.click();
        MyFunc.Bekle(2);

        WebElement submit = driver.findElement(By.xpath("//input[@type='submit'][@value=\"Hesap aç\"]"));
        submit.click();
        MyFunc.Bekle(2);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement accountCreationControl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='m-c']")));
        assertEquals("Bu eposta adresi zaten kayıtlı. Lütfen giriş yapmayı deneyin.", accountCreationControl.getText());

        MyFunc.Bekle(3);
        driver.quit();
    }

}

