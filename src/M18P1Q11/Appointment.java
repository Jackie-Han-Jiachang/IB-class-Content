package M18P1Q11;

import java.time.LocalDateTime;

public class Appointment {
    private int patientID;
    private LocalDateTime datetime;

    public Appointment(int patientID, LocalDateTime datetime) {
        this.patientID = patientID;
        this.datetime = datetime;
    }

    public int getPatientID() {
        return patientID;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    @Override
    public String toString() {
        return "Appointment{ " +
                "patientID=" + patientID +
                ", datetime=" + datetime +
                " }";
    }
}
