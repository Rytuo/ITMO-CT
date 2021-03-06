package expression.units.checked;

import expression.exceptions.OverflowException;
import expression.generic.MyType;
import expression.units.*;

public class CheckedSubtract<T extends Number> extends BinaryOperation<T> {
    public CheckedSubtract(CommonExpression<T> first, CommonExpression<T> second) {
        super(first, second);
    }

    public MyType<T> getAns(MyType<T> first, MyType<T> second) throws ArithmeticException {
        return first.sub(second);
    }

    @Override
    protected String getSign() {
        return "-";
    }

    public int checkOrder() {
        return 2;
    }
}
