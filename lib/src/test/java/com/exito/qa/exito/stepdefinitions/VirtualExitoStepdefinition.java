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

import com.exito.qa.exito.userinterfaces.ExitoHomePage;
import com.exito.qa.exito.utils.BrowserUtil;
import com.exito.qa.exito.utils.ScreenshotUtil;

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
	


	
        
        
     // M�todo adicional para marcar el �ltimo escenario
        @After
        public void setLastScenarioFlag() {
            isLastScenario = true;
        }
	
}
