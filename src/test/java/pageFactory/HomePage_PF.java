package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage_PF {

    protected WebDriver driver;

    @FindBy(id = "logout")
    List<WebElement> btn_logout;

    public HomePage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoutAvailable(){
       return btn_logout.size() > 0;
    }
}
