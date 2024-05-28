import java.util.Comparator;

public class ContainerComparator implements Comparator<Container> {
    public int compare(Container container1 , Container container2) {
        if (container1.getContainerWeight() >= container2.getContainerWeight()){
            if (container1.getContainerWeight() > container2.getContainerWeight()){
                return 1;
            }else{
                return 0;
            }
        }else{
            return -1;
        }
    }
}
