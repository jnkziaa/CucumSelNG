package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

    protected WebDriver driver;

    @FindBy(xpath = "//div[@class='sd-cmp-2jM6o']")
    private WebElement close_prompt;

    @FindBy(name="username")
    private WebElement txt_username;

    @FindBy(name="password")
    private WebElement txt_password;

    @FindBy(name="login")
    private WebElement btn_login;

    public LoginPage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void closePrompt(){
        close_prompt.click();
    }

    public void enterUsername(String username){
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }

    public void pressLogin(){
        btn_login.click();
    }
}
