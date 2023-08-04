package com.exito.qa.exito.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.exito.qa.exito.userinterfaces.ExitoHomePage;
import com.exito.qa.exito.utils.SleepUtil;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenTheProduct implements Task {

	@SuppressWarnings("unused")
	private PageObject page;

	public OpenTheProduct(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Selecciona opcion Panel de categorias");
		actor.attemptsTo(Click.on(ExitoHomePage.EXITO_ICONPANEL));
		SleepUtil.sleepSeconds(2);
		System.out.println("Selecciona opcion tecnologia");
		actor.attemptsTo(Click.on(ExitoHomePage.EXITO_LISTPANELTECNOLOGIA));
		///SleepUtil.sleepSeconds(2);
		//actor.attemptsTo(Click.on(ExitoHomePage.EXITO_LISTPANELTECNOLOGIATODO));
		SleepUtil.sleepSeconds(2);
		System.out.println("Selecciona opcion TVs");
		actor.attemptsTo(Click.on(ExitoHomePage.EXITO_TVS));
		SleepUtil.sleepSeconds(2);
	}

	public static OpenTheProduct at(PageObject page) {
		return instrumented(OpenTheProduct.class, page);
	}

}
