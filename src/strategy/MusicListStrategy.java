package strategy;

import java.util.List;

/**
 * 音乐算法
 */
public interface MusicListStrategy {
    /**
     * 获取我喜欢的音乐
     * @return
     */
    List<String> getFavourite();
}
