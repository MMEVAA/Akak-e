package HesapDogrulama;


import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class US_2Dogrulama extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.akakce.com/");

        WebElement girisYap= driver.findElement(By.xpath("//a[text()='Giriş Yap'][1]"));
        girisYap.click();
        MyFunc.Bekle(1);

        WebElement email= driver.findElement(By.xpath("//input[@id='life']"));
        email.sendKeys("TestUserr123@hotmail.com");
        MyFunc.Bekle(1);

        WebElement sifre= driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.sendKeys("1Bilgisayar1");
        MyFunc.Bekle(1);

        WebElement login= driver.findElement(By.xpath("//input[@id='lfb']"));
        login.click();
        MyFunc.Bekle(1);



        WebElement userNameDisplay = driver.findElement(By.xpath("//*[text()='Alperen']"));

        String displayedUsername = userNameDisplay.getText();

        Assert.assertEquals("Kullanıcı adı doğrulanmadı", "Alperen", displayedUsername);



        BekleKapat();










    }
}
