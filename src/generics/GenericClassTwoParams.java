package generics;

import model.Customer;
import model.Order;

                                //Customer T , Order -S
public class GenericClassTwoParams <T,S > {

    private T value;
    private S svalue;

    public GenericClassTwoParams(T value, S svalue) {
        this.value = value;
        this.svalue = svalue;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public S getSvalue() {
        return svalue;
    }

    public void setSvalue(S svalue) {
        this.svalue = svalue;
    }

    @Override
    public String toString() {
        return "GenericClassTwoParams{" +
                "value=" + value +
                ", svalue=" + svalue +
                '}';
    }
}
