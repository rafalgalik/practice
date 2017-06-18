
public class ObjectFactory {

    public  static Object getObject(String purpose){

        if ("text".equalsIgnoreCase(purpose))
            return "";
        else if ("number".equalsIgnoreCase(purpose))
            return 0;
        else if ("longnumber".equalsIgnoreCase(purpose))
            return 0L;
        else if ("boolean".equalsIgnoreCase(purpose))
            return Boolean.TRUE;
        else return null;

    }
}
