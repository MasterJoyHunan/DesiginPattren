package simple_factory;

/**
 * 加法操作
 */
public class OperationAdd extends Operation {

    @Override
    double calc() {
        return this.getNumberA() + this.getNumberB();
    }
}
