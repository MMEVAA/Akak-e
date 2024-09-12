package Akakce.comSprint1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US_6MesajKutusuKontorlu extends BaseDriver {

    @Test
    public void Test1(){



        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement girisYap=driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        girisYap.click();
        MyFunc.Bekle(2);

        WebElement ePosta=driver.findElement(By.cssSelector("[id='life']"));
        ePosta.sendKeys("TestUserr123@hotmail.com");
        MyFunc.Bekle(2);

        WebElement sifre=driver.findElement(By.cssSelector("[id='lifp']"));
        sifre.sendKeys("1Bilgisayar1");
        MyFunc.Bekle(2);

        WebElement girisBtn=driver.findElement(By.cssSelector("[id='lfb']"));
        girisBtn.click();
        MyFunc.Bekle(2);

        WebElement hesabimHead=driver.findElement(By.cssSelector("[id='H_a_v8']"));
        new Actions(driver).moveToElement(hesabimHead).build().perform();


        WebElement hesabimgiris=driver.findElement(By.xpath("//*[text()='Hesabım']"));
        hesabimgiris.click();

        MyFunc.Bekle(2);

        WebElement mesajlarim=driver.findElement(By.cssSelector("[id='AL'] :nth-child(3)"));
        mesajlarim.click();
        MyFunc.Bekle(2);

        WebElement mesajNotu=driver.findElement(By.cssSelector("[class='wbb_v8']> :nth-child(1)"));
        System.out.println("mesajNotu.getText() = " + mesajNotu.getText());

        Assert.assertTrue(mesajNotu.getText().contains("Listelenecek mesaj bulunamadı."));



        BekleKapat();



    }
}
