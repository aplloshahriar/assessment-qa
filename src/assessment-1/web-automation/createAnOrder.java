import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class createAnOrder {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "../../../utility/chromedriver.exe");
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the order creation page
        driver.get("http://example.com/order/create");

        // Fill in order details
        WebElement productField = driver.findElement(By.id("product"));
        WebElement quantityField = driver.findElement(By.id("quantity"));
        WebElement submitButton = driver.findElement(By.id("submit-button"));

        productField.sendKeys("Product X");
        quantityField.sendKeys("3");

        // Submit the form
        submitButton.click();

        // Wait for a while to see the result (you should use proper synchronization techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify the order is created successfully (you should implement proper verification)
        // Example verification:
        WebElement successMessage = driver.findElement(By.id("success-message"));
        if (successMessage.isDisplayed()) {
            System.out.println("Order created successfully");
        } else {
            System.out.println("Order creation failed");
        }

        // Close the browser
        driver.quit();
    }
}
