package com.company.windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsHandling {
    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        Thread.sleep(2000);
    }
    @Test
    public void windowsHandling() throws InterruptedException {
        //------print first window handle(code)
        String firstWinfowHandle = driver.getWindowHandle();
        System.out.println("First window (active) handle: " + firstWinfowHandle);
        //----open second window by 'Try it Yourself'
        driver.findElement(By.xpath("//*[contains(text(), 'Try it Yourself')]")).click();
        Thread.sleep(5000);
        System.out.println("Active window handle: " + driver.getWindowHandle());

       String secondWindowHandle = "";
       for (String handle: driver.getWindowHandles()){
           System.out.println("Handle: " + handle);
           if(!handle.equals(firstWinfowHandle))secondWindowHandle = handle;
       }
       driver.switchTo().window(secondWindowHandle);
       System.out.println("Active window handle: " + driver.getWindowHandle());

        //----try to print name "Run" button from the second window----
       System.out.println("Run button name: " + driver
                .findElement(By.xpath("//button[contains(text(),'Run »')]")).getText());
        //----try to print header from the first window---
        /*System.out.println("Header text: " + driver
                .findElement(By.tagName("h1")).getText());*/
        //-----Window closing
        driver.close();
        Thread.sleep(3000);
        //System.out.println("Active window handle: " + driver.getWindowHandle());
        driver.switchTo().window(firstWinfowHandle);
        System.out.println("Active window handle: " + driver.getWindowHandle());





    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
