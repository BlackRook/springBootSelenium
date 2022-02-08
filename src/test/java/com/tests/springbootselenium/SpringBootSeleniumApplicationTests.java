package com.tests.springbootselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringBootSeleniumApplicationTests {

    @Autowired
    @Lazy
    private WebDriver internetExplorerDriver;

    @Autowired
    @Lazy
    private WebDriver chromeDriver;

    @Autowired
    @Lazy
    private WebDriver geckodriver;

    @Value("${url}")
    String url;

    @Value("${login}")
    String login;

    @Value("${password}")
    String password;

    SpringBootSeleniumApplicationTests() {
    }

    @Test
    void contextLoads() {
    }

    @Test
    public void getSearchPage() {

        geckodriver.get(url);

        By searchFieldUsername= By.xpath("//div/input[@name=\"username\"]");
        By searchFieldPassword = By.xpath("//div/input[@id=\"password\"]");
        By searchButtonLogin = By.xpath("//div/input[@id=\"kc-login\"]");
        By searchButtonUser = By.xpath("(//button[@class=\"ConnectionIconWrapper_c1c8zpxf dc_base_bf4c16a dc_compact_c10l1k7 dc_StyledButton_sxf5jh6 dc_ButtonBase_b1o067xl\"])[3]");
        By searchFullName = By.xpath("//div[@class=\"UserFullName_uqcprxw\"]");

        WebDriverWait wait = new WebDriverWait(geckodriver, 1000);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(searchFieldUsername));
        element.sendKeys(login);

        WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(searchFieldPassword));
        element1.sendKeys(password);

        WebElement element3 = wait.until(ExpectedConditions.presenceOfElementLocated(searchButtonLogin));
        element3.click();


        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(searchButtonUser));
        button.click();

        WebElement fullName = wait.until(ExpectedConditions.presenceOfElementLocated(searchFullName));
        fullName.click();


        geckodriver.quit();
    }
}
