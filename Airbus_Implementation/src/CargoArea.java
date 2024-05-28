import java.util.ArrayList;
import java.util.Comparator;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.IOException;

public class CargoArea {
    private ArrayList<Container> cargoArea = new ArrayList<Container>();
    private Container[] cargoLeft = new Container[3];
    private Container[] cargoRight = new Container[3];

    public void CargoArea(Container[] containers){
        double totalWeight=0;
        int amountContainers= 0;
        for(int i=0; i<=containers.length;i++){
            totalWeight =+ containers[i].getContainerWeight();
            cargoArea.add(containers[i]);
            amountContainers = i;
        }
        double median = totalWeight/amountContainers;
        cargoArea.sort(Comparator.comparingDouble(Container::getContainerWeight));


        for(int i=0;i<=3;i+=2){
            cargoLeft[i]=cargoArea.getLast();
            cargoLeft[i+1]=cargoArea.getFirst();
            cargoArea.removeFirst();
            cargoArea.removeLast();
            cargoRight[i]=cargoArea.getLast();
            cargoRight[i+1]=cargoArea.getFirst();
            cargoArea.removeFirst();
            cargoArea.removeLast();
        }
        return;

    }

    public void exportToJson(Container[] containers, String filename) {
        JSONArray containerArray = new JSONArray();
        JSONArray baggageArray = new JSONArray();

        // Export containers
        for (Container container : containers) {
            JSONObject containerObject = new JSONObject();
            containerObject.put("weight", container.getContainerWeight());
            containerArray.add(containerObject);
        }


        // Create a JSON object to hold both arrays
        JSONObject data = new JSONObject();
        data.put("containers", containerArray);
        data.put("baggage", baggageArray);

        // Write JSON object to file
        try (FileWriter file = new FileWriter(filename)) {
            file.write(data.toJSONString());
            System.out.println("JSON data exported to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

