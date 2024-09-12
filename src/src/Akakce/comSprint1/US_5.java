package Akakce.comSprint1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class US_5 extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://www.akakce.com");

        WebElement girisYapButton = driver.findElement(By.xpath("(//a[@href=\"/akakcem/giris/\"])[1]"));
        girisYapButton.click();

        WebElement email = driver.findElement(By.xpath("//input[@id='life']"));
        email.sendKeys("TestUserr123@hotmail.com");

        WebElement sifre = driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.sendKeys("1Bilgisayar1");

        WebElement girisYap2Button = driver.findElement(By.xpath("//input[@type='submit' and @class='s' and @value='Giriş yap' ]"));
        girisYap2Button.click();

        MyFunc.Bekle(2);

        WebElement hesabım = driver.findElement(By.xpath("//a[text()='Alperen']"));
        hesabım.click();

        WebElement siparislerim = driver.findElement(By.xpath("//a[text()='Siparişlerim']"));
        siparislerim.click();

        BekleKapat();

    }

    }
