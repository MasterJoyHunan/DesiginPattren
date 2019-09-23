package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joy
 * @time 2019/09/05 19:31
 */
public class PureMusic implements MusicListStrategy {

    /**
     * 获取我喜欢的音乐
     *
     * @return
     */
    @Override
    public List<String> getFavourite() {
        List<String> musicList = new ArrayList<>();
        musicList.add("纯音乐1");
        musicList.add("纯音乐2");
        musicList.add("纯音乐3");
        return musicList;
    }
}
