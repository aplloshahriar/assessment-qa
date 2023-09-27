import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class createUser {

    public static void main(String[] args) {
        // Set the path 
        System.setProperty("webdriver.chrome.driver", "../../../utility/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the user creation page
        driver.get("http://example.com/user/create");

        // Fill in user details
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement submitButton = driver.findElement(By.id("submit-button"));

        usernameField.sendKeys("testuser");
        passwordField.sendKeys("password123");
        emailField.sendKeys("testuser@example.com");

        // Submit the form
        submitButton.click();

      
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify the user is created successfully (you should implement proper verification)
        // Example verification:
        WebElement successMessage = driver.findElement(By.id("success-message"));
        if (successMessage.isDisplayed()) {
            System.out.println("User created successfully");
        } else {
            System.out.println("User creation failed");
        }

        // Close the browser
        driver.quit();
    }
}


