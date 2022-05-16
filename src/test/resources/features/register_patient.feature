#Autor: Maileth Rivero Palacio

@stories

Feature: Register a new patient

  @RegisterPatient
  Scenario: Register a patient

    Given Carlos needs to register a new patient
    When He registers the new patient in the Hospital Administration application
      | strFullNamePatient | strLastNamePatient | strTelephoneNumberPatient | strTypeIdDocumentPatient | strIdDocumentPatient |
      | Marcos             | Ruiz Lopez         | 67888                     | Cédula de extrangería    | 67999                |
    Then He verifies on the screen that the data has been saved correctly
      | strSaveInformationPatient      |
      | Datos guardados correctamente. |

