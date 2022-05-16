package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.userinterface.OpenTheHerokappPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.choucair.automatization.retotecnico.userinterface.OpenTheHerokappPage.*;

public class OpenTheHerokapp implements Task {

    private static int method;
    private OpenTheHerokappPage openTheHerokappPage;


    public static OpenTheHerokapp inTheDoctorInterface() {
        method = 1;

        return Tasks.instrumented(OpenTheHerokapp.class);
    }

    public static OpenTheHerokapp inThePatientInterface() {
        method = 2;
        return Tasks.instrumented(OpenTheHerokapp.class);
    }

    public static OpenTheHerokapp inTheScheduleInterface() {
        method = 3;
        return Tasks.instrumented(OpenTheHerokapp.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(openTheHerokappPage));

        if (method == 1) {
            actor.attemptsTo(Click.on(BOTTON_ADD_DOCTOR));
        }else  if (method == 2) {
            actor.attemptsTo(Click.on(BOTTON_ADD_PATIENT));
        }else{
            actor.attemptsTo(Click.on(BOTTON_SCHEDULE_APPOINTMENT));
        }
        }
    }

