////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 26 - Agregar @DefaultUrl("https://www.computrabajo.com/")
// 27 - instanciar la clase tipo extends PageObject
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.exito.qa.exito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ExitoProduct extends PageObject{

	// Mapear los objetos.
	//*[@id="gallery-layout-container"]/div[17]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button/div
	//*[@id="gallery-layout-container"]/div[1]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button/div
	public static final Target Exito_AGREGAR = Target.the("Exito AGREGAR").located(By.linkText("Agregar"));
	public static final Target Exito_GALLERY = Target.the("Exito GALLERY").located(By.id("gallery-layout-container"));
	
	public static final Target Exito_GALLERY2 = Target.the("Exito GALLERY").located(By.cssSelector("#gallery-layout-container"));
	
	
	public static final Target Exito_AGREGAR2 = Target.the("Exito INGRESAR").locatedByFirstMatching("/html/body/div[2]/div/div[1]/div/div[3]/div/div[10]/section/div[2]/div/div[3]/div/div[2]/div/div/div[5]/div/div/div/div[2]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button/div/div/span\r\n"
			+ "");
	public static final Target Exito_AGREGAR3 = Target.the("Exito INGRESAR").locatedByFirstMatching("/html/body/div[2]/div/div[1]/div/div[3]/div/div[10]/section/div[2]/div/div[3]/div/div[2]/div/div/div[5]/div/div/div/div[3]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button/div/div/span\r\n"
			+ "");
	

	
	
	
	//*[@id="gallery-layout-container"]/div[1]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button/div/div/span
	//*[@id="gallery-layout-container"]/div[2]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button/div/div/span
	}
