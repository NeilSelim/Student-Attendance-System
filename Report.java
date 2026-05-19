import java.util.List;


public class Report {

    private String           reportId;
    private int              reportDate;
    private String           type;
    private List<Attendance> records;

    public Report(String reportId, int reportDate, String type, List<Attendance> records) {
        this.reportId   = reportId;
        this.reportDate = reportDate;
        this.type       = type;
        this.records    = records;
    }

    public String           getReportId()   { return reportId; }
    public int              getReportDate() { return reportDate; }
    public String           getType()       { return type; }
    public List<Attendance> getRecords()    { return records; }


    public void generate() {
        System.out.println("\n========== ATTENDANCE REPORT ==========");
        System.out.println("  Report ID  : " + reportId);
        System.out.println("  Date       : " + reportDate);
        System.out.println("  Type       : " + type);
        System.out.println("  Records    :");
        if (records == null || records.isEmpty()) {
            System.out.println("    (No records found)");
        } else {
            for (Attendance a : records) {
                System.out.println("    - " + a);
            }
        }
        System.out.println("=======================================\n");
    }


    public String export() {
        StringBuilder sb = new StringBuilder();
        sb.append("REPORT[").append(reportId).append("] Date:").append(reportDate)
                .append(" Type:").append(type).append("\n");
        if (records != null) {
            for (Attendance a : records) {
                sb.append("  ").append(a.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Report[id=" + reportId + ", date=" + reportDate + ", type=" + type + "]";
    }
}
