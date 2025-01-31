public class Address {

private int streetNum;
private String streetName;
private String cityName;

public Address(int streetNum, String streetName, String cityName){
        this.streetNum=streetNum;
        this.streetName=streetName;
        this.cityName=cityName;
}
public Address(){
    this(0,"","");
}

public Address(Address other){
    this.streetNum=other.streetNum;
    this.streetName= other.streetName;
    this.cityName= other.cityName;
}
public int getStreetNum(){
    return streetNum;
}
public String getStreetName(){
    return streetName;
}
public String getCityName(){
    return cityName;
}

//end of getters
public Address setStreetNum(int streetNum){
    this.streetNum=streetNum;
    return this;
}
public Address setStreetName(String streetName){
    this.streetName=streetName;
    return this;
}
public Address setCityName(String cityName){
    this.cityName=cityName;
    return this;
}

//end of setters


public String toString(){
    return (streetNum + " " + streetName + ", " + cityName + ".");
}

//end of to string

public boolean isEqual(Address other){
    if (this.streetNum==other.streetNum && this.streetName.equalsIgnoreCase(other.streetName) && this.cityName.equalsIgnoreCase(other.cityName)){
        return true;
    }
    else{
        return false;
    }
}

//end of equal

} //end of program
