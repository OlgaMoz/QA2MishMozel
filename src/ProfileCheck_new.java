import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileCheck_new {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mishpahug.co.il/");
        Thread.sleep(2000);
        driver.findElement(By.id("closedIntro")).click();

        //------Log in to Mishpahug.co.il, status in Mishpahug is "Family" or "Guest and Family"---------
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

        //----------------------Confession------------------
        WebElement profileConfession = driver.findElement(By.id("fieldobjconfession"));
        String profConfes = "";
        Thread.sleep(2000);
        profConfes = profConfes + profileConfession.getText();
        Thread.sleep(2000);
        //------------------- Languages----------------
        WebElement profileLanguage = driver.findElement(By.xpath("//body/mainbody/div[@class='container main-content']/div[@id='userprofilediv']/div[@id='userprofileform']/div[@id='userprofile']/div[@id='userprofilecontent']/div[@class='row contentinwindow']/div[2]/div[6]"));
        Thread.sleep(2000);
        String profLang = "";
        profLang = profLang + profileLanguage.getText();
        Thread.sleep(2000);
        //------------------- Food preference----------------
        WebElement profileFood = driver.findElement(By.xpath("//body/mainbody/div[@class='container main-content']/div[@id='userprofilediv']/div[@id='userprofileform']/div[@id='userprofile']/div[@id='userprofilecontent']/div[@class='row contentinwindow']/div[2]/div[7]"));
        Thread.sleep(2000);
        String profFood = "";
        profFood = profFood + profileFood.getText();
        Thread.sleep(2000);

        //-----------------------Family--------------------
        WebElement familyEntrance = driver.findElement(By.id("family"));
        Thread.sleep(2000);
        familyEntrance.click();
        Thread.sleep(2000);

        //----------------------Confession------------------
        WebElement familyConfession = driver.findElement(By.xpath("//span[@id='fieldobjconfession']"));
        String familyConf = "";
        Thread.sleep(2000);
        familyConf = familyConf + familyConfession.getText();
        Thread.sleep(2000);
        System.out.println("//------------------- Confession----------------");
        System.out.println("Profile Confession : " + profConfes);
        System.out.println("Family Confession : " + familyConf);
        System.out.println("Profile Confession = Family Confession: " + profConfes.equals(familyConf));
        Thread.sleep(2000);

        //------------------- Languages----------------
        WebElement familyLanguage = driver.findElement(By.xpath("//div[@id='userprofilecontent']//div[1]//div[3]"));
        String familyLang = "";
        Thread.sleep(2000);
        familyLang = familyLang + familyLanguage.getText();
        Thread.sleep(2000);
        System.out.println("//------------------- Languages----------------");
        System.out.println("Profile Language = " +  profLang);
        System.out.println("Family Language = " +  familyLang);
        System.out.println("Profile Language = Family Language: " + profLang.equals(familyLang));
        Thread.sleep(2000);

        //------------------- Food preference----------------
        WebElement familyFood = driver.findElement(By.xpath("//div[@id='userprofilecontent']//div[1]//div[4]"));
        String familyFoo = "";
        Thread.sleep(2000);
        familyFoo = familyFoo + familyFood.getText();
        Thread.sleep(2000);
        System.out.println("//------------------- Food preference----------------");
        System.out.println("Profile Food = " +  profFood);
        System.out.println("Family Food = " +  familyFoo);
        System.out.println("Profile Food = Family Food: " + profFood.equals(familyFoo));
        Thread.sleep(2000);

        //-------------------User logs out from Mishpahug----------------------
        profileEntrance = driver.findElement(By.xpath("//i[@id='profile']"));
        profileEntrance.click();
        Thread.sleep(2000);
        WebElement logOutFronMishpahug = driver.findElement(By.id("idbtnsignoutprofile"));
        logOutFronMishpahug.click();

        driver.quit();

    }

}
