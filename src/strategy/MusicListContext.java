package strategy;

import java.util.List;

/**
 * 上下文
 */
public class MusicListContext {

    private MusicListStrategy ms;

    public MusicListContext(String people) {
        switch (people) {
            case "mather":
                ms = new PureMusic();
                break;
            case "father":
                ms = new ClassicalMusic();
                break;
            case "joy":
                ms = new PopMusic();
                break;
        }
    }


    public List<String> getMusicList() {
        return ms.getFavourite();
    }
}
