import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        /* BUSQUEDA TEXTO */
        driver.get("https://www.todostuslibros.com/buscador_avanzado"); // la

        Thread.sleep(2000); // Para ver la ejecuci�n, detenemos el hilo 2 segundos

        WebElement searchBox = driver.findElement(By.id("main-search-input"));
        WebElement searchButton = driver.findElement(By.id("inputGroup-sizing-lg"));

        Thread.sleep(2000);
        searchBox.sendKeys("El nombre de la Rosa");
        Thread.sleep(2000);
        searchButton.click();
        Thread.sleep(2000);

        String titulo = driver.getTitle();
        System.out.println(titulo); // Visualizamos el título de la página

        /* Dónde encontrarlo */

        driver.findElement(By.linkText("Dónde encontrarlo")).click();

        Thread.sleep(2000);
        titulo = driver.getTitle();
        System.out.println(titulo);

        Thread.sleep(5000);
        driver.quit();

    }
}
