import generics.BoundedType;
import generics.GenericClass;
import generics.GenericClassTwoParams;
import generics.WildcardClass;
import interfaces.GenericInterface;
import interfaces.impl.GenericInterfaceImpl;
import model.Customer;
import model.Order;
import model.VIPCustomer;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /**
         * WildcardClass demo
         *
         */
        List<String> stringList = List.of("A", "B", "C");
        List<Integer> integerList = List.of(1, 2, 3);

        WildcardClass wildcardClass = new WildcardClass();
        wildcardClass.printList(stringList);
        wildcardClass.printList(integerList);

        /**
         * VIPCustomer using the BoundedType class
         */

//        Customer customer = new Customer(1001, "Lisa Jones");
//        BoundedType<Customer> customerBoundedType = new BoundedType<>(customer);
//        System.out.println("Customer Details: " + customerBoundedType.getCustomerDetails());
//
//
//        VIPCustomer vipCustomer = new VIPCustomer(2002, "Bob Jones","Gold");
//        BoundedType<VIPCustomer> vipCustomerBoundedType =  new BoundedType<>(vipCustomer);
//        System.out.println("VIP Customer Details: " + vipCustomerBoundedType.getCustomerDetails());



        /**
         * GenericInterfaceImpl using the GenericInterface<T>
         */

//        Customer customer = new Customer(8001, "John Doe");
//        GenericInterface<Customer> custImpl = new GenericInterfaceImpl<>();
//        custImpl.display(customer);
//
//        Order order = new Order(2001, "Laptop");
//        GenericInterface<Order> orderImpl = new GenericInterfaceImpl<>();  //programming to the interface
//        orderImpl.display(order);
        /**
         * Customer and Order POJO's using the GenericClassTwoParams
         */
          //Create a Customer object
//          Customer customer = new Customer(101, "Joan of Arch");
//          //Create a Order object
//          Order order = new Order(7001, "Macbook");
//
//           //GenericClassTwoParams
//        GenericClassTwoParams<Customer, Order> custOrder =  new GenericClassTwoParams<>(customer, order);
//
//        //Display the intial values for Customer and Order
//        System.out.println("Customer: " + custOrder.getValue());
//        System.out.println("Order: " + custOrder.getSvalue());

        /**
         *

         * Customer POJO using the Generic Class
         *
         */
         //Create a Customer Object
//        Customer customer = new Customer(100, "Alice Smith");
//
//        //Use GenericClass with Customer
//        GenericClass<Customer> customerGeneric = new GenericClass<>(customer);
//
//        System.out.println(customerGeneric.getValue());


        /**
         * Generic Class
         *          //String object
         *         generics.GenericClass<String > stringInstance = new generics.GenericClass<>("Good Morning");
         *         System.out.println(stringInstance.getValue());
         *
         *          //Integer object
         *         generics.GenericClass<Integer> integerInstance = new generics.GenericClass<>(12345);
         *         System.out.println(integerInstance.getValue());
         *
         *         integerInstance.setValue(7890);
         *
         *         System.out.println(integerInstance.getValue());
         */


        /**
         * Generic Method
         *  generics.GenericMethod genericMethod = new generics.GenericMethod();
         *   genericMethod.createArray();
         */

    }
}