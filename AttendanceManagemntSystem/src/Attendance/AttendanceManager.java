package Attendance;

import java.util.ArrayList;
import java.util.List;

public class AttendanceManager {
    private List<Attendance> attendanceList = new ArrayList<>();

    public void markAttendance(String studentId, String date, boolean present) {
        Attendance attendance = new Attendance(studentId, date, present);
        attendanceList.add(attendance);
        System.out.println("Attendance marked for Student ID: " + studentId);
    }

    public void displayAttendance() {
        System.out.println("Attendance Records:");
        for (Attendance attendance : attendanceList) {
            System.out.println("Student ID: " + attendance.getStudentId() + 
                               ", Date: " + attendance.getDate() + 
                               ", Present: " + attendance.isPresent());
        }
    }
}
