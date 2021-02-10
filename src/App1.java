import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App1 {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:/Selenium_2021/SeleniumTextSonia/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("E:/Selenium_2021/SeleniumTextSonia/pagina_web/formulario.html");

        Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.id("email"));

        Thread.sleep(2000);
        searchBox.sendKeys("correo@correo.es");

        searchBox.sendKeys(Keys.TAB);

        Thread.sleep(2000);

        /* COMBO BOX SIMPLE */
        Select comboboxSimple = new Select(driver.findElement(By.id("combobox1")));
        comboboxSimple.selectByIndex(2);

        Thread.sleep(2000);
        /* COMBO BOX MULTIPLE */
        Select comboboxMultiple = new Select(driver.findElement(By.id("combobox2")));
        comboboxMultiple.selectByIndex(0);
        comboboxMultiple.selectByValue("lugo");
        comboboxMultiple.selectByVisibleText("Ourense");

        Thread.sleep(2000);

        comboboxMultiple.deselectByIndex(3);
        /* CALENDARIO */

        WebElement calendario = driver.findElement(By.name("fecha"));
        calendario.sendKeys("14021990");
        calendario.sendKeys(Keys.TAB);

        calendario.sendKeys("1530");
        Thread.sleep(5000);
        driver.quit();

    }
}