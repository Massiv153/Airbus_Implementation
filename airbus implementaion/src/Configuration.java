import java.nio.file.FileSystems;

public enum Configuration {
    INSTANCE;

    public final String fileSeparator = FileSystems.getDefault().getSeparator();
    public final String userDirectory = System.getProperty("user.dir");
    public final String dataFile = userDirectory + fileSeparator + "data" + fileSeparator + "data.csv";
    public final String csvDelimiter = ",";
    public final double milesInKilometer = 1.609344;
}
