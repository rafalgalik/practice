public class HouseWithSecondFloor extends HouseDecorator {

    int SecondFloorSize = 100;

    protected HouseWithSecondFloor(House house) {
        super(house);
    }

    @Override
    public void build() {
        super.build();
        System.out.println("Adding second floor");
    }
}
