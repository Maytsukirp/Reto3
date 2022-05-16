package co.com.choucair.automatization.retotecnico.stepdefinitions;

import co.com.choucair.automatization.retotecnico.model.HerokappData;
import co.com.choucair.automatization.retotecnico.questions.AnswerInRegisterDoctor;
import co.com.choucair.automatization.retotecnico.tasks.FillDoctorsInformation;
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

public class RegisterDoctorStepDefinition {

    @Before
    public void setState(){
        setTheStage(new OnlineCast());
    }


    @Given("^Carlos needs to register a new doctor$")
    public void carlosNeedsToRegisterANewDoctor() {
        theActorCalled("Carlos").wasAbleTo(OpenTheHerokapp.inTheDoctorInterface());

    }


    @When("^He registers the new doctor in the Hospital Administration application$")
    public void heRegistersTheNewDoctorInTheHospitalAdministrationApplication(List<HerokappData> data) {
        theActorInTheSpotlight().attemptsTo(FillDoctorsInformation.onAddDoctor(data));

    }

    @Then("^He verifies that the message data saved correctly is displayed on the screen$")
    public void heVerifiesThatTheMessageDataSavedCorrectlyIsDisplayedOnTheScreen(List<HerokappData> data) {
        theActorInTheSpotlight().should(seeThat(AnswerInRegisterDoctor.withTextSave(data.get(0).getStrSaveInformationDoctor())));

    }

}
