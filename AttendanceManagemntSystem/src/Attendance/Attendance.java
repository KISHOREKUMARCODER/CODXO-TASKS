package Attendance;

import java.util.HashMap;
import java.util.Map;

public class Attendance {
    private String studentId;
    private String date;
    private boolean present;

    public Attendance(String studentId, String date, boolean present) {
        this.studentId = studentId;
        this.date = date;
        this.present = present;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getDate() {
        return date;
    }

    public boolean isPresent() {
        return present;
    }
}
