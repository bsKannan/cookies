//Java HashMap with User defined objects
import java.util.*;

class Employee{
    private Integer id;
    private String name;
    private String city;
    
    public Employee(Integer id,String name,String city){
    
            this.id = id;
            this.name = name;
            this.city = city;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }

    // @Override

    public String toString(){
        return "Employee{" + "name='" +name +'\''+", city='" + city +'\''+'}';
    }
}

public class HashMapUserDefinedObjectExample {
    public static void main(String[] args) {
            Map<Integer, Employee> employees = new HashMap<>();
            employees.put(1001 , new Employee(1001, "Kannan", "Salem") );
            employees.put(1002 , new Employee(1002, "Vas", "Bangalore") );
            employees.put(1003 , new Employee(1003, "Bala", "Chennai") );

            System.out.println(employees);
    }
}