package factory_method;

/**
 * @author joy
 * @time 2019/09/03 08:40
 */
public class OperationSub extends Operation {

    @Override
    double calc() {
        return this.getNumberA() - this.getNumberB();
    }
}
