package home_work_day52.entertainment;

public class Entertainment {

    String name, company;

    public Entertainment(String name, String company){
        this.name=name;
        this.company=company;
    }

    @Override
    public String toString() {
        return "Entertainment{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
    /*
create a class Entertainment
instance variables:
- name (String) [type of entertainment]
- company (String)
constructor:
- initialize both variables
 */


}
