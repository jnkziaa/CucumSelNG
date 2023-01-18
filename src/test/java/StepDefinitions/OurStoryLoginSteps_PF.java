package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;
import pages.LoginPage;

public class OurStoryLoginSteps_PF {
    protected WebDriver driver;
    LoginPage_PF loginPage_pf;
    HomePage_PF homePage_pf;


    @Given("Open browser and maximize the size")
    public void open_browser_and_maximize_the_size() {
        System.out.println("IM IN PF BRO");
        System.getProperty("webdriver.chrome.driver", "C:\\Chrome107\\chromedriver_win32\\folder with space\\chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ourstory.4umer.com");
    }

    @When("^Find the login input and input (.*) and (.*)$")
    public void findTheLoginInputAndInputUsernameAndPassword(String username, String password) throws InterruptedException {
        System.out.println("well it got here");
        loginPage_pf = new LoginPage_PF(driver);



        Thread.sleep(1000);
        loginPage_pf.closePrompt();
        Thread.sleep(1000);
        loginPage_pf.enterUsername(username);
        Thread.sleep(1000);
        loginPage_pf.enterPassword(password);
    }

    @When("Press login button and wait for a couple of seconds to check homepage")
    public void press_login_button_and_wait_for_a_couple_of_seconds_to_check_homepage() throws InterruptedException {
        Thread.sleep(1000);
        loginPage_pf.pressLogin();
    }
    @Then("Quit the browser because test is done")
    public void quit_the_browser_because_test_is_done() {
        homePage_pf = new HomePage_PF(driver);
        try {
            System.out.println(homePage_pf.isLogoutAvailable());
            Assertions.assertTrue(homePage_pf.isLogoutAvailable());
        }finally {
            driver.quit();
        }
    }



}
