import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateUserDetails {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "../../../utility/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the user list page
        driver.get("http://example.com/user/list");

        // Assuming we want to update the details of the first user in the list
        WebElement firstUser = driver.findElement(By.xpath("//table[@id='userTable']//tr[1]"));
        firstUser.click();

        // Wait for a while to see the result (you should use proper synchronization techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click "Edit" to update user details
        WebElement editButton = driver.findElement(By.id("editButton"));
        editButton.click();

        // Modify user details
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement emailField = driver.findElement(By.id("email"));

        // Clear existing values and update with new ones
        usernameField.clear();
        usernameField.sendKeys("updatedUsername");

        emailField.clear();
        emailField.sendKeys("updated@example.com");

        // Click "Save" to save the changes
        WebElement saveButton = driver.findElement(By.id("saveButton"));
        saveButton.click();

        // Wait for a while to see the result (you should use proper synchronization techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify the user details are updated successfully (you should implement proper verification)
        // Example verification:
        WebElement successMessage = driver.findElement(By.id("success-message"));
        if (successMessage.isDisplayed()) {
            System.out.println("User details updated successfully");
        } else {
            System.out.println("User details update failed");
        }

        // Close the browser
        driver.quit();
    }
}
