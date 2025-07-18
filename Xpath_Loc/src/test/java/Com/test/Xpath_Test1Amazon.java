package Com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Test1Amazon {
static WebDriver driver;
@BeforeTest()
void setUp() {
	driver=new ChromeDriver();
	WebDriverManager.chromedriver().setup();
}
@Test
void launchURL() throws InterruptedException {
	//driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_8m0512m97v_e&adgrpid=1317216540160148&hvadid=82326299627209&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=143911&hvtargid=kwd-82326918609608:loc-90&hydadcr=5623_2377284&mcid=f13fcffd1964377ea436bb8da9e6f147");
   // driver.get("https://www.amazon.in/");
driver.get("https://www.flipkart.com/elec-b2b-store?fm=neo%2Fmerchandising&iid=M_d5e6ef95-4abe-43c3-a7e5-25a8f1904d52_1_372UD5BXDFYS_MC.1B9DW42USMK1&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Electronics~Electronics%2BGST%2BStore_1B9DW42USMK1&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L1_view-all&cid=1B9DW42USMK1");
	driver.manage().window().maximize();
	WebElement l=driver.findElement(By.xpath("//input[@class=\"zDPmFV\"]"));
	l.clear();
	l.sendKeys("iPhone");
	l.click();
	List<WebElement> l2=driver.findElements(By.xpath("//div[@class='x6GwIv _2Ipp17']"));
	for(WebElement list:l2) {
		Thread.sleep(5000);
		System.out.println(list.getText());
	}
	//driver.findElement(By.xpath("//button[@class=\"MJG8Up\"]")).click();
}
/*
@Test
void firstTest() throws InterruptedException {
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']")));
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    // WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
    //         By.id("twotabsearchtextbox")
    // ));
    // searchBox.sendKeys("iPhone");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));

    // Type 'iPhone' and search
    searchBox.sendKeys("iPhone");
    driver.findElement(By.id("nav-search-submit-button")).click();

    // Wait until results are loaded
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.s-main-slot")));

    // Get product elements
    List<WebElement> products = driver.findElements(By.cssSelector("div.s-main-slot > div[data-component-type='s-search-result']"));

    int count = 0;
    for (WebElement product : products) {
        try {
            String name = product.findElement(By.cssSelector("h2 span")).getText();
            String priceWhole = product.findElement(By.cssSelector(".a-price-whole")).getText();
            String priceFraction = product.findElement(By.cssSelector(".a-price-fraction")).getText();

            System.out.println("Product: " + name);
            System.out.println("Price: ₹" + priceWhole + "." + priceFraction);
            System.out.println("---------------");

            if (++count >= 5) break; // Limit to 5 results
        } catch (Exception e) {
            // Skip products without price or name
        }
   
    
}

}*/
@AfterTest()
	void closeDriver() {
	driver.close();
}
}
