public class ContainerLagerLeer {
    private final Container[][] containerStorage;

    public ContainerLagerLeer(){
        containerStorage = new Container[2][2];
        initializeContainer();
    }

    private void initializeContainer(){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2;j++){
                containerStorage[i][j] = new Container();
            }
        }
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

    public Container getContainer() {
        for (int row = 1; row >= 0; row--) {
            for (int col = 1; col >= 0; col--) {
                if (containerStorage[row][col] != null) {
                    return containerStorage[row][col];
                }
            }
        }
        return null;
    }
    public void removeContainer(){
        for (int row = 1; row >= 0; row--) {
            for (int col = 1; col >= 0; col--) {
                if (containerStorage[row][col] != null) {
                    containerStorage[row][col] = null;
                    return;
                }
            }
        }
    }



}
