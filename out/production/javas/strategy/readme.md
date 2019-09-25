### 策略模式

#### 模式定义
定义了算法家族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户

#### 适用场景
封装任意类型的规则来应对不同时间、不同业务规则。

消除嵌套的 if/else 语句

#### UML
![image.png](http://img.masterjoy.top/20190925/664153c2055dd8f7523f115d107275c6.png)

#### DEMO 一家人最爱的音乐
我们家每个人对音乐的品味都不一样，妈妈喜欢纯音乐，爸爸喜欢古典音乐，我喜欢流行音乐。

当打开音乐播放器，登录我的账号，播放器会根据我的账号推送我喜欢的音乐给我

音乐算法
```java
public interface MusicListStrategy {
    /**
     * 获取我喜欢的音乐
     * @return
     */
    List<String> getFavourite();
}
```
古典音乐
```java
public class ClassicalMusic implements MusicListStrategy {

    @Override
    public List<String> getFavourite() {
        List<String> musicList = new ArrayList<>();
        musicList.add("古典音乐1");
        musicList.add("古典音乐2");
        musicList.add("古典音乐3");
        return musicList;
    }
}
```
流行音乐
```java
public class PopMusic implements MusicListStrategy {

    @Override
    public List<String> getFavourite() {
        List<String> musicList = new ArrayList<>();
        musicList.add("流行音乐1");
        musicList.add("流行音乐2");
        musicList.add("流行音乐3");
        return musicList;
    }
}
```
纯音乐
```java
 */
public class PureMusic implements MusicListStrategy {

    @Override
    public List<String> getFavourite() {
        List<String> musicList = new ArrayList<>();
        musicList.add("纯音乐1");
        musicList.add("纯音乐2");
        musicList.add("纯音乐3");
        return musicList;
    }
}

```
播放器
```java
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
```
开始听听音乐吧
```java
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
```