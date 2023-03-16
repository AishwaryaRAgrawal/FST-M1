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
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;


public class Activity9 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/lms");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='My Account']")).click();
        Thread.sleep(3000);
        String heading=driver.getTitle();
        System.out.println("heading is " + heading);
        if (heading.equals("My Account – Alchemy LMS")) {
            System.out.println("PASSSSSSSSSSS");
        }
        driver.findElement(By.xpath("//a[@href='#login']")).click();
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='All Courses']")).click();
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("(//a[@rel='bookmark'])[3]//img"))).click().build().perform();
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("((//a[@class='ld-item-name ld-primary-color-hover'])[1]//div)[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);
        element.click();
        String title = driver.getTitle();
        System.out.println("Title is" + title);
        if (title.equals("Deliverability Of Your Emails – Alchemy LMS")) {
            System.out.println("PASSSSS");
        }
        try{
            driver.findElement(By.xpath("//div[text()='Mark Complete']")).isDisplayed();
        }
        catch (Exception e)
        {
            System.out.println("Mark complete option is not available on the screen");

        }
        driver.close();


    }
}




