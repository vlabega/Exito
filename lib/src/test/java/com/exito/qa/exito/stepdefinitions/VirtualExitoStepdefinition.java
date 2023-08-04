////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 11 - Crear la clase o refactorizar la calase stepdefinitions. 
// 12 - Adicionar Los stepdefinitions.
// 13 - Importar todos los Parametros. Verificar se encuentren los import de io.cucumber.java
// 14 - Comentar los Throw 
// 15 - Eliminar los Underline
// 17 - Inicializamos el Driver
// 18 - Agregamos el @Managed(driver = "chrome") y lo imporrtamos
// 19 - Importar ek Actor de SerenityBDD
// 20 - Instanciar nuestra Page Inicial
// 21 - BrowseTheWeb de Serenity
// 22 - Crear la primer User Interface
// 23 - Implementar los pasos y tareas del given Actor.wasAbleTo
// 24 - Importar la Task y el Userinterface
// 25 - Creamos el metodo AT en la Clase Task definida.
// 28 - Actualiza el Given con (String name, String webpage) throws Exception 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.exito.qa.exito.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.exito.qa.exito.tasks.OpenTheBrowser;
import com.exito.qa.exito.tasks.OpenTheProduct;
import com.exito.qa.exito.tasks.SelectTheProduct;
import com.exito.qa.exito.userinterfaces.ExitoHomePage;
import com.exito.qa.exito.userinterfaces.ExitoProduct;
import com.exito.qa.exito.utils.BrowserUtil;
import com.exito.qa.exito.utils.ConsoleMessageUtil;
import com.exito.qa.exito.utils.ScreenshotUtil;
import com.exito.qa.exito.utils.SleepUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
//import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;


@SuppressWarnings("unused")
public class VirtualExitoStepdefinition {
	
	
	    // Inicializamos el Driver
		//@Managed(driver = "chrome") // debe estar en la raiz del proyecto
		//private WebDriver hisBrowser;
		
		// Instancia el Actor en un nombre de Aator.
		private Actor vlady = Actor.named("Vlady");
	    //private Actor vlady;
	    
	    
		// Instancia // Instancio otro para abrir
		private ExitoHomePage exitoHomePage;
		private ExitoProduct exitoProduct;
		//private PageObject ExitoHomePage;
		
		// Variable para realizar un seguimiento del �ltimo escenario
	    private boolean isLastScenario = false;

		// Metodo para asociar el actor al driver, el actor puede navegar en la web con
		// el driver
		@Before
		public void setup() {
			
			
			vlady.can(BrowseTheWeb.with(BrowserUtil.getDriver()));
			//vlady.can(BrowseTheWeb.with(hisBrowser));
			
			
			ScreenshotUtil.init();
		}
	
		@After
		public void tearDown() {
		    if (isLastScenario) {
		        //hisBrowser.quit();
		    	// Cerrar el navegador utilizando el m�todo de BrowserUtil
	            BrowserUtil.tearDown();
		    }
		}
	

		@Given("that the User want select to categori in the application")
		public void that_the_user_want_select_to_categori_in_the_application() {
		  
			ConsoleMessageUtil.printMessage("ejecutarGiven");
			vlady.wasAbleTo(OpenTheBrowser.at(exitoHomePage));
			vlady.wasAbleTo(OpenTheProduct.at(exitoHomePage));
			
		}

		@When("User select five product")
		public void user_select_five_product() {
			vlady.attemptsTo(SelectTheProduct.at(exitoProduct));
			
		}

		@Then("User should see the products in the car")
		public void user_should_see_the_products_in_the_car() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
	
        
        
     // M�todo adicional para marcar el �ltimo escenario
        @After
        public void setLastScenarioFlag() {
            isLastScenario = true;
        }
	
}
