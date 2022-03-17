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

class DraftCustomKKInternalCheckElement {


    @Autowired
    @Lazy
    private WebDriver geckodriver;

    @Value("${urlDraftCustomKK}")
    String urlDraftCustomKK;

    @Value("${login}")
    String login;

    @Value("${password}")
    String password;

    DraftCustomKKInternalCheckElement() {
    }

    @Test
    void contextLoads() {
    }

    @Test
    public void checkDraft () {

        geckodriver.get(urlDraftCustomKK);

        By searchFieldUsername= By.xpath("//div/input[@name=\"username\"]");
        By searchFieldPassword = By.xpath("//div/input[@id=\"password\"]");
        By searchButtonLogin = By.xpath("//div/input[@id=\"kc-login\"]");
        By searchFieldQuestionName = By.xpath("(//input[@class=\"body_b1qyszef normal_nhknakf NativeInput_n1u9jars\"])[1]"); //поле название вопроса
        By head = By.xpath("//div/h4[text()=\"Основные данные\"]");//заголовок "Основные данные"
        By stringName = By.xpath("//span[text()=\"Название вопроса  *\"]");//заголовок "Название вопроса *"
        By searchCoverLetter = By.xpath("//span[text()=\"Сопроводительное письмо\"]");//заголовок "сопроводительное письмо"
        By searchFieldCoverLetter = By.xpath("//textarea[@class=\"TextareaStyled_tpnb05b\"]");//поле сопроводительное письмо
        By searchHeadSum = By.xpath("//span[text()=\"Сумма лимита\"]");//заголовок "Сумма лимита"
        By searchFieldSum = By.xpath("(//input[@class=\"body_b1qyszef normal_nhknakf NativeInput_n1u9jars\"])[2]");//поле сумма лимита
        By searchCurrency = By.xpath("//span[text()=\"Валюта\"]");//заголовок "валюта"
        By searchSignRouble = By.xpath("//div[@class=\"body_b1qyszef base_b1e8lfll disabled_d423o5y FieldRoot_fyl4bb\"]");//знак валюты
        By searchHeadCommittee = By.xpath("//div[text()=\"Комитет *\"]");//заголовок Комитет *
        By searchRadioButton1 = By.xpath("(//input[@type=\"radio\"])[1]");
        By searchRadioButton2 = By.xpath("(//input[@type=\"radio\"])[2]");
        By searchRadioButton3 = By.xpath("(//input[@type=\"radio\"])[3]");
        By searchRadioButton4 = By.xpath("(//input[@type=\"radio\"])[4]");
        By searchRadioButton5 = By.xpath("(//input[@type=\"radio\"])[5]");
        By searchRadioButton6 = By.xpath("(//input[@type=\"radio\"])[6]");
        By searchHeadCommitteeBank = By.xpath("//span[text()=\"Кредитный комитет Корпоративного-инвестиционного бизнеса Банка\"]");//"Кредитный комитет Корпоративного-инвестиционного бизнеса Банка"
        By searchHeadCommitteeGroup = By.xpath("//span[text()=\"Кредитный комитет Корпоративного-инвестиционного бизнеса Группы\"]");//"Кредитный комитет Корпоративного-инвестиционного бизнеса Группы"
        By searchHeadClassifier = By.xpath("//div[text()=\"Классификатор решения *\"]"); //"Классификатор решения *"
        By searchClassifierDecision = By.xpath("//span[text()=\"О принятии нового решения\"]");//"О принятии нового решения"
        By searchClassifierChangeDecision = By.xpath("//span[text()=\"О внесении изменения в решение\"]");//"О внесении изменения в решение"
        By searchButtonTimeDecision = By.xpath("(//button[@class=\"compact_cv6g0ds base_bf4c16a ButtonBase_b1o067xl\"])[1]");
        By searchHeadParametersQuestion = By.xpath("//div[text()=\"Параметры вопроса\"]");//"Параметры вопроса"
        By searchCheckbox1 = By.xpath("(//input[@type=\"checkbox\"])[1]"); //checkbox 1
        By searchCheckbox2 = By.xpath("(//input[@type=\"checkbox\"])[2]"); //checkbox 2
        By searchCheckbox3 = By.xpath("(//input[@type=\"checkbox\"])[3]"); //checkbox 3
        By searchNameClosedReview = By.xpath("//span[text()=\"Закрытое рассмотрение\"]");//"Закрытое рассмотрение"
        By searchNameIncompleteDoc = By.xpath("//span[text()=\"Неполный комплект документов\"]");//"Неполный комплект документов"
        By searchNameSupplementaryQuestion = By.xpath("//span[text()=\"Дополнительный вопрос\"]");//"Дополнительный вопрос"
        By searchHeadFormMeeting = By.xpath("//div[text()=\"Форма заседания\"]");//"Форма заседания"
        By searchPrompt = By.xpath("//div[@class=\"WrapperContent_w1jriqby\"]");//подсказка вопрос у формы заседания
        By searchNameInternalForm = By.xpath("//span[text()=\"Очная\"]");//"Очная форма
        By searchNameExtramuralForm = By.xpath("//span[text()=\"Заочная\"]");//"Заочная форма"
        By searchHeadProjectDecision = By.xpath("//span[text()=\"Проект решения\"]");//заголовок "Проект решения"
        By searchButtonDownload = By.xpath("(//button[@class=\"compact_cv6g0ds base_bf4c16a ButtonBase_b1o067xl\"])[2]");//кнопка загрузить с компьютера у проекта решения
        By searchButtonDownload2 = By.xpath("(//button[@class=\"compact_cv6g0ds base_bf4c16a ButtonBase_b1o067xl\"])[3]");//кнопка загрузить с компьютера у доп.материалов
        By searchHeadMaterials = By.xpath("//span[text()=\"Дополнительные материалы\"]");//заголовок "Дополнительные материалы"
        By searchHeadSpeaker = By.xpath("//div/h4[text()=\"Докладчики\"]");// заголовок "Докладчики"]
        By searchButtonDownload3 = By.xpath("(//button[@class=\"compact_cv6g0ds base_bf4c16a ButtonBase_b1o067xl\"])[4]");//кнопка "добавить" в блоке "докладчик"
        By searchButtonDownload4 = By.xpath("(//button[@class=\"compact_cv6g0ds base_bf4c16a ButtonBase_b1o067xl\"])[5]");//кнопка "добавить" в блоке "структуратор"
        By searchHeadStructure = By.xpath("//div/h4[text()=\"Структураторы\"]");//заголовок "структураторы"
        By searchButtonToSend = By.xpath("//button[@class=\"formButtonIndentRight_fpscvdo compact_cv6g0ds base_b1k8865 default_d16m0uz7 ButtonBase_b1o067xl\"]");//кнопка отправить
        By searchButtonCancel = By.xpath("//button[@class=\"compact_cv6g0ds base_b6dxt8v default_d1plpoat ButtonBase_b1o067xl\"]");//кнопка "отменить"

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
        stringQuestionName.isDisplayed();//заголовок "Название вопроса  *"


        WebElement fieldQuestionName = wait.until(ExpectedConditions.presenceOfElementLocated(searchFieldQuestionName));
        fieldQuestionName.isDisplayed();//поле "Название вопроса  *"


        WebElement coverLetter = wait.until(ExpectedConditions.presenceOfElementLocated(searchCoverLetter));
        coverLetter.isDisplayed();//заголовок "Сопроводительное письмо"

        WebElement fieldCoverLetter = wait.until(ExpectedConditions.presenceOfElementLocated(searchFieldCoverLetter));
        fieldCoverLetter.isDisplayed(); //найти поле "Сопроводительное письмо"

        WebElement headSum = wait.until(ExpectedConditions.presenceOfElementLocated(searchHeadSum));
        headSum.isDisplayed();

        WebElement fieldSum = wait.until(ExpectedConditions.presenceOfElementLocated(searchFieldSum));
        fieldSum.isDisplayed();

        WebElement currency = wait.until(ExpectedConditions.presenceOfElementLocated(searchCurrency));
        currency.isDisplayed();

        WebElement signRouble = wait.until(ExpectedConditions.presenceOfElementLocated(searchSignRouble));
        signRouble.isDisplayed();

        WebElement committee = wait.until(ExpectedConditions.presenceOfElementLocated(searchHeadCommittee));
        committee.isDisplayed();

        WebElement radioButton1 = wait.until(ExpectedConditions.presenceOfElementLocated(searchRadioButton1));
        radioButton1.isDisplayed();

        WebElement radioButton2 = wait.until(ExpectedConditions.presenceOfElementLocated(searchRadioButton2));
        radioButton2.isDisplayed();

        WebElement radioButton3 = wait.until(ExpectedConditions.presenceOfElementLocated(searchRadioButton3));
        radioButton3.isDisplayed();

        WebElement radioButton4 = wait.until(ExpectedConditions.presenceOfElementLocated(searchRadioButton4));
        radioButton4.isDisplayed();

        WebElement radioButton5 = wait.until(ExpectedConditions.presenceOfElementLocated(searchRadioButton5));
        radioButton5.isDisplayed();

        WebElement radioButton6 = wait.until(ExpectedConditions.presenceOfElementLocated(searchRadioButton6));
        radioButton6.isDisplayed();

        WebElement committeeBank = wait.until(ExpectedConditions.presenceOfElementLocated(searchHeadCommitteeBank));
        committeeBank.isDisplayed();

        WebElement committeeGroup = wait.until(ExpectedConditions.presenceOfElementLocated(searchHeadCommitteeGroup));
        committeeGroup.isDisplayed();

        WebElement headClassifier = wait.until(ExpectedConditions.presenceOfElementLocated(searchHeadClassifier));
        headClassifier.isDisplayed();

        WebElement classifierDecision = wait.until(ExpectedConditions.presenceOfElementLocated(searchClassifierDecision));
        classifierDecision.isDisplayed();

        WebElement classifierChangeDecision = wait.until(ExpectedConditions.presenceOfElementLocated(searchClassifierChangeDecision));
        classifierChangeDecision.isDisplayed();

        WebElement buttonTimeDecision = wait.until(ExpectedConditions.presenceOfElementLocated(searchButtonTimeDecision));
        buttonTimeDecision.isDisplayed();

        WebElement headParametersQuestion = wait.until(ExpectedConditions.presenceOfElementLocated(searchHeadParametersQuestion));
        headParametersQuestion.isDisplayed();

        WebElement checkbox1 = wait.until(ExpectedConditions.presenceOfElementLocated(searchCheckbox1));
        checkbox1.isDisplayed();

        WebElement checkbox2 = wait.until(ExpectedConditions.presenceOfElementLocated(searchCheckbox2));
        checkbox2.isDisplayed();

        WebElement checkbox3 = wait.until(ExpectedConditions.presenceOfElementLocated(searchCheckbox3));
        checkbox3.isDisplayed();

        WebElement nameClosedReview = wait.until(ExpectedConditions.presenceOfElementLocated(searchNameClosedReview));
        nameClosedReview.isDisplayed();

        WebElement nameIncompleteDoc = wait.until(ExpectedConditions.presenceOfElementLocated(searchNameIncompleteDoc));
        nameIncompleteDoc.isDisplayed();

        WebElement nameSupplementaryQuestion = wait.until(ExpectedConditions.presenceOfElementLocated(searchNameSupplementaryQuestion));
        nameSupplementaryQuestion.isDisplayed();

        WebElement headFormMeeting = wait.until(ExpectedConditions.presenceOfElementLocated(searchHeadFormMeeting));
        headFormMeeting.isDisplayed();

        WebElement prompt = wait.until(ExpectedConditions.presenceOfElementLocated(searchPrompt));
        prompt.isDisplayed();

        WebElement nameInternalForm = wait.until(ExpectedConditions.presenceOfElementLocated(searchNameInternalForm));
        nameInternalForm.isDisplayed();

        WebElement nameExtramuralForm = wait.until(ExpectedConditions.presenceOfElementLocated(searchNameExtramuralForm));
        nameExtramuralForm.isDisplayed();

        WebElement headProjectDecision = wait.until(ExpectedConditions.presenceOfElementLocated(searchHeadProjectDecision));
        headProjectDecision.isDisplayed();

        WebElement buttonDownload = wait.until(ExpectedConditions.presenceOfElementLocated(searchButtonDownload));
        buttonDownload.isDisplayed();

        WebElement buttonDownload2 = wait.until(ExpectedConditions.presenceOfElementLocated(searchButtonDownload2));
        buttonDownload2.isDisplayed();

        WebElement headMaterials = wait.until(ExpectedConditions.presenceOfElementLocated(searchHeadMaterials));
        headMaterials.isDisplayed();

        WebElement headSpeaker = wait.until(ExpectedConditions.presenceOfElementLocated(searchHeadSpeaker));
        headSpeaker.isDisplayed();

        WebElement buttonDownload3 = wait.until(ExpectedConditions.presenceOfElementLocated(searchButtonDownload3));
        buttonDownload3.isDisplayed();

        WebElement buttonDownload4 = wait.until(ExpectedConditions.presenceOfElementLocated(searchButtonDownload4));
        buttonDownload4.isDisplayed();

        WebElement headStructure = wait.until(ExpectedConditions.presenceOfElementLocated(searchHeadStructure));
        headStructure.isDisplayed();

        WebElement buttonToSend = wait.until(ExpectedConditions.presenceOfElementLocated(searchButtonToSend));
        buttonToSend.isDisplayed();

        WebElement buttonCancel = wait.until(ExpectedConditions.presenceOfElementLocated(searchButtonCancel));
        buttonCancel.isDisplayed();

        geckodriver.quit();







































    }


}
