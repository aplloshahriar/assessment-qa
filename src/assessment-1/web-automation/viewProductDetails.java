import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class viewProductDetails {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "../../../utility/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the product list page
        driver.get("http://example.com/product/list");

        // Assuming we want to view the details of the first product in the list
        WebElement firstProduct = driver.findElement(By.xpath("//table[@id='productTable']//tr[1]"));
        firstProduct.click();

        // Wait for a while to see the result (you should use proper synchronization techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify that the product details are displayed correctly (you should implement proper verification)
        // Example verification:
        WebElement productNameLabel = driver.findElement(By.xpath("//label[text()='Product Name']"));
        if (productNameLabel.isDisplayed()) {
            System.out.println("Product details are displayed correctly");
        } else {
            System.out.println("Product details display failed");
        }

        // Close the browser
        driver.quit();
    }
}

