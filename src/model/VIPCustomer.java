package model;

public class VIPCustomer extends Customer {


    private String vipLevel;

    public VIPCustomer(int id, String name, String vipLevel){
        super(id, name);   //super invokes the parent constructor and  must be first line in child class constructor
        this.vipLevel = vipLevel;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    @Override
    public String toString() {
        return "VIPCustomer{id=" + getId() + ", name='" + getName() + "', vipLevel='" + vipLevel + "'}";
    }

}
