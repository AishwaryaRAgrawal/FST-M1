import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity6 {
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
if(driver.findElement(By.xpath("(//span[@class='display-name'])[1]")).isDisplayed()) {
    System.out.println("Completed");
    driver.close();
}
    }
}




