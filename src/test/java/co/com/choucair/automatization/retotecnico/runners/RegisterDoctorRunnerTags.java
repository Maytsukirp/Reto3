package co.com.choucair.automatization.retotecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register_doctor.feature",
        tags = "@RegisterDoctor",
        glue = "co.com.choucair.automatization.retotecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RegisterDoctorRunnerTags {
}
