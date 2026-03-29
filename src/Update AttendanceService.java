public double calculatePercentage(int studentId) {
    int total = 0;
    int present = 0;

    for (Attendance a : records) {
        if (a.getStudentId() == studentId) {
            total++;
            if (a.getStatus().equalsIgnoreCase("Present")) {
                present++;
            }
        }
    }

    if (total == 0) return 0;
    return (present * 100.0) / total;
}
