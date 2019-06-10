import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UserRoleTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mishpahug.co.il/");
        Thread.sleep(2000);
        driver.findElement(By.id("closedIntro")).click();

        //------Log in to Mishpahug.co.il, status in Mishpahug is "Family"---------
        driver.findElement(By.id("idsignin")).click();
        WebElement loginInput = driver.findElement(By.id("logininput"));
        loginInput.click();
        loginInput.sendKeys("olga_mo_");
        WebElement passwordInput = driver.findElement(By.id("passwordinput"));
        passwordInput.click();
        passwordInput.sendKeys("Anna2019");
        Thread.sleep(2000);
        driver.findElement(By.id("signinrequest")).click();
        Thread.sleep(4000);

        //-----------------------Profile--------------------
        WebElement profileEntrance = driver.findElement(By.xpath("//i[@id='profile']"));
        Thread.sleep(2000);
        profileEntrance.click();
        Thread.sleep(2000);

        WebElement editProfile = driver.findElement(By.id("idbtneditprofile"));
        Thread.sleep(2000);
        editProfile.click();
        Thread.sleep(2000);

        //---------------------Role Guest & Family--------------------------
        WebElement roleGuestAndFamily = driver.findElement(By.id("typeuser3inprofile"));
        roleGuestAndFamily.click();
        WebElement saveProfile =driver.findElement(By.id("idbtnsaveprofile"));
        saveProfile.click();
        Thread.sleep(2000);
        WebElement statusInMishpahug = driver.findElement(By.id("statusinmishpahuginprofile"));
        Thread.sleep(2000);
        System.out.println("Role in Mishpahug: " + statusInMishpahug.getText());
        Thread.sleep(2000);
        WebElement buttonHome = driver.findElement(By.id("ihome"));
        buttonHome.click();
        Thread.sleep(2000);
        WebElement buttonNewEvent = driver.findElement(By.id("idbtnaddevent"));
        System.out.println("It is possible to create a new event: " + buttonNewEvent.isDisplayed());
        buttonNewEvent.click();
        Thread.sleep(2000);
        WebElement addNewEventTitle = driver.findElement(By.id("idtitleevent"));
        System.out.println("Title: " + addNewEventTitle.getText()+ " exists - " + addNewEventTitle.isDisplayed());

        //-----------------------Profile--------------------
        profileEntrance = driver.findElement(By.xpath("//i[@id='profile']"));
        Thread.sleep(2000);
        profileEntrance.click();
        Thread.sleep(2000);

        editProfile = driver.findElement(By.id("idbtneditprofile"));
        Thread.sleep(2000);
        editProfile.click();
        Thread.sleep(2000);
        //---------------------Role Guest-------------------------
        WebElement roleGuest = driver.findElement(By.id("typeuser1inprofile"));
        roleGuest.click();
        Thread.sleep(2000);
        saveProfile =driver.findElement(By.id("idbtnsaveprofile"));
        saveProfile.click();
        Thread.sleep(2000);
        statusInMishpahug = driver.findElement(By.id("statusinmishpahuginprofile"));
        System.out.println("Role in Mishpahug: " + statusInMishpahug.getText());

        buttonHome = driver.findElement(By.id("ihome"));
        buttonHome.click();
        Thread.sleep(2000);
        buttonNewEvent = driver.findElement(By.id("idbtnaddevent"));
        System.out.println("It is possible to create a new event: " + buttonNewEvent.isDisplayed());

        //-----------------------Profile--------------------
        profileEntrance = driver.findElement(By.xpath("//i[@id='profile']"));
        Thread.sleep(2000);
        profileEntrance.click();
        Thread.sleep(2000);

        editProfile = driver.findElement(By.id("idbtneditprofile"));
        Thread.sleep(2000);
        editProfile.click();
        Thread.sleep(2000);
        //---------------------Role Family-------------------------
        WebElement roleFamily = driver.findElement(By.id("typeuser2inprofile"));
        roleFamily.click();
        saveProfile =driver.findElement(By.id("idbtnsaveprofile"));
        saveProfile.click();
        Thread.sleep(2000);
        statusInMishpahug = driver.findElement(By.id("statusinmishpahuginprofile"));
        Thread.sleep(2000);
        System.out.println("Role in Mishpahug: " + statusInMishpahug.getText());
        Thread.sleep(2000);
        buttonHome = driver.findElement(By.id("ihome"));
        buttonHome.click();
        Thread.sleep(2000);
        buttonNewEvent = driver.findElement(By.id("idbtnaddevent"));
        System.out.println("It is possible to create a new event: " + buttonNewEvent.isDisplayed());
        buttonNewEvent.click();
        Thread.sleep(2000);
        addNewEventTitle = driver.findElement(By.id("idtitleevent"));
        System.out.println("Title: " + addNewEventTitle.getText()+ " exists - " + addNewEventTitle.isDisplayed());

        //-------------------User logs out from Mishpahug----------------------
        profileEntrance = driver.findElement(By.xpath("//i[@id='profile']"));
        profileEntrance.click();
        Thread.sleep(2000);
        WebElement logOutFronMishpahug = driver.findElement(By.id("idbtnsignoutprofile"));
        logOutFronMishpahug.click();

        driver.quit();

    }


}
