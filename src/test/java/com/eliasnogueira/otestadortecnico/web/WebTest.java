package com.eliasnogueira.otestadortecnico.web;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;
public class WebTest {

    @Test
    public void testeCadastroPessoa() {
        System.setProperty("webdriver.gecko.driver", "/Users/eliasnogueira/Selenium/chromedriver");

        WebDriver browser = new ChromeDriver();
        WebDriverWait espere = new WebDriverWait(browser, 10);
        browser.get("http://triangulos-1.herokuapp.com/");

        browser.findElement(By.id("triangulo_lado1")).sendKeys("3");
        browser.findElement(By.id("triangulo_lado2")).sendKeys("3");
        browser.findElement(By.id("triangulo_lado3")).sendKeys("3");
        browser.findElement(By.name("commit")).click();

        espere.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(".mensagem"))));
        String resultado = browser.findElement(By.cssSelector(".mensagem")).getText();
        assertEquals("Triângulo Equilatero", resultado);
        browser.quit();
    }
}
