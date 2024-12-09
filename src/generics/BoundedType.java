package generics;

import model.Customer;

public class BoundedType <T extends Customer> {

    private T value;

    public BoundedType(T value){
        this.value = value;
    }

    public String getCustomerDetails() {
        return value.toString();
    }


}
