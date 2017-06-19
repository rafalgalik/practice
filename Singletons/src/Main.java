public class Main {

    public static void main(String[] args) {
	Singleton singleton1 = Singleton.getInstance();
	DoubleCheckedSingleton singleton2 = DoubleCheckedSingleton.getInstance();
	StaticBlockSingleton singleton3 = StaticBlockSingleton.getInstance();
    }
}
