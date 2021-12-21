package com.tests.springbootselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringBootSeleniumApplicationTests {

    @Autowired
    @Lazy
    private WebDriver internetExplorerDriver;

    @Autowired
    @Lazy
    private WebDriver chromeDriver;

    @Test
    void contextLoads() {
    }

    @Test
    public void getSearchPage() {

        chromeDriver.get("https://www.google.com");
        chromeDriver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Ванька лошара");
        chromeDriver.manage().window().fullscreen();


        /*WebDriverWait wait = new WebDriverWait(chromeDriver, 5);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(searchField));
        element.sendKeys("Алёнка лошара");
        element.submit();
        wait.until(ExpectedConditions.alertIsPresent());

        assertNotNull(element);*/
    }
}
