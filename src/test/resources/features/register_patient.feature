#Autor: Maileth Rivero Palacio

@stories

Feature: Register a new patient

  @RegisterPatient
  Scenario: Register a patient

    Given Carlos needs to register a new patient
    When He registers the new patient in the Hospital Administration application
      | strFullNamePatient | strLastNamePatient | strTelephoneNumberPatient | strTypeIdDocumentPatient | strIdDocumentPatient |
      | Marce              | Lopez              | 67890                     | Cédula de extrangería    | 67890                |
    Then He verifies on the screen that the data has been saved correctly
      | strSaveInformationPatient      |
      | Datos guardados correctamente. |

