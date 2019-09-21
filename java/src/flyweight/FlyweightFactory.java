package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author joy
 * @time 2019/09/21 08:33
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> map = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            Flyweight flyweight = null;
            try {
                flyweight = (Flyweight) Class.forName(key).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            map.put(key, flyweight);
            return flyweight;
        }
    }
}
