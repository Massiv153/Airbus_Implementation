import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class CSVReader {
    private LocalDate dateOfBirth;
    private String[] tokenArray;
    List<Passenger> passengers = new ArrayList<>();
    TreeMap<String, Ticket> tickets= new TreeMap<>();
    List<Baggage> baggages = new ArrayList<>();

    public CSVReader(){
        readFromCss();
    }

    public void readFromCss(){
        PassengerTicketMap passengerTicketMap = new PassengerTicketMap();

        try {
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Configuration.INSTANCE.dataFile));

            while ((line = bufferedReader.readLine()) != null) {
                tokenArray = line.split(Configuration.INSTANCE.csvDelimiter);
                String role = tokenArray[1];
                if (!role.equals("Passenger")) {
                    continue;
                }
                //passenger erstellen und array list hinzufügen
                Passenger passenger = createPassenger();
                passengers.add(passenger);
                //ticket erstellen und Treemap hinzufügen
                Ticket ticket = createTicket();
                tickets.put(ticket.getUuid(),ticket);
                passenger.setTicket(ticket);
                passengerTicketMap.add(passenger, ticket);


            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Passenger> getPassengers(){
        return passengers;
    }

    public TreeMap<String, Ticket> getTickets(){
        return tickets;
    }

    public List<Baggage> getBaggages(){
        return baggages;
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
        int baggageCount = Integer.parseInt(baggageCountString);
        String[] weightToken = tokenArray[17].split(" ");
        for (int i = 0; i < baggageCount; i++) {
            double weight = Double.parseDouble(weightToken[i]);
            baggages.add(new Baggage(weight, determineBookingClass(tokenArray[14])));
        }
        //Iris
        String humaniris = tokenArray[6];

        //Fingerprint
        String humanfingerprint = tokenArray[7];

        //Warrent
        Warrent warrent = determineWarrent(tokenArray[18]);




        //Passenger erstellen
        return new Passenger(firstName, lastName, gender, dateOfBirth, passportID, baggages, humaniris, humanfingerprint, warrent);
    }

    private Ticket createTicket(){

        //uuid
        String uuid = tokenArray [0];

        // bookingID
        String bookingID = tokenArray[8];

        // flight
        String flight = tokenArray[9];

        // from
        String from = tokenArray[10];

        // to
        String to = tokenArray[11];

        // departure
        LocalTime departure = LocalTime.parse(tokenArray[12]);

        // arrival
        LocalTime arrival = convertOffset(tokenArray[13]) ;

        // bookingClass
        BookingClass bookingClass = determineBookingClass(tokenArray[14]);

        //  seat
        String seat = tokenArray[15];

        //ticket erstellen
        return new Ticket(uuid, bookingID, flight, from, to, departure, arrival, bookingClass, seat);

    }


    private void convertStringtoDate(String dateString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            dateOfBirth = LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("ungültiges Geburtsdatum");

        }
    }

    private LocalTime convertOffset(String arrivalString){
        String[] partArrival = arrivalString.split("\\+");
        String arrivalTime = partArrival[0];
        int arrivalOffset = Integer.parseInt(partArrival[1]);
        LocalTime arrival = LocalTime.parse(arrivalTime);
        arrival = arrival.plusHours(arrivalOffset);
        return arrival;

    }
    private BookingClass determineBookingClass(String bookingClass){
        switch (bookingClass) {
            case "BUSINESS":
                return BookingClass.BUSINESS;
            case "PREMIUM_ECONOMY":
                return BookingClass.PREMIUM_ECONOMY;
            default:
                return BookingClass.ECONOMY;
        }
    }

    private Warrent determineWarrent(String warrentString){
        switch (warrentString){
            case "YES":
                return Warrent.YES;
            case "NO":
                return Warrent.NO;
            default:
                return Warrent.NO;
        }
    }

}
