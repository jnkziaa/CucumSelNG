package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;

    private By close_intro_page = By.xpath("//div[@class='sd-cmp-2jM6o']");

    private By txt_username = By.name("username");

    private By txt_password = By.name("password");

    private By btn_login = By.name("login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        if(!driver.getTitle().equals("Dindong")){
            throw new IllegalStateException("This is not Login Page. The Current Page is " + driver.getTitle().toString());
        }
    }

    public void closePromptPage(){
        driver.findElement(close_intro_page).click();
    }

    public void enterUsername(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void pressLogin() {
        driver.findElement(btn_login).click();
    }

    /*
    public void loginValidUser(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
    }*/
}
