/*package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OurStoryLoginSteps {
    private static WebDriver driver;


    @Given("Open browser and maximize the size")
    public void open_browser_and_maximize_the_size() {
        System.getProperty("webdriver.chrome.driver", "C:\\Chrome107\\chromedriver_win32\\folder with space\\chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ourstory.4umer.com");
    }

    @When("^Find the login input and input (.*) and (.*)$")
    public void findTheLoginInputAndInputUsernameAndPassword(String username, String password) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='sd-cmp-2jM6o']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("Press login button and wait for a couple of seconds to check homepage")
    public void press_login_button_and_wait_for_a_couple_of_seconds_to_check_homepage() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
    }
    @Then("Quit the browser because test is done")
    public void quit_the_browser_because_test_is_done() {
        Assertions.assertTrue(driver.findElements(By.id("logout")).size() > 0);
        driver.quit();
    }



}
*/