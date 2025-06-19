public class Workstation {
    private final String processor;
    private final String memory;
    private final String drive;
    private final String graphics;
    private final boolean hasSSD;

    // Constructor accessible only by the Builder
    private Workstation(Configurator config) {
        this.processor = config.processor;
        this.memory = config.memory;
        this.drive = config.drive;
        this.graphics = config.graphics;
        this.hasSSD = config.hasSSD;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "Processor='" + processor + '\'' +
                ", Memory='" + memory + '\'' +
                ", Drive='" + drive + '\'' +
                ", Graphics='" + graphics + '\'' +
                ", SSD Enabled=" + hasSSD +
                '}';
    }

    // Static inner class for configuration setup
    public static class Configurator {
        private String processor;
        private String memory;
        private String drive;
        private String graphics;
        private boolean hasSSD;

        public Configurator withProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Configurator withMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Configurator withDrive(String drive) {
            this.drive = drive;
            return this;
        }

        public Configurator withGraphics(String graphics) {
            this.graphics = graphics;
            return this;
        }

        public Configurator enableSSD(boolean hasSSD) {
            this.hasSSD = hasSSD;
            return this;
        }

        public Workstation assemble() {
            return new Workstation(this);
        }
    }
}
