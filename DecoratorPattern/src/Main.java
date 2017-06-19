public class Main {

    public static void main(String[] args) {

        House someHouse = new HouseWithSecondFloor(new HouseWithGarage(new BasicHouse()));
        someHouse.build();
    }
}
