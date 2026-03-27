package service;

import model.Attendance;
import java.util.ArrayList;

public class AttendanceService {

    private ArrayList<Attendance> records = new ArrayList<>();

    public void markAttendance(int studentId, String date, String status) {
        records.add(new Attendance(studentId, date, status));
    }

    public ArrayList<Attendance> getAllRecords() {
        return records;
    }
}
