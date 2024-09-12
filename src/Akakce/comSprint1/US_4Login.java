package Akakce.comSprint1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class US_4Login extends BaseDriver {

    @Test
    public void OturumAcmaUS_4_TC_0401(){


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



        BekleKapat();


    }

    @Test
    public void OturumAcmaGeçersizSifre_US_4_TC_0402(){

        driver.get("https://www.akakce.com/");


        WebElement girisYap=driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        girisYap.click();
        MyFunc.Bekle(2);

        WebElement ePosta=driver.findElement(By.cssSelector("[id='life']"));
        ePosta.sendKeys("TestUserr123@hotmail.com");
        MyFunc.Bekle(2);

        WebElement sifre=driver.findElement(By.cssSelector("[id='lifp']"));
        sifre.sendKeys("password.129");
        MyFunc.Bekle(2);

        WebElement girisBtn=driver.findElement(By.cssSelector("[id='lfb']"));
        girisBtn.click();
        MyFunc.Bekle(2);



        BekleKapat();


    }

    @Test
    public void OturumAcmaGeçersizEposta_US_4_TC_0403(){

        driver.get("https://www.akakce.com/");

        WebElement girisYap=driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        girisYap.click();
        MyFunc.Bekle(2);

        WebElement ePosta=driver.findElement(By.cssSelector("[id='life']"));
        ePosta.sendKeys("Invalid username");
        MyFunc.Bekle(2);

        WebElement sifre=driver.findElement(By.cssSelector("[id='lifp']"));
        sifre.sendKeys("1Bilgisayar1");
        MyFunc.Bekle(2);

        WebElement girisBtn=driver.findElement(By.cssSelector("[id='lfb']"));
        girisBtn.click();
        MyFunc.Bekle(2);



        BekleKapat();


    }

    @Test
    public void OturumAcmaBosNull_US_4_TC_0404(){

        driver.get("https://www.akakce.com/");

        WebElement girisYap=driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        girisYap.click();
        MyFunc.Bekle(2);

        WebElement ePosta=driver.findElement(By.cssSelector("[id='life']"));
        ePosta.sendKeys("");
        MyFunc.Bekle(2);

        WebElement sifre=driver.findElement(By.cssSelector("[id='lifp']"));
        sifre.sendKeys("");
        MyFunc.Bekle(2);

        WebElement girisBtn=driver.findElement(By.cssSelector("[id='lfb']"));
        girisBtn.click();
        MyFunc.Bekle(2);



        BekleKapat();


    }
}
