package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.HerokappData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.automatization.retotecnico.userinterface.FillPatientsInformationPage.*;
import static net.serenitybdd.screenplay.actions.SelectFromOptions.byVisibleText;

public class FillPatientsInformation implements Task {
    private List<HerokappData> data;

    public FillPatientsInformation(List<HerokappData> data) {

        this.data = data;
    }

    public static FillPatientsInformation onAddPatient(List<HerokappData> data) {
        return Tasks.instrumented(FillPatientsInformation.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FIELD_FULL_NAME),
                Enter.theValue(data.get(0).getStrFullNamePatient()).into(FIELD_FULL_NAME),
                Click.on(FIELD_LAST_NAME),
                Enter.theValue(data.get(0).getStrLastNamePatient()).into(FIELD_LAST_NAME),
                Click.on(FIELD_TELEPHONE_NUMBER),
                Enter.theValue(data.get(0).getStrTelephoneNumberPatient()).into(FIELD_TELEPHONE_NUMBER),
                byVisibleText(data.get(0).getStrTypeIdDocumentPatient()).from((TYPE_ID_DOCUMENT)),
                Click.on(FIELD_ID_DOCUMENT),
                Enter.theValue(data.get(0).getStrLastNamePatient()).into(FIELD_ID_DOCUMENT),
                Click.on(PREPAID_HEALTH),
                Click.on(BUTTON_SAVE)

        );
        try {Thread.sleep(3000);} catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
