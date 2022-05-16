package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")

public class OpenTheHerokappPage extends PageObject {

    public static final Target BOTTON_ADD_DOCTOR = Target.the("Botton add doctor")
            .locatedBy("[href='addDoctor']");

    public static final Target BOTTON_ADD_PATIENT = Target.the("Botton add patient")
            .locatedBy("[href='addPatient']");

    public static final Target BOTTON_SCHEDULE_APPOINTMENT = Target.the("Botton schedule appointment")
            .locatedBy("[href='appointmentScheduling']");
}
