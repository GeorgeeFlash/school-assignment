// Singleton class for Configuration
class Configuration {
    private static Configuration instance; // Static instance of the class
    private String setting;

    // Private constructor prevents external instantiation
    private  Configuration() {
        setting = "Default Configuration";
    }

    // Public method to provide access to the single instance
    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    // Getter and Setter for the configuration setting
    public  String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }
}
