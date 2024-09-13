package Akakce.comSprint1;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;


public class US_7Delete {


    @Test
    public void Test1() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.akakce.com/");

        WebElement girisButonu = driver.findElement(By.xpath("//a[contains(text(),'Giriş')]"));
        girisButonu.click();

        WebElement emailInput = driver.findElement(By.id("life"));
        emailInput.sendKeys("TestUserr123@hotmail.com");

        MyFunc.Bekle(2);

        WebElement passwordInput = driver.findElement(By.id("lifp"));
        passwordInput.sendKeys("1Bilgisayar1");


        WebElement loginButton = driver.findElement(By.id("lfb"));
        loginButton.click();

        MyFunc.Bekle(2);

        WebElement Hesabımı = driver.findElement(By.xpath("//a[text()='Alperen']"));
        Hesabımı.click();

       MyFunc.Bekle(2);

        WebElement HesabımıSil = driver.findElement(By.xpath("//a[text()='Hesabımı Sil']"));
        HesabımıSil.click();

        WebElement hesapSilOnay = driver.findElement(By.id("p"));
        hesapSilOnay.click();

        MyFunc.Bekle(2);

        WebElement passwordInputOnay = driver.findElement(By.id("p"));
        passwordInputOnay.sendKeys("hesapsilindi");



    }
}
