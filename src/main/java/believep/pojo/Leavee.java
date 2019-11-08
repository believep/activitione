package believep.pojo;

public class Leavee {
    private int lid;
    private int uid;
    private String startDate;
    private String endDate;
    private int status;
    private String reason;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Leavee(int lid, int uid, String startDate, String endDate, int status, String reason) {
        this.lid = lid;
        this.uid = uid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.reason = reason;
    }

    public Leavee(int lid, String startDate, String endDate, String reason) {
        this.lid = lid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
    }

    public Leavee() {
    }

    public Leavee(int uid, int status, String reason) {
        this.uid = uid;
        this.status = status;
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Leavee{" +
                "lid=" + lid +
                ", uid=" + uid +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                '}';
    }
}
