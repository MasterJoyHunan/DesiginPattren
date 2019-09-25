package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * 古典音乐
 */
public class ClassicalMusic implements MusicListStrategy {

    /**
     * 获取我喜欢的音乐
     *
     * @return
     */
    @Override
    public List<String> getFavourite() {
        List<String> musicList = new ArrayList<>();
        musicList.add("古典音乐1");
        musicList.add("古典音乐2");
        musicList.add("古典音乐3");
        return musicList;
    }
}
