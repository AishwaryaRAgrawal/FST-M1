import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity2 {
    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://alchemy.hguy.co/lms");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String heading = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
        System.out.println("heading is " + heading);
        if (heading.equals("Learn from Industry Experts")) {
            System.out.println("PASSSSSSSSSSS");
            driver.close();
        }

    }
}



