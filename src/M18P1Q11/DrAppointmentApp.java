package M18P1Q11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DrAppointmentApp {

    public static Appointment parseAppointmentLine(String line) {
        // e.g 104,2024-11-30,09:00
        String[] tokens = line.split(",");
        return new Appointment(Integer.parseInt(tokens[0]), LocalDateTime.parse(tokens[1] + "T" + tokens[2]));
    }

    public static Patient parsePatientLine(String line) {
        // e.g 103,Mr. Gunn,+(124) 2949829 94829
        String[] tokens = line.split(",");
        return new Patient(Integer.parseInt(tokens[0]),tokens[1],tokens[2]);
    }

    public static void main(String[] args) {
        // open the appointments file
        BufferedReader af = null;
        try {
            af = new BufferedReader(new FileReader("appointments.csv"));

            // iterate through all the appointments
            String appointmentLine = af.readLine();
            while (appointmentLine != null) {
                Appointment a = parseAppointmentLine(appointmentLine);

                // if the appointment day is tomorrow
                LocalDate tomorrow = LocalDateTime.now().toLocalDate().plusDays(1);
                if (tomorrow.isEqual(a.getDatetime().toLocalDate())) {

                    // open the patients file
                    BufferedReader pf = new BufferedReader(new FileReader("patients.csv"));

                    // iterate through all the patients
                    String patientLine = pf.readLine();
                    while (patientLine != null) {
                        Patient p = parsePatientLine(patientLine);

                        // if the appointments patient id is the same as the patient id (of the patient)
                        if (a.getPatientID() == p.getID()) {

                            // send an SMS to the patient.phoneNumber with appointment details
                            System.out.println("Sending SMS to " + p.getPhoneNum() + " -- Hello " + p.getName() + " you have an appointment " + a);
                        }
                        patientLine = pf.readLine();
                    }
                    pf.close();
                }
                appointmentLine = af.readLine();
            }
            af.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
