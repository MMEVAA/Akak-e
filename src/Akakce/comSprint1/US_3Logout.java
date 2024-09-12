package Akakce.comSprint1;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.ENTER;

public class US_3Logout extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");

        WebElement Login = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/giris/']"));
        Login.click();

        WebElement emailInput = driver.findElement(By.cssSelector("[id='life']"));
        emailInput.sendKeys("TestUserr123@hotmail.com");

        WebElement PasswordInput = driver.findElement(By.cssSelector("[id='lifp']"));
        PasswordInput.sendKeys("1Bilgisayar1");

        WebElement submitButton = driver.findElement(By.cssSelector("[id='lfb']"));
        submitButton.sendKeys(ENTER);

        WebElement profileIcon = driver.findElement(By.cssSelector("[id='H_a_v8']"));
        profileIcon.click();

        WebElement logoutButton = driver.findElement(By.cssSelector("[href='#Çık']"));
        logoutButton.click();
        System.out.println("Giriş Yap butonunun varligi kontrol edildi = " + driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/giris/']")));

        driver.quit();
    }
}
