public class Student extends Person{
private int ID;
private double GPA;


public Student(){
   // super("Windsor",7, new Address(57, "Franklin Street", "Duxbury"));
    super();
    this.ID=0;
    this.GPA=0;
}
public Student(String Name, int Age, Address Address, int ID, double GPA){
    super(Name, Age, Address);
    this.ID=ID;
    this.GPA=GPA;
}

public String toString(){
    return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nAddress: " + this.getAddress() + "\nID: " + ID + "\nGPA: " + GPA;
}


}
