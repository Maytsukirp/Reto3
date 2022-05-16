#Autor: Maileth Rivero Palacio

@stories

Feature: Register a new Doctor

  @RegisterDoctor
  Scenario: Register a doctor

    Given Carlos needs to register a new doctor
    When He registers the new doctor in the Hospital Administration application
      | strFullNameDoctor | strLastNameDoctor | strTelephoneNumberDoctor | strTypeIdDocumentDoctor | strIdDocumentDoctor |
      | Brig              | Campos            | 12345                    | Pasaportes              | 12345               |
    Then He verifies that the message data saved correctly is displayed on the screen
      | strSaveInformationDoctor       |
      | Datos guardados correctamente. |
