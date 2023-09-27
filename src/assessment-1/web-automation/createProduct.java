import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class createProduct {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "../../../utility/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the product creation page
        driver.get("http://example.com/product/create");

        // Fill in product details
        WebElement productNameField = driver.findElement(By.id("productName"));
        WebElement priceField = driver.findElement(By.id("price"));
        WebElement descriptionField = driver.findElement(By.id("description"));
        WebElement submitButton = driver.findElement(By.id("submit-button"));

        productNameField.sendKeys("New Product");
        priceField.sendKeys("50.00");
        descriptionField.sendKeys("This is a new product for testing purposes.");

        // Submit the form
        submitButton.click();

        // Wait for a while to see the result (you should use proper synchronization techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify the product is created successfully (you should implement proper verification)
        // Example verification:
        WebElement successMessage = driver.findElement(By.id("success-message"));
        if (successMessage.isDisplayed()) {
            System.out.println("Product created successfully");
        } else {
            System.out.println("Product creation failed");
        }

        // Close the browser
        driver.quit();
    }
}
