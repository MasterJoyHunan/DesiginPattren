package strategy;

import java.util.List;


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
