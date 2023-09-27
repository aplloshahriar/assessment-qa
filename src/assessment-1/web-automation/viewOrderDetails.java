import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class viewOrderDetails {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "../../../utility/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the order list page
        driver.get("http://example.com/order/list");

        // Assuming we want to view the details of the first order in the list
        WebElement firstOrder = driver.findElement(By.xpath("//table[@id='orderTable']//tr[1]"));
        firstOrder.click();

        // Wait for a while to see the result (you should use proper synchronization techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify that the order details are displayed correctly (you should implement proper verification)
        // Example verification:
        WebElement orderIdLabel = driver.findElement(By.xpath("//label[text()='Order ID']"));
        if (orderIdLabel.isDisplayed()) {
            System.out.println("Order details are displayed correctly");
        } else {
            System.out.println("Order details display failed");
        }

        // Close the browser
        driver.quit();
    }
}
