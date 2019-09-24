package template_method;

/**
 * 模板方法抽象
 * -- 组装电脑
 */
abstract class ComputeTemplate {

    public abstract void installCpu();
    public abstract void installBoard();
    public abstract void installMemory();
    public abstract void installGraphicsCard();
    public abstract void installPower();

    public void installCompute() {
        System.out.println("组装电脑");
        installCpu();
        installBoard();
        installMemory();
        installGraphicsCard();
        installPower();
        System.out.println("组装完毕, 开始点亮开机");
    }
}
