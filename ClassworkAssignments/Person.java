public class Person {

    private String Name;
    private int Age;
    private Address Address;


    public Person(){
        this("", 0, new Address());
    }


    public Person(String Name, int Age, Address Address){
        this.Name=Name;
        this.Age=Age;
        this.Address=Address;

    }

    public void setName(String Name){
        this.Name=Name;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
    public void setAddress(Address Address){
        this.Address=Address;
    }
    public String getName(){
        return this.Name;
    }
    public int getAge(){
        return this.Age;
    }

    public Address getAddress(){
        return new Address(this.Address);
    }

    public boolean isEqual(Person other){
        if (this.Address.isEqual(other.Address) && this.Age==other.Age && this.Name.equalsIgnoreCase(other.Name)){
            return true;
        }
        else{
            return false;
        }
    }
    public Person(Person otherPerson){
        this(otherPerson.Name, otherPerson.Age, new Address(otherPerson.Address));
    }
    public String toString(){
        return "Name: " + Name + "\nAge: " + Age + "\nAddress: " + Address;
    }




}
