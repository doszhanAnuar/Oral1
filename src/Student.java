public class Student  {
    private String firstName;
    private String lastName;
    private String group;
    private int count = 0;
    private double averageMark;
    Student(String firstName, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }



    void getScholarship(){
        if(averageMark >= 5){
            count = 60000;
            System.out.println("Student "+firstName+" take " + count);
        }else{
            count = 36000;
            System.out.println("Student " +firstName+" take " + count);
        }

    }
}
