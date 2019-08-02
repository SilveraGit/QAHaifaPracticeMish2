package ru.stqa.selenium.pages;

import org.openqa.selenium.WebDriver;

/**
 * Abstract class representation of a PageBase in the UI. PageBase object pattern
 */
public abstract class PageBase {

  protected WebDriver driver;


  public PageBase(WebDriver driver) {
    this.driver = driver;
  }



}
