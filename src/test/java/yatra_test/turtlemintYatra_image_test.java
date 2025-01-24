package yatra_test;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.grow.yatra_page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"yatra"})
public class turtlemintYatra_image_test extends TestBase {
    yatra_page y;

    @BeforeMethod()
    public void start()  {
        initialization();
         y = new yatra_page();


    }

    @Test//(retryAnalyzer = RetryAnalyser.class)
    public void yatraImagesVerify() {
        y.yatra_pge();
    }

    @AfterMethod
    public void Close() {
      //  driver.quit();
    }

}
