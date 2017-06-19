public class HouseWithGarage extends HouseDecorator {

    int garageSize = 20;

    protected HouseWithGarage(House house) {
        super(house);
    }

    @Override
    public void build() {
        super.build();
        System.out.println("Adding garage");
    }
}
