package generics;

/**
 * A Generic Method allows you to define a method with a type parameter,
 * making the method flexible for different
 * types without sacrificing type safety.
 */
public class GenericMethod {

    public void createArray(){
        Integer[] intArray = {1,2,3};
        String[] stringArray = {"A", "B","C"};

        printArray(intArray);   //invoke printArray()
        printArray(stringArray);
    }

    //T is any type of object - Generics work with object only.
    public <T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }
}
