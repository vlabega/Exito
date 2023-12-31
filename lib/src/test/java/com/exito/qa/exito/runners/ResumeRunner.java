package com.exito.qa.exito.runners;

import org.junit.runner.RunWith;

import io.cucumber.core.cli.Main;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //features = "src/test/resources/features/BuscarEmpleo.feature", 
        //glue = "co.com.computrabajo.qa.computrabajo.stepdefinitions",
        //tags = ("@LoginComputrabajo or @MiAreaComputrabajo or @BuscarEmpleo"),
        //tags = "@wip",
		//snippets = CucumberOptions.SnippetType.CAMELCASE
		
		features = "src/test/resources/features",
        glue = "com.exito.qa.exito.stepdefinitions",
        tags = "@VirtualExito",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        monochrome = true,
        plugin = {
            "usage:target/cucumber-reports/cucumber-usage.json",
            "json:target/cucumber-reports/cucumber.json"
        }

        
)
public class ResumeRunner {
    public static void main(String[] args) {
        ///byte exitStatus = Main.run(args, Thread.currentThread().getContextClassLoader());
        //System.exit(exitStatus);
    	Main.run(args, Thread.currentThread().getContextClassLoader());
    }
}