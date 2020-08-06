import java.util.LinkedHashMap;
import java.util.List;

public class testApi {
    public static void main(String[] args) {
        LinkedHashMap<String, String> stringStringLinkedHashMap = new LinkedHashMap<>();
        stringStringLinkedHashMap.put("1", "2");
        stringStringLinkedHashMap.put("2", "2");
        stringStringLinkedHashMap.put("1", "3");
        stringStringLinkedHashMap.forEach((x, y) -> System.out.println(x + y));
    }

    /**
     * 交换列表成员
     *
     * @param list
     * @param a
     * @param b
     */
    public static void swapList(List list, int a, int b) {
        Object o = new Object();
        o = list.get(a);
        list.set(a, list.get(b));
        list.set(b, o);
    }
}