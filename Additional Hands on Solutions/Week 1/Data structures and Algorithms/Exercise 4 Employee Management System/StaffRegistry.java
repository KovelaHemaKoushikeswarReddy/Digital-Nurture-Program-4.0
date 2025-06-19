public class StaffRegistry {
    private Staff[] team;
    private int count;

    public StaffRegistry(int capacity) {
        team = new Staff[capacity];
        count = 0;
    }

    public void registerStaff(Staff s) {
        if (count < team.length) {
            team[count++] = s;
        } else {
            System.out.println("Registry is full. Cannot register new staff.");
        }
    }

    public Staff findStaffById(int staffId) {
        for (int i = 0; i < count; i++) {
            if (team[i].getStaffId() == staffId) {
                return team[i];
            }
        }
        return null;
    }

    public void showAllStaff() {
        for (int i = 0; i < count; i++) {
            System.out.println(team[i]);
        }
    }

    public boolean removeStaffById(int staffId) {
        for (int i = 0; i < count; i++) {
            if (team[i].getStaffId() == staffId) {
                for (int j = i; j < count - 1; j++) {
                    team[j] = team[j + 1];
                }
                team[--count] = null;
                return true;
            }
        }
        return false;
    }
}
