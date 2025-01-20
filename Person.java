public class Person {

    private String Name;
    private int Age;
    private String Address;


    public Person(){
        this ("", 0, "");
    }

    public Person(String Name, int Age, String Address){
        this.Name=Name;
        this.Age=Age;
        this.Address=Address;

    }

    public void setName(){
        this.Name=Name;
    }
    public void setAge(){
        this.Age=Age;
    }
    public void setAddress(){
        this.Address=Address;
    }
    public String getName(){
        return this.Name;
    }
    public int getAge(){
        return this.Age;
    }
    public String getAddress(){
        return this.Address;
    }
    public boolean isEqual(Person other){
        if (this.Address.equalsIgnoreCase(other.Address) && this.Age==other.Age && this.Name.equalsIgnoreCase(other.Name)){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "Name: " + Name + "\nAge: " + Age + "\nAddress: " + Address;
    }




}
