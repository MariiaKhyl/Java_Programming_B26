package day20_04_26_27_2022.address;

public class Address {

    private String street, city, state, zipcode, country;

    public String getStreet(){
        if (street.isBlank()){
            return "It is empty";
        }else{
            return street;
        }
    }
    public void setStreet(String street){
        if (!street.isEmpty()){
            this.street=street;
        }
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state=state;
    }

    public String getZipcode() {
        if (zipcode.length() <= 4){
            return "Too short";
        }else if(zipcode.length()>= 6){
            return "Too long";
        }else{
            return zipcode;
        }
    }

    public void setZipcode(String zipcode) {
        // or   if (zipcode.length()==5)

        this.zipcode = zipcode;
    }

    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public Address(String street, String city, String state, String zipcode,String country){
        setStreet(street);
        setCity(city);
        setState(state);
        setZipcode(zipcode);
        setCountry(country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
