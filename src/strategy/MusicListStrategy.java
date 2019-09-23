package strategy;

import java.util.List;

/**
 * @author joy
 * @time 2019/09/05 19:28
 */
public interface MusicListStrategy {
    /**
     * 获取我喜欢的音乐
     * @return
     */
    List<String> getFavourite();
}
