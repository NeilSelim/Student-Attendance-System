import java.util.ArrayList;
import java.util.List;


public class Course {

    private String           courseId;
    private String           courseName;
    private int              credits;
    private List<Attendance> attendanceRecords;

    public Course(String courseId, String courseName, int credits) {
        this.courseId         = courseId;
        this.courseName       = courseName;
        this.credits          = credits;
        this.attendanceRecords = new ArrayList<>();
    }

    public String getCourseId()   { return courseId; }
    public String getCourseName() { return courseName; }
    public int    getCredits()    { return credits; }

    public void setCourseName(String courseName) { this.courseName = courseName; }
    public void setCredits(int credits)          { this.credits = credits; }

    public String getCourseInfo() {
        return "Course[id=" + courseId
                + ", name=" + courseName
                + ", credits=" + credits + "]";
    }

    public void addAttendanceRecord(Attendance record) {
        attendanceRecords.add(record);
    }

    public List<Attendance> getAttendanceRecords() {
        return new ArrayList<>(attendanceRecords);
    }

    @Override
    public String toString() {
        return getCourseInfo();
    }
}
