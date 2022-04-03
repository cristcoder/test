package com.tdea.parcial.gluecode;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

    private WebDriver driver;

    void setUp() {

        System.setProperty("webdriver.edge.driver", "./src/test/resources/edge/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();

    }

    @Given("checkboxes test")
    public void checkbox_given() {
        setUp();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @When("checkboxes click")
    public void chechbox_when() {
        WebElement check1 = driver.findElements(By.tagName("input")).get(0);
        WebElement check2 = driver.findElements(By.tagName("input")).get(1);
        check1.click();
        check2.click();

    }

    @Then("checkboxes validate")
    public void checkbox_then() {
        WebElement check1 = driver.findElements(By.tagName("input")).get(0);
        WebElement check2 = driver.findElements(By.tagName("input")).get(1);
        assertTrue(check1.isSelected());
        assertFalse(check2.isSelected());
    }

    @Given("notification messages test")
    public void notification_given() {
        setUp();
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
    }

    @When("click here is clicked")
    public void notification_when() {
        WebElement link = driver.findElements(By.tagName("a")).get(1);
        link.click();

    }

    @Then("search notification message")
    public void notification_then() {
        WebElement message = driver.findElement(By.id("flash"));
        assertEquals("flash notice", message.getAttribute("class"));
        driver.quit();
    }

    @After
    public void end(){
        driver.quit();
    }

}
