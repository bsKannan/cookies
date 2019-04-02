import java.util.*;
class Student{
    int id;
    String name;

    public Student(int id,String name){
        this.id=  id;
        this.name = name;
    }
}

public class Test{
    public static void main(String args[]){
        Student s1=new Student(101,"Sonoo");  
        Student s2=new Student(102,"Ravi");  
        Student s3=new Student(103,"Hanumat");  

        ArrayList<Student> al = new ArrayList<Student>();

        al.add(s1);
        al.add(s2);
        al.add(s3);

        // System.out.println(al);
        Iterator itr = al.iterator();

        while(itr.hasNext()){
            Student st=(Student)itr.next();  
            System.out.println(st.id+" "+st.name);  
        }

    }
}



// import java.util.*;

// public class Test {

//     public static void main(String args[]) {
//         List<Integer> numbers = new ArrayList<Integer>();
//         numbers.add(61);
//         numbers.add(18);
//         numbers.add(141);
//         numbers.add(147);
//         numbers.add(36);

//         System.out.println("Before : " + numbers);
//         Collections.sort(numbers); //sorting for accending order
//         System.out.println("After : " + numbers);

//         Iterator<Integer> itr = numbers.iterator();
//         while(itr.hasNext()){
//             Integer num = itr.next();
//             if(num %2 != 0){
//                 itr.remove();
//             }
//         }
//         System.out.println(numbers);
//     }
// }