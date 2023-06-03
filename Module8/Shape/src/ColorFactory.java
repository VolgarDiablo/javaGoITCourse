import java.util.HashMap;
import java.util.Map;

//Клас ColorFactory використовує мапу colors, щоб зберігати створені об'єкти. Якщо для заданого кольору був створений легковаговий об'єкт,
//        то він повертається з мапи. Якщо об'єкт для заданого кольору ще не був створений, то він створюється та додається до мапи.
public class ColorFactory {
    private static final Map<String, Color> colors = new HashMap<>();

    public static Color getColor(String name) {
        Color color = colors.get(name);
        if (color == null) {
            color = new Color(name);
            colors.put(name, color);
        }
        return color;
    }
}
