

    public class Teacher extends Person{
      private String mySub; // Student Id Number
      private double mySal; // grade point average

      // constructor
      public Teacher(String name, int age, String gender,
                String sub, double sal){
        // use the super class' constructor
        super(name, age, gender);

        // initialize what's new to Student
        mySub = sub;
        mySal = sal;
      }

      public String getsub(){
        return mySub;
      }

      public double getsal(){
        return mySal;
      }

      public void setsub(String sub){
        mySub = sub;
      }

      public void setsal(double sal){
        mySal = sal;
      }

      // overrides the toString method in the parent class
      public String toString(){
        return super.toString() + ", Subject: " + mySub + ", salary: " + mySal;
      }
    }
