public class Launcher {
    public static void main(String[] args) {
        System.out.println();

        // Initializing a standard configuration
        Workstation officePC = new Workstation.Configurator()
                .withProcessor("Intel i5")
                .withMemory("8GB")
                .withDrive("1TB HDD")
                .assemble();

        // Initializing a high-end machine with custom specs
        Workstation highEndRig = new Workstation.Configurator()
                .withProcessor("AMD Ryzen 5")
                .withMemory("16GB")
                .withDrive("512GB SSD")
                .withGraphics("NVIDIA GeForce RTX 3080")
                .enableSSD(true)
                .assemble();

        // Display system configurations
        System.out.println("Office PC: " + officePC);
        System.out.println("High-End Rig: " + highEndRig);
    }
}
