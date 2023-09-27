import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteProduct{

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "../../../utility/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the product list page
        driver.get("http://example.com/product/list");

        // Assuming we want to delete the first product in the list
        WebElement firstProduct = driver.findElement(By.xpath("//table[@id='productTable']//tr[1]"));
        firstProduct.click();

        // Wait for a while to see the result (you should use proper synchronization techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click "Delete" to initiate product deletion
        WebElement deleteButton = driver.findElement(By.id("deleteButton"));
        deleteButton.click();

        // Wait for a while to see the result (you should use proper synchronization techniques)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Confirm the deletion (assuming a confirmation dialog appears)
        WebElement confirmButton = driver.findElement(By.id("confirmDeleteButton"));
        confirmButton.click();

        // Wait for a while to see the result (you should use proper synchronization techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify the product is deleted successfully (you should implement proper verification)
        // Example verification:
        WebElement successMessage = driver.findElement(By.id("success-message"));
        if (successMessage.isDisplayed()) {
            System.out.println("Product deleted successfully");
        } else {
            System.out.println("Product deletion failed");
        }

        // Close the browser
        driver.quit();
    }
}
