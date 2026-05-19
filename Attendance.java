public class Attendance {

    private String studentId;
    private String courseId;
    private int    date;
    private String status;

    public Attendance(String studentId, String courseId, int date, String status) {
        this.studentId = studentId;
        this.courseId  = courseId;
        this.date      = date;
        this.status    = status;
    }

    public String getStudentId() { return studentId; }
    public String getCourseId()  { return courseId; }
    public int    getDate()      { return date; }
    public String getStatus()    { return status; }


    public void updateStatus(String newStatus) {
        if (newStatus.equals("Present") || newStatus.equals("Absent") || newStatus.equals("Late")) {
            this.status = newStatus;
            System.out.println("  Attendance status updated to: " + newStatus);
        } else {
            System.out.println("  Invalid status: " + newStatus);
        }
    }

    @Override
    public String toString() {
        return "Attendance[student=" + studentId
                + ", course=" + courseId
                + ", date=" + date
                + ", status=" + status + "]";
    }
}
