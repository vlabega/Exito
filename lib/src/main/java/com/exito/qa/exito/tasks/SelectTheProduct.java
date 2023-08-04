package com.exito.qa.exito.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.exito.qa.exito.userinterfaces.ExitoProduct;
import com.exito.qa.exito.utils.BrowserUtil;
import com.exito.qa.exito.utils.SleepUtil;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectTheProduct implements Task {

	@SuppressWarnings("unused")
	private PageObject page;

	public SelectTheProduct(PageObject page) {
		this.page = page;
	}

	public <T extends Actor> void performAs(T actor) {
	    // Obtén el WebDriver instanciado desde BrowserUtil
	    WebDriver driver = BrowserUtil.getDriver();

	    // Localizar el elemento que representa la galería
	    //WebElement galeria = ExitoProduct.Exito_GALLERY2.resolveFor(actor);

	    // Capturar todos los elementos dentro del WebElement
	    List<WebElement> elementosDeLaGaleria = driver.findElement(ExitoProduct.Exito_GALLERY2);

	    // Imprimir la cantidad de elementos capturados
	    System.out.println("Cantidad de elementos capturados: " + elementosDeLaGaleria.size());

	    // Obtener una lista de índices aleatorios para seleccionar 5 elementos aleatorios
	    List<Integer> indicesAleatorios = obtenerIndicesAleatorios(elementosDeLaGaleria.size(), 5);

	    // Seleccionar los 5 elementos aleatorios
	    for (int indice : indicesAleatorios) {
	        WebElement elementoSeleccionado = elementosDeLaGaleria.get(indice);
	        actor.attemptsTo(Click.on(elementoSeleccionado));
	        SleepUtil.sleepSeconds(2);
	    }
	}

	private List<Integer> obtenerIndicesAleatorios(int maximo, int cantidad) {
	    Random rand = new Random();
	    List<Integer> indicesAleatorios = new ArrayList<>();
	    
	    // Si el número de elementos en la galería es menor o igual a la cantidad requerida, seleccionar todos los elementos
	    if (maximo <= cantidad) {
	        for (int i = 0; i < maximo; i++) {
	            indicesAleatorios.add(i);
	        }
	    } else {
	        while (indicesAleatorios.size() < cantidad) {
	            int indiceAleatorio = rand.nextInt(maximo);
	            if (!indicesAleatorios.contains(indiceAleatorio)) {
	                indicesAleatorios.add(indiceAleatorio);
	            }
	        }
	    }
	}   

	public static SelectTheProduct at(PageObject page) {
		return instrumented(SelectTheProduct.class, page);
	}

}
