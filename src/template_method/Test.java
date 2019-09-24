package template_method;


public class Test {

    public static void main(String[] args) {
        ComputeTemplate shenwei = new SuperComputeTemplate();
        shenwei.installCompute();

        ComputeTemplate game = new MicrocomputerTemplate();
        game.installCompute();
    }
}
