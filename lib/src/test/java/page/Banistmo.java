package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import util.page_base;

public class Banistmo extends page_base {
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alang\\Documents\\eclipse\\Inetum\\lib\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void openBanitsmoURL() {
		driver.get("https://www.banistmo.com/wps/portal/banistmo/empresas/");
	}
	
	public void seleccionarProductoYServicio() {
		WebElement btnProductos = driver.findElement(By.xpath("//div[@id='navbar-collapse-grid']//ul[@class='nav navbar-nav']//li//a[@class='dropdown-toggle']"));
		btnProductos.click();
	}
	
	public void SeleccionarDepositos() {
		WebElement btnDepositos = driver.findElement(By.xpath("//div[@class='col-sm-12 submenu']//ul[1]//li[1]"));
		btnDepositos.click();
	}
	
	public void SeMuestraDepositos() {
		if(driver.findElement(By.xpath("//h1")).isDisplayed()) {
			System.out.println("El elemento esta en pantalla");
		}else {
			System.out.println("El elemento no esta en pantalla");
		}
		
	}
	
	public void SeleccionarCuentaAhorro() {
		WebElement btnCuentaAhorro = driver.findElement(By.xpath("//div[@class='col-md-4'][2]//div[@class='col-xs-12 contenido']//h2"));
		btnCuentaAhorro.click();
	}
	
	public void MuestraPaginaAhorro() {
		if(driver.findElement(By.xpath("//h1")).isDisplayed()) {
			System.out.println("El elemento esta en pantalla");
		}else {
			System.out.println("El elemento no esta en pantalla");
		}
	}
	
	public void SeleccionaDocumentos(){
		WebElement btnDocumnetos = driver.findElement(By.xpath("//ul[@id='filialTabs']//li[5]"));
		btnDocumnetos.click();
	}
	
	public void DescargaDocumentos() {
		WebElement btnDescarga = driver.findElement(By.xpath("//table[@class='table'][1]//tr//td[2]"));
		btnDescarga.click();
	}
	
	public void ValidaDocumentos(){
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
