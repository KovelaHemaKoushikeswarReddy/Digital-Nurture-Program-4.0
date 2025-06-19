public class Company {
    public static void main(String[] args) {
        System.out.println();

        StaffRegistry registry = new StaffRegistry(5);

        Staff s1 = new Staff(101, "Ritika Sharma", "Software Engineer", 72000);
        Staff s2 = new Staff(102, "Mohit Verma", "Project Manager", 95000);
        Staff s3 = new Staff(103, "Sneha Rao", "Business Analyst", 68000);

        registry.registerStaff(s1);
        registry.registerStaff(s2);
        registry.registerStaff(s3);

        System.out.println("Team after initial registrations:");
        registry.showAllStaff();

        Staff search = registry.findStaffById(102);
        System.out.println("Lookup result for ID 102: " + search);

        boolean deleted = registry.removeStaffById(101);
        System.out.println("Was staff with ID 101 removed? " + deleted);

        System.out.println("Team after removal:");
        registry.showAllStaff();

        Staff s4 = new Staff(104, "Ananya Iyer", "UX Designer", 64000);
        registry.registerStaff(s4);

        System.out.println("Team after adding Ananya:");
        registry.showAllStaff();
    }
}
