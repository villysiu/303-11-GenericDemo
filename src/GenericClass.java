public class GenericClass <T>{

    private T value;

    public GenericClass(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void displayInfo(){

    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "value=" + value +
                '}';
    }
}
