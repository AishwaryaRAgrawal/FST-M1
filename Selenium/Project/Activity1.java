
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


    public class Activity1 {
        public static void main(String args[])
        {
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://alchemy.hguy.co/lms");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            String title=driver.getTitle();
            System.out.println("title is "+title);
            if(title.equals("Alchemy LMS – An LMS Application"))
            {
                driver.close();
            }

        }
    }

