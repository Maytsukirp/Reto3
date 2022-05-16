package co.com.choucair.automatization.retotecnico.stepdefinitions;

import co.com.choucair.automatization.retotecnico.model.HerokappData;
import co.com.choucair.automatization.retotecnico.questions.AnswerInRegisterPatient;
import co.com.choucair.automatization.retotecnico.tasks.FillPatientsInformation;
import co.com.choucair.automatization.retotecnico.tasks.OpenTheHerokapp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterPatientStepDefinition {

    @Before
    public void setState(){
        setTheStage(new OnlineCast());
    }

    @Given("^Carlos needs to register a new patient$")
    public void carlosNeedsToRegisterANewPatient() {
        theActorCalled("Carlos").wasAbleTo(OpenTheHerokapp.inThePatientInterface());

    }

    @When("^He registers the new patient in the Hospital Administration application$")
    public void heRegistersTheNewPatientInTheHospitalAdministrationApplication(List<HerokappData> data) {
        theActorInTheSpotlight().attemptsTo(FillPatientsInformation.onAddPatient(data));

    }

    @Then("^He verifies on the screen that the data has been saved correctly$")
    public void heVerifiesOnTheScreenThatTheDataHasBeenSavedCorrectly(List<HerokappData> data) {
        theActorInTheSpotlight().should(seeThat(AnswerInRegisterPatient.withTextSave(data.get(0).getStrSaveInformationPatient())));

    }

}
