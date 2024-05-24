import java.util.ArrayList;
import java.util.Comparator;


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

        for(int i=0;i<=3;i++){
            cargoLeft[i+0]=cargoArea.getLast();
            cargoLeft[2]=cargoArea.getFirst();
            cargoArea.removeFirst();
            cargoArea.removeLast();
            cargoRight[1]=cargoArea.getLast();
            cargoRight[2]=cargoArea.getFirst();
            cargoArea.removeFirst();
            cargoArea.removeLast();
        }
        return;
    }


    /*public Container[] getCargoAreaLeft() {
        return this.cargoAreaLeft;
    }

    public Container[] getCargoAreaRight() {
        return this.cargoAreaRight;
    }
    */

    //add a single container
    public void addContainer(Container container){
        float totalweight = 0;
        float median = 0;


        median = totalweight / 8;

    }

    // Adding multiple container
    public void addContainer(Container[] containers) {

    }

    public void exportCargoListJson(){

    }
}

