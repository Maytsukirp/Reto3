package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.HerokappData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;



import java.util.List;

import static co.com.choucair.automatization.retotecnico.userinterface.FillScheduleAppointmentPage.*;

public class FillSheduleAppointment implements Task {
    private List<HerokappData> data;

    public FillSheduleAppointment(List<HerokappData> data) {

        this.data = data;
    }

    public static FillSheduleAppointment inScheduleAppointment(List<HerokappData> data) {
        return Tasks.instrumented(FillSheduleAppointment.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(FIELD_DATE),
                Enter.theValue(data.get(0).getStrDate()).into(FIELD_DATE),
                Hit.the(Keys.ENTER).into(FIELD_DATE),
                Click.on(FIELD_ID_DOCUMENT_PATIENT),
                Enter.theValue(data.get(0).getStrIdDocumentPatient()).into(FIELD_ID_DOCUMENT_PATIENT),
                Click.on(FIELD_ID_DOCUMENT_DOCTOR),
                Enter.theValue(data.get(0).getStrIdDocumentDoctor()).into(FIELD_ID_DOCUMENT_DOCTOR),
                Click.on(FIELD_OBSERVATIONS),
                Enter.theValue(data.get(0).getStrObservations()).into(FIELD_OBSERVATIONS),
                Click.on(BUTTON_SAVE)

        );
        try {Thread.sleep(3000);} catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
