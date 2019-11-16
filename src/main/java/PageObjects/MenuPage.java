package PageObjects;

import CoreClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

    public class MenuPage extends BasePage {
        public MenuPage(WebDriver driver) {
            super(driver);
        }

        //By menu = By.xpath("")

        public void ClickOnMenu(String menuname) throws InterruptedException{

            Thread.sleep(500);
            Click(By.xpath("//*[@id='cssmenu']//a[text()='" + menuname + "']"));

    }
}
