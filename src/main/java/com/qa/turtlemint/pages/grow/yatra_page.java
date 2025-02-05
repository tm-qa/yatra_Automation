package com.qa.turtlemint.pages.grow;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class yatra_page extends TestBase {
    String url;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement continuee;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//span[text()='Turtlemint']")
    WebElement TurtlemintTag;

    @FindBy(xpath = "//img[@src=\"https://secure.yatra.com/images/theme1/b2b/banners/1734352110_Webiste_banner_health_and_life_322x311.jpg\"]")
    WebElement image;

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions act = new Actions(driver);

    public yatra_page() {
        PageFactory.initElements(driver, this);
    }


    public void yatra_pge() throws IOException {


        WebCommands.staticSleep(5000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(5000);

        TestUtil.sendKeys(email, "salesdemo@tsi-yatra.com", "\"salesdemo@tsi-yatra.com\"  email entered");
        WebCommands.staticSleep(5000);
        TestUtil.click(continuee, "continue button clicked");
        WebCommands.staticSleep(5000);
        TestUtil.sendKeys(password, "b2bdemo@24", "\"b2bdemo@24\"  password entered");
        WebCommands.staticSleep(5000);
        TestUtil.click(continuee, "continue button clicked");
        WebCommands.staticSleep(5000);
        act.moveToElement(TurtlemintTag).build().perform();
        WebCommands.staticSleep(5000);
        String tag = TurtlemintTag.getText();
        Assert.assertEquals(tag, "Turtlemint");
        System.out.println(tag);
        WebCommands.staticSleep(5000);
        image.isDisplayed();
        String path = image.getAttribute("src");
        System.out.println(path + "  path of image");
        WebCommands.staticSleep(5000);
        Assert.assertEquals(path, "https://secure.yatra.com/images/theme1/b2b/banners/1734352110_Webiste_banner_health_and_life_322x311.jpg");
        WebCommands.staticSleep(5000);
        TestUtil.getFullPageScreenShot();

    }
}
