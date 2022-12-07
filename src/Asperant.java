public class Asperant {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;
    int count = 0;

    Asperant(String firstName, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    void getScholarship(){
        if(averageMark >= 5){
            count = 190000;
            System.out.println("Asperant " + firstName + " take " + count);
        }else{
            count = 100000;
            System.out.println("Asperant " +firstName+ " take " + count);
        }
    }
}
