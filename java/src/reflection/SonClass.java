package reflection;

/**
 * @author joy
 * @time 2019/09/17 19:00
 */
public class SonClass extends FatherClass {

    private   String mSonName;
    protected int    mSonAge;
    public    String mSonBirthday;

    public void printSonMsg() {
        System.out.println("Son Msg - name : "
                + mSonName + "; age : " + mSonAge);
    }

    private void setSonName(String name) {
        mSonName = name;
    }

    private void setSonAge(int age) {
        mSonAge = age;
    }

    private int getSonAge() {
        return mSonAge;
    }

    private String getSonName() {
        return mSonName;
    }
}
