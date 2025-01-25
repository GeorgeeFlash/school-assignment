public class Main {
    public static void main(String[] args) {
        // Get the single instance of Configuration
        Configuration config1 = Configuration.getInstance();
        System.out.println("Config Setting: " + config1.getSetting());

        // Change the setting using one instance
        config1.setSetting("Updated Configuration");

        // Access the same instance and verify the change
        Configuration config2 = Configuration.getInstance();
        System.out.println("Config Setting: " + config2.getSetting());
    }
}