public class Main {

    public static void main(String[] args) {

        Object stringObject = ObjectFactory.getObject("text");
        stringObject = "sobe text";

        Object numberObject = ObjectFactory.getObject("number");
        numberObject = 123;

        Object obj = 'd';
    }
}
