public class Driver {
    public static void main(String[] args){
        Address a1 = new Address(57, "Franklin Street", "Duxbury");
        Person p1 = new Person("Zack", 19, a1);
        Person p2 = new Person("Matthew", 14, a1);

        p1.setAddress(p1.getAddress().setStreetNum(57));
        p1.setAddress(p1.getAddress().setStreetName("Summerhill Av"));
        p1.setAddress(p1.getAddress().setCityName("Montreal"));

        Student s1 = new Student("Liv", 22, a1, 487234, 3.2);
        Student s2 = new Student();
        Student s3 = new Student(p1.getName(), p1.getAge(), a1, 42, 69);

        System.out.print(p1.toString() +"\n" + p2.toString() + "\n" + s1.toString() +"\n" + s2.toString() +"\n" + s3.toString());
    }
}
