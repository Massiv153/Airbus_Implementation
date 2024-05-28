import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class AdministrativeUnit {
    private AutonomousVehicle[] autonomousVehicles;
    private JSONObject order;
    private int currentContainer;


    public AdministrativeUnit(){
        this.autonomousVehicles = new AutonomousVehicle[3];
        this.order = new JSONObject();
        this.currentContainer = 0;
    }

    public void addVehicle(AutonomousVehicle autonomousVehicle, int index){
        this.autonomousVehicles[index] = autonomousVehicle;
    }

    public void loadPlan(String filename){
        String content = "";
        try {
            content = new String (Files.readAllBytes(Paths.get(filename)));
        }catch(Exception e){
            System.out.println((e.getMessage()));
        }
        JSONParser parser = new JSONParser();
        try {
            order = (JSONObject) parser.parse(content);
        }catch (Exception e){
            System.out.println((e.getMessage()));
        }
    }

    public void sendVehicle(){
        Container container = (Container)(order.get(currentContainer));
        Random random = new Random();
        if(currentContainer<4){
            autonomousVehicles[random.nextInt(3)].moveContainer(container, LiftDirection.LEFT);
        }else{
            autonomousVehicles[random.nextInt(3)].moveContainer(container, LiftDirection.RIGHT);
        }



    }
}
