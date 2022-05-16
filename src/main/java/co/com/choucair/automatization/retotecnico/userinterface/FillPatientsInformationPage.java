package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class FillPatientsInformationPage {
    public static final Target FIELD_FULL_NAME = Target.the("Field full name ")
            .locatedBy("[name='name']");

    public static final Target FIELD_LAST_NAME = Target.the("Field last name")
            .locatedBy("[name='last_name']");

    public static final Target FIELD_TELEPHONE_NUMBER = Target.the("Field Telephone number ")
            .locatedBy("[name='telephone']");

    public static final Target TYPE_ID_DOCUMENT = Target.the("Select type id document")
            .locatedBy("[name='identification_type']");

    public static final Target FIELD_ID_DOCUMENT  = Target.the("Field id document number")
            .locatedBy("[name='identification']");

    public static final Target PREPAID_HEALTH  = Target.the("Field id document number")
            .locatedBy("[name='prepaid']");

    public static final Target BUTTON_SAVE = Target.the("Button save")
            .locatedBy(".btn");

}
