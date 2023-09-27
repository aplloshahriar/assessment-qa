import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class viewUser {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "../../../utility/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the user list page
        driver.get("http://example.com/user/list");

        // Assuming we want to view the details of the first user in the list
        WebElement firstUser = driver.findElement(By.xpath("//table[@id='userTable']//tr[1]"));
        firstUser.click();

        // Wait for a while to see the result (you should use proper synchronization techniques)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify that the user details are displayed correctly (you should implement proper verification)
        // Example verification:
        WebElement usernameLabel = driver.findElement(By.xpath("//label[text()='Username']"));
        if (usernameLabel.isDisplayed()) {
            System.out.println("User details are displayed correctly");
        } else {
            System.out.println("User details display failed");
        }

        // Close the browser
        driver.quit();
    }
}

