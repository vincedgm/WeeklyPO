import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterate {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Test");
        map.put(2, "A");
        map.put(3, "Problem");

        iterateWhile(map);
        System.out.println("----------------");
        iterateForLoop(map);
    }

    public static void iterateWhile(HashMap<?,?> map) {
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void iterateForLoop(HashMap<?,?> map) {
        for (Map.Entry<?,?> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
