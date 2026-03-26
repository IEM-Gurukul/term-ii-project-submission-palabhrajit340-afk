import java.util.HashMap;

public class Attendance {
    private HashMap<Integer, Integer> attendanceMap = new HashMap<>();
    private HashMap<Integer, Integer> totalClasses = new HashMap<>();

    public void markAttendance(int id, boolean present) {
        totalClasses.put(id, totalClasses.getOrDefault(id, 0) + 1);

        if (present) {
            attendanceMap.put(id, attendanceMap.getOrDefault(id, 0) + 1);
        }
    }

    public double getPercentage(int id) {
        int present = attendanceMap.getOrDefault(id, 0);
        int total = totalClasses.getOrDefault(id, 0);

        if (total == 0) return 0;
        return (present * 100.0) / total;
    }
}
