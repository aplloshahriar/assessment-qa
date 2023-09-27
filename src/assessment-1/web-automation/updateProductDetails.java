import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateProductDetails {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "../../../utility/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the product list page
        driver.get("http://example.com/product/list");

        // Assuming we want to update the details of the first product in the list
        WebElement firstProduct = driver.findElement(By.xpath("//table[@id='productTable']//tr[1]"));
        firstProduct.click();

        // Wait for a while to see the result (you should use proper synchronization techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click "Edit" to update product details
        WebElement editButton = driver.findElement(By.id("editButton"));
        editButton.click();

        // Modify product details
        WebElement productNameField = driver.findElement(By.id("productName"));
        WebElement priceField = driver.findElement(By.id("price"));

        // Clear existing values and update with new ones
        productNameField.clear();
        productNameField.sendKeys("Updated Product Name");

        priceField.clear();
        priceField.sendKeys("60.00");

        // Click "Save" to save the changes
        WebElement saveButton = driver.findElement(By.id("saveButton"));
        saveButton.click();

        // Wait for a while to see the result (you should use proper synchronization techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify the product details are updated successfully (you should implement proper verification)
        // Example verification:
        WebElement successMessage = driver.findElement(By.id("success-message"));
        if (successMessage.isDisplayed()) {
            System.out.println("Product details updated successfully");
        } else {
            System.out.println("Product details update failed");
        }

        // Close the browser
        driver.quit();
    }
}
