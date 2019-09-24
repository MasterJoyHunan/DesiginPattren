package template_method;

/**
 * 组装超级计算机
 */
public class SuperComputeTemplate extends ComputeTemplate {

    @Override
    public void installCpu() {
        System.out.println("组装N个CPU");
    }

    @Override
    public void installBoard() {
        System.out.println("组装N个主板");
    }

    @Override
    public void installMemory() {
        System.out.println("组装N个内存");
    }

    @Override
    public void installGraphicsCard() {
        System.out.println("组装N个显卡");
    }

    @Override
    public void installPower() {
        System.out.println("组装N个电源");
    }

}
