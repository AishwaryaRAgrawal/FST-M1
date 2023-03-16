import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity8 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/lms");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Contact']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']")).sendKeys("Aishwarya Agrawal");
        driver.findElement(By.xpath("//input[@id='wpforms-8-field_1']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("Some message");

        driver.findElement(By.xpath("//button[text()='Send Message']")).click();
        String message=driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']//p")).getText();
        System.out.println("Success message is"+message);
        driver.close();


    }
}




