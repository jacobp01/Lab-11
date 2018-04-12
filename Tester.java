public class Tester{
public void main(){
 Person jim = new Person("Jim", 99, "M");
 System.out.println(jim);
 
 Student jim2 = new Student("Jim", 99, "M", "asaddadsa", 0.45);
 System.out.println(jim2);
 
 Teacher jim3 = new Teacher("Jim", 99, "M", "Jim Studies", 10);
 System.out.println(jim3);
 
 CollegeStudent jim4 = new CollegeStudent("Jim", 99, "M", "asdasda", 0.3, "Jimrochemistry", 155);
 System.out.println(jim4);
}
}