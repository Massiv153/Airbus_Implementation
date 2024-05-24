public class ContainerLagerLeer {
    private final Container[][] containerStorage;

    public ContainerLagerLeer(){
        containerStorage = new Container[2][2];
    }

    public void addContainer(Container container){
        for (int row = 0; row < 2; row++ ){
            for (int col = 0; col < 2; col++) {
                if (containerStorage[row][col] == null) {
                    containerStorage[row][col] = container;
                }
                else {
                    System.out.println("Container Lager ist voll");
                }
            }
        }
    }

    public Container removeContainer() {
        for (int row = 2; row >= 0; row--) {
            for (int col = 2; col >= 0; col--) {
                if (containerStorage[row][col] != null) {
                    Container container = containerStorage[row][col];
                    containerStorage[row][col] = null;
                    return container;
                }
            }
        }
        return null;
    }
}
