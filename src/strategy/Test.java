package strategy;

import java.util.List;

/**
 * @author joy
 * @time 2019/09/05 19:41
 */
public class Test {
    public static void main(String[] args) {
        String people = "father";
        MusicListContext mc = new MusicListContext(people);
        List<String> musicList = mc.getMusicList();
        for (String music: musicList) {
            System.out.println(music);
        }
    }
}
