public class Staff {
    private int staffId;
    private String fullName;
    private String designation;
    private double pay;

    public Staff(int staffId, String fullName, String designation, double pay) {
        this.staffId = staffId;
        this.fullName = fullName;
        this.designation = designation;
        this.pay = pay;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "ID=" + staffId +
                ", Name='" + fullName + '\'' +
                ", Role='" + designation + '\'' +
                ", Pay=" + pay +
                '}';
    }
}
