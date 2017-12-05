package test.java;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;


public class SikuliSeleniumTesting {

    @Test
    public void Test_Case_One() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.phptravels.net/login");
        Thread.sleep(3000);

        Screen screen = new Screen();
        Pattern img_email = new Pattern("images/Email.PNG");
        Pattern img_pwd = new Pattern("images/Password.PNG");
        Pattern img_btnLogin = new Pattern("images/Login.PNG");

        try {
            //screen.click(img_email);
            screen.type(img_email,"admin");
            screen.type(img_pwd,"password");
            screen.click(img_btnLogin);
            Thread.sleep(3000);
        } catch (FindFailed e) {
            e.printStackTrace();
        }

        System.out.print("DONE");


    }

}
