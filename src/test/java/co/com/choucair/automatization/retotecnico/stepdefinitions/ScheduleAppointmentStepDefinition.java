package co.com.choucair.automatization.retotecnico.stepdefinitions;

import co.com.choucair.automatization.retotecnico.model.HerokappData;
import co.com.choucair.automatization.retotecnico.questions.AnswerInScheduleAppointment;
import co.com.choucair.automatization.retotecnico.tasks.FillSheduleAppointment;
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

public class ScheduleAppointmentStepDefinition {

    @Before
    public void setState(){
        setTheStage(new OnlineCast());
    }

    @Given("^Carlos needs to see a doctor$")
    public void carlosNeedsToSeeADoctor() {
        theActorCalled("Carlos").wasAbleTo(OpenTheHerokapp.inTheScheduleInterface());

    }

    @When("^He schedules an Appointment in the Hospital Administration application$")
    public void heSchedulesAnAppointmentInTheHospitalAdministrationApplication(List<HerokappData> data) {
        theActorInTheSpotlight().attemptsTo(FillSheduleAppointment.inScheduleAppointment(data));

    }

    @Then("^He verifies on the screen that the data has been saved$")
    public void heVerifiesOnTheScreenThatTheDataHasBeenSaved(List<HerokappData> data) {
        theActorInTheSpotlight().should(seeThat(AnswerInScheduleAppointment.withTextSave(data.get(0).getStrSaveInformationSchedule())));

    }

}
