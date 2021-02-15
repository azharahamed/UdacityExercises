package com.example.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SeleniumTest {
    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost:8080/animal");
        WebElement inputField = webDriver.findElement(By.id("animalText"));
        inputField.sendKeys("Animal Text");
        inputField = webDriver.findElement(By.id("adjective"));
        inputField.sendKeys("Adjective");
        List<WebElement> trainingResults = webDriver.findElements(By.className("trainingMessage"));
        for(int i=0; i<5;i++){
            inputField = webDriver.findElement(By.id("adjective"));
            inputField.submit();

            System.out.println("trainingResults.size = " + trainingResults.size());
        }
        WebElement conclusionResult = webDriver.findElement(By.className("conclusionMessage"));
        System.out.println("Conclusion Result " + conclusionResult.getText());

        Thread.sleep(10000);
        webDriver.quit();

    }
}
