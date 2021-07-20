package com.company.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTest {
    WebDriver driver;
    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.negevjobs.co.il/employer/register");
        Thread.sleep(5000);
    }
    @Test
    public void selectTest() throws InterruptedException {
        Select position = new Select(driver.findElement(By.id("function")));
        //position.selectByValue("HR");
        position.selectByVisibleText("מנהל תפעול");
        Thread.sleep(2000);

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
