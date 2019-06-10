import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginNegative {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mishpahug.co.il/");
        Thread.sleep(2000);
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("idsignin")).click();
        WebElement loginInput =  driver.findElement(By.id("logininput"));
        loginInput.click();
        loginInput.sendKeys("olga_mo_");
        WebElement passwordInput = driver.findElement(By.id("passwordinput"));
        passwordInput.click();
        passwordInput.sendKeys("Anna2020");
        driver.findElement(By.id("signinrequest")).click();
        Thread.sleep(2000);


        WebElement wrongLoginOrPassword = driver.findElement(By.xpath("//div[@id='wrongloginorpassword']"));
        Thread.sleep(5000);
        System.out.println("Title wrongLoginOrPassword verification:   "
            + wrongLoginOrPassword.getText());

        WebElement closeWindow =
                driver.findElement(By.xpath("//div[@id='closedsignin']//i[@class='fa fa-times-circle-o']"));
               closeWindow.click();

        List<WebElement> listButtons = driver.findElements(By.className("navi-item"));

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Home button is displayed: " + listButtons.get(0).isDisplayed());
        System.out.println("Login button is displayed: " + listButtons.get(1).isDisplayed());
        System.out.println("Registration button is displayed: " + listButtons.get(2).isDisplayed());

        WebElement homeButtonForLoggedUser = driver.findElement(By.id("ihome"));
        WebElement profileButton = driver.findElement(By.id("profile"));
        WebElement messageButton = driver.findElement(By.id("messagebtnutil"));
        WebElement rateButton = driver.findElement(By.id("ratebtnutil"));

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Home button for logged user is displayed: " + homeButtonForLoggedUser.isDisplayed());
        System.out.println("Profile button is displayed: " + profileButton.isDisplayed());
        System.out.println("Message button is displayed: " + messageButton.isDisplayed());
        System.out.println("Rate button is displayed: " + rateButton.isDisplayed());

         driver.quit();
    }
}
