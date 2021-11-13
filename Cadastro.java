/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroselenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author rafap
 */
public class Cadastro {

    static WebDriver driver;

    public Cadastro(WebDriver driver) {
        Cadastro.driver = driver;
    }

    public void preencheCampos() {
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Rafaela");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Priscila Cruz Moreira");

        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("rafaela.cruz.mor.2021");

        WebElement senha = driver.findElement(By.name("Passwd"));
        senha.sendKeys("QATest123");

        WebElement confSenha = driver.findElement(By.name("ConfirmPasswd"));
        confSenha.sendKeys("QATest123");

        WebElement mostrarSenha = driver.findElement(By.id("selectioni1"));
        mostrarSenha.click();

        WebElement proxima = driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button"));
        proxima.click();

        WebElement phone = driver.findElement(By.id("phoneNumberId"));
        phone.sendKeys("(31)992431156");

    }

}
