package PageObjects;

import CoreClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    //positive
    public LoginPage (WebDriver driver){
        super(driver);
    }

    public Boolean VerifyTitle(){

        String Title = getTitleOfCurrentPage();
        if (Title.contains("LOGIN")){
            return true;
        }
        return false;
    }

    public void LoginCredentials(){
        SendKeys(By.id("userName"),"shalinanabi3@gmail.com");
        SendKeys(By.id("password"),"123456");
        Click(By.xpath("//*[@id=\"frmsendsms\"]/div[6]/button"));
    }




//    public void ClickOnMenue (String menuname) throws InterruptedException{
//        Thread.sleep(5000);
//
//        Click(By.xpath("//[@id='cssmenu']//a[text()='" + menuname + "']"));
//    }
//
//    public void clickonloginButton(){
//        Click(By.xpath("//a[contains(text(),'Login')]"));
//    }








    //negative test cases
}
