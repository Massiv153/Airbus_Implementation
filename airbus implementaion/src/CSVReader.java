import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class CSVReader {
    private LocalDate dateOfBirth;
    private String[] tokenArray;

    public Data readFromCss(){
        List<Passenger> passengers = new ArrayList<>();
        TreeMap<String, Ticket> tickets= new TreeMap<>();

        try {
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Configuration.INSTANCE.dataFile));

            while ((line = bufferedReader.readLine()) != null) {
                tokenArray = line.split(Configuration.INSTANCE.csvDelimiter);
                String role = tokenArray[1];
                if (!role.equals("Passenger")) {
                    continue;
                }
                Passenger passenger = createPassenger();
                Ticket ticket = createTicket();



            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new Data(passengers, tickets) {
        };
    }
    public TreeMap<String, Ticket> ticketTreeMap(){

    }
    private Passenger createPassenger(){
        //Name
        String[] nameToken = tokenArray[2].split(" ");
        String firstName = nameToken[0];
        String lastName = nameToken[1];

        //gender
        String gender = tokenArray[3];

        //Datum
        String dateOfBirthString = tokenArray[4];
        convertStringtoDate(dateOfBirthString);

        //PassportID
        String passportID = tokenArray[5];

        //Baggage
        String baggageCountString = tokenArray[16];
        List<Baggage> baggages = new ArrayList<>();
        int baggageCount = Integer.parseInt(baggageCountString);
        String[] weightToken = tokenArray[17].split(" ");
        for (int i = 0; i < baggageCount; i++){
            double weight = Double.parseDouble(weightToken[i]);
            baggages.add(new Baggage(weight));
        }
        //Passenger erstellen
        System.out.println(firstName);
        return new Passenger(firstName, lastName, gender, dateOfBirth, passportID, baggages);
    }

    private Ticket createTicket(){
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }


    private void convertStringtoDate(String dateString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            dateOfBirth = LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("ungültiges Geburtsdatum");

        }
    }
}
