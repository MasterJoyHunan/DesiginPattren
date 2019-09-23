package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joy
 * @time 2019/09/05 19:31
 */
public class PopMusic implements MusicListStrategy {

    /**
     * 获取我喜欢的音乐
     *
     * @return
     */
    @Override
    public List<String> getFavourite() {
        List<String> musicList = new ArrayList<>();
        musicList.add("流行音乐1");
        musicList.add("流行音乐2");
        musicList.add("流行音乐3");
        return musicList;
    }
}
