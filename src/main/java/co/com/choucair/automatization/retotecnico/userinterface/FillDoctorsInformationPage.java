package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class FillDoctorsInformationPage {
    public static final Target FIELD_FULL_NAME = Target.the("Field full name ")
            .locatedBy("#name");

    public static final Target FIELD_LAST_NAME = Target.the("Field last name")
            .locatedBy("#last_name");

    public static final Target FIELD_TELEPHONE_NUMBER = Target.the("Field Telephone number ")
            .locatedBy("#telephone");

    public static final Target TYPE_ID_DOCUMENT = Target.the("Select type id document")
            .locatedBy("#identification_type");

    public static final Target FIELD_ID_DOCUMENT  = Target.the("Field id document number")
            .locatedBy("#identification");

    public static final Target BUTTON_SAVE = Target.the("Button save")
            .locatedBy(".btn");
}
