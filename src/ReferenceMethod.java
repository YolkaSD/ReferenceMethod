import java.util.HashMap;
import java.util.Map;

public class ReferenceMethod {
    static Map<String, MyFunc> myFuncMap;

    static {
        myFuncMap = new HashMap<>();
        myFuncMap.put("test", ReferenceMethod::test);
        myFuncMap.put("test1", ReferenceMethod::test1);
        myFuncMap.put("test2", ReferenceMethod::test2);
    }
    public static void main(String[] args) {
        String string = "test";
        start(string);
    }
    private static void test() {
        System.out.println("Test");
    }
    private static void test1() {
        System.out.println("Test");
    }
    private static void test2() {
        System.out.println("Test");
    }

    private static void start(String string)  {
        ReferenceMethod.myFuncMap.get(string).test();
    }

    @FunctionalInterface
    interface MyFunc {
        void test();
    }

}
