package template_method;

/**
 * @author joy
 * @time 2019/09/16 20:22
 */
public class Test {

    public static void main(String[] args) {
        ComputeTemplate shenwei = new SuperComputeTemplate();
        shenwei.installCompute();

        ComputeTemplate game = new MicrocomputerTemplate();
        game.installCompute();
    }
}
