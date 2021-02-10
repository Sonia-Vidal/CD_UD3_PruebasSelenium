import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCases {

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium_2021/SeleniumTextSonia/driver/chromedriver.exe");

		driver = new ChromeDriver();

	}

	@Test
	public void realizarBusquedaLibro(Object tituloHomeEsperado) throws InterruptedException {

		driver.get("https://www.todostuslibros.com/buscador_avanzado"); // Abrimos la página

		WebElement titulo = driver.findElement(By.id("titulo"));
		WebElement searchButton = driver.findElement(By.id("inputGroup-sizing-lg"));

		Thread.sleep(2000);

		searchButton.sendKeys("El nombre de la Rosa"); // Escribimos el texto a buscar en la caja de texto
		Thread.sleep(2000);
		searchButton.click();
		Thread.sleep(2000);

		String tituloSeleniumEsperado = "El nombre de la Rosa";

		searchButton.click();// Ejecutamos la accion de click para que realice la búsqueda
		driver.findElement(By.linkText("Dónde encontrarlo")).click();

		String titulo = driver.getTitle();// Obtenemos el titulo de la pagina abierta

		assertEquals(tituloHomeEsperado, titulo);// Comprobamos el titulo obtenido con el esperado

	}

	@After
	public void shutdown() {
		driver.quit();
	}
}
