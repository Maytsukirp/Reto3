#Autor: Maileth Rivero Palacio

@stories

Feature: Schedule a new appointment

  @ScheduleAppointment
  Scenario: Schedule an appointment

    Given Carlos needs to see a doctor
    When He schedules an Appointment in the Hospital Administration application
      | strDate    | strIdDocumentPatient | strIdDocumentDoctor | strObservations |
      | 30/09/2022 | 6789                 | 12345               | None            |
    Then He verifies on the screen that the data has been saved
      | strSaveInformationSchedule     |
      | Datos guardados correctamente. |