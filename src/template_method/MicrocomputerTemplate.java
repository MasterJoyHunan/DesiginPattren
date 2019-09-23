package template_method;

/**
 * @author joy
 * @time 2019/09/16 20:21
 */
public class MicrocomputerTemplate extends ComputeTemplate {

    @Override
    public void installCpu() {
        System.out.println("i5 2450");
    }

    @Override
    public void installBoard() {
        System.out.println("技嘉 A130");
    }

    @Override
    public void installMemory() {
        System.out.println("金士顿 16G");
    }

    @Override
    public void installGraphicsCard() {
        System.out.println("GTX 1080");
    }

    @Override
    public void installPower() {
        System.out.println("杂牌电源 1200W");
    }
}
