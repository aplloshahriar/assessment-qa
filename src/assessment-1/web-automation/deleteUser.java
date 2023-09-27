import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteUser {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "../../../utility/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the user list page
        driver.get("http://example.com/user/list");

        // Assuming we want to delete the first user in the list
        WebElement firstUser = driver.findElement(By.xpath("//table[@id='userTable']//tr[1]"));
        firstUser.click();

        // Wait for a while to see the result (you should use proper synchronization
        // techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click "Delete" to initiate user deletion
        WebElement deleteButton = driver.findElement(By.id("deleteButton"));
        deleteButton.click();

        // Wait for a while to see the result (you should use proper synchronization
        // techniques)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Confirm the deletion (assuming a confirmation dialog appears)
        WebElement confirmButton = driver.findElement(By.id("confirmDeleteButton"));
        confirmButton.click();

        // Wait for a while to see the result (you should use proper synchronization
        // techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify the user is deleted successfully (you should implement proper
        // verification)
        // Example verification:
        WebElement successMessage = driver.findElement(By.id("success-message"));
        if (successMessage.isDisplayed()) {
            System.out.println("User deleted successfully");
        } else {
            System.out.println("User deletion failed");
        }

        // Close the browser
        driver.quit();
    }
}
