package com.tests.springbootselenium.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class SeleniumConfig {
    @Value("${internetExplorer.driver.path}")
    private String internetExplorerDriverPath;

    @Value("${chrome.driver.path}")
    private String chromeDriverPath;


    @Lazy
    @Bean
    public WebDriver internetExplorerDriver() {
        System.setProperty("webdriver.ie.driver", internetExplorerDriverPath);
        return new InternetExplorerDriver();
    }

    @Lazy
    @Bean
    public WebDriver chromeDriver() {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        return new ChromeDriver();
    }
}

