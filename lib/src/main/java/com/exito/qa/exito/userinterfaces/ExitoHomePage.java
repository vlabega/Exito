////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 26 - Agregar @DefaultUrl("https://www.computrabajo.com/")
// 27 - instanciar la clase tipo extends PageObject
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.exito.qa.exito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.exito.com/")
//@DefaultUrl(DefaultURLUtil.getDefaultUrl())
//@DefaultUrl(ConfigUtil.getDefaultUrl())
public class ExitoHomePage extends PageObject{

	// Mapear los objetos.
	public static final Target EXITO_ICONPANEL = Target.the("Exito icon Panel").located(By.id("category-menu"));
	public static final Target EXITO_LISTPANELTECNOLOGIA = Target.the("List Link Panel Tecnologia").located(By.id("undefined-nivel2-Tecnología"));
	public static final Target EXITO_LISTPANELTECNOLOGIATODO = Target.the("List Link Panel Tecnologia todo").located(By.id("Categorías-nivel1-Tecnología-button"));
	public static final Target EXITO_TVS = Target.the("List Link Panel Tecnologia TVs").located(By.id("Categorías-nivel2-Televisores"));	
	
	
	//*[@id="gallery-layout-container"]/div[17]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button/div
	//*[@id="gallery-layout-container"]/div[1]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button/div
	public static final Target COMPUTRABAJO_AGREGAR = Target.the("computrabajo AGREGA").located(By.linkText("Agregar"));
	
}
