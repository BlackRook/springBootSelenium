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

@SpringBootTest

class DraftCheckElement {


    @Autowired
    @Lazy
    private WebDriver geckodriver;

    @Value("${urlDraft}")
    String urlDraft;

    @Value("${login}")
    String login;

    @Value("${password}")
    String password;

    DraftCheckElement() {
    }

    @Test
    void contextLoads() {
    }

    @Test
    public void checkDraft () {

        geckodriver.get(urlDraft);

        By searchFieldUsername= By.xpath("//div/input[@name=\"username\"]");
        By searchFieldPassword = By.xpath("//div/input[@id=\"password\"]");
        By searchButtonLogin = By.xpath("//div/input[@id=\"kc-login\"]");
        By searchFieldQuestionName = By.xpath("//input[@class=\"body_b1qyszef normal_nhknakf NativeInput_n1u9jars\"]");
        By head = By.xpath("//div/h4[text()=\"Основные данные\"]");
        By stringName = By.xpath("//span[text()=\"Название вопроса  *\"]");
        By searchCoverLetter = By.xpath("//span[text()=\"Сопроводительное письмо\"]");
        By searchFieldCoverLetter = By.xpath("//textarea[@class=\"TextareaStyled_tpnb05b\"]");

        WebDriverWait wait = new WebDriverWait(geckodriver, 1000);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(searchFieldUsername));
        element.sendKeys(login);

        WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(searchFieldPassword));
        element1.sendKeys(password);

        WebElement element3 = wait.until(ExpectedConditions.presenceOfElementLocated(searchButtonLogin));
        element3.click();

        WebElement headName = wait.until(ExpectedConditions.presenceOfElementLocated(head));
        headName.isDisplayed();//заголовок черновика "Основные данные"

        WebElement stringQuestionName = wait.until(ExpectedConditions.presenceOfElementLocated(stringName));
        stringQuestionName.isDisplayed();//название поля "Название вопроса  *"


        WebElement fieldQuestionName = wait.until(ExpectedConditions.presenceOfElementLocated(searchFieldQuestionName));
        fieldQuestionName.isDisplayed();//поле "Название вопроса  *"

        //тут должна быть проверка, что поле предзаполнено

        WebElement coverLetter = wait.until(ExpectedConditions.presenceOfElementLocated(searchCoverLetter));
        coverLetter.isDisplayed();//название поля "Сопроводительное письмо"

        WebElement fieldCoverLetter = wait.until(ExpectedConditions.presenceOfElementLocated(searchFieldCoverLetter));
        fieldCoverLetter.isDisplayed(); //найти поле "Сопроводительное письмо"











    }


}
