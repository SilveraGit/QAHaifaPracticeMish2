package ru.stqa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ru.stqa.selenium.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() throws InterruptedException {
    driver.get(baseUrl);
    System.out.println("Title: " + driver.getTitle());

    Thread.sleep(15000);

    driver.findElement(By.id("closedIntro")).click();
    Thread.sleep(15000);
    System.out.println("Element: " +
            driver.findElement(By.id("idtitletypesearchevents")).getText());
    driver.findElement(By.id("idsignin")).click();
    Thread.sleep(15000);
    driver.findElement(By.id("logininput")).click();
    driver.findElement(By.id("logininput")).sendKeys("marinaA");
    driver.findElement(By.id("passwordinput")).click();
    driver.findElement(By.id("passwordinput")).sendKeys("marina1!");
    Thread.sleep(2000);
    driver.findElement(By.id("signinrequest")).click();
    Thread.sleep(3000);

  }
}
