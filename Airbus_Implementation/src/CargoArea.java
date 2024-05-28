import java.util.*;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.IOException;

public class CargoArea {
    private Airport airport;
    private Container[] cargoLeft;
    private Container[] cargoRight;
    private ArrayList<Container> plan;

    public void CargoArea(Airport airport){
        this.airport = airport;
        ArrayList<Container> plan = new ArrayList<Container>();
        this.cargoLeft = new Container[3];
        this.cargoRight = new Container[3];
    }

    private void optimize(ArrayList<Container> containers) {
        Collections.sort(containers,new ContainerComparator());
        ArrayList<Container> rechts = new ArrayList<Container>();
        ArrayList<Container> links = new ArrayList<Container>();
        for (Container container : containers) {
            if ((weightSum(rechts) > weightSum(links) && rechts.size() <= 4) || links.size() > 4) {
                rechts.add(container);
            } else {
                links.add(container);
            }
        }
        for (Container container : links){
            plan.add(container);
        }
        for (Container container : rechts){
            plan.add(container);
        }
    }

    private double weightSum(ArrayList<Container> containers){
        int sum = 0;
        for(Container container:containers){
            sum += container.getContainerWeight();
        }
        return sum;
    }

    public void exportToJson(Container[] containers, String filename) {
        JSONObject containerObject = new JSONObject();
        for (int i = 0; i < 8; i++) {
            if (i < 4) {
                containerObject.put(i, plan.get(i));
            } else {
                containerObject.put(i, plan.get(i));
            }
        }

        try (FileWriter file = new FileWriter(filename)) {
            file.write(containerObject.toJSONString());
            System.out.println("JSON data exported to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Container[] getCargoRight() {
        return cargoRight;
    }

    public Container[] getCargoLeft() {
        return cargoLeft;
    }
}

