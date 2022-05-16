package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;

public class FillScheduleAppointmentPage {
    private WebDriver driver;

    public static final Target FIELD_DATE = Target.the("Field date")
            .locatedBy("#datepicker");

    public static final Target FIELD_ID_DOCUMENT_PATIENT = Target.the("Field id document patient")
            .locatedBy("//div[@class='col-md-4']/div[2]/input[@class='form-control']");

    public static final Target FIELD_ID_DOCUMENT_DOCTOR = Target.the("Field id document doctor")
            .locatedBy("//div[@class='col-md-4']/div[3]/input[@class='form-control']");

    public static final Target FIELD_OBSERVATIONS  = Target.the("Field observations")
            .locatedBy("textarea");

    public static final Target BUTTON_SAVE = Target.the("Button save")
            .locatedBy(".btn");
}
