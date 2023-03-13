package hellocucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PublicPortalStepDefinitions {

//    static WebDriver driver = new FirefoxDriver();
    static WebDriver driver = new ChromeDriver();


    @Given("I launch the chrome browser")
    public void i_launch_chrome_browser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver.get("https://www.google.co.uk/");

    }
    @Given("I open subsidy home page")
    public void i_open_subsidy_home_page() {

    }
    @Given("I click the 'new search' button")
    public void i_click_the_new_search_button() {


    }
    @Given("close browser")
    public void close_browser() {
//        driver.close();
    }



}
