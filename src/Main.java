import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Paul Kaelo", "Alhimik");
        reader.takeBook();
        String[] nums = new String[]{ "Doszhan Anuar", "Musin Adil", "Tagaibek Sayat", "Yerezhepov Nurbulot" };
        for(int i = 0; i < nums.length; i++){
            Scanner type = new Scanner(System.in);
            String tp = type.nextLine();
            int number = Integer.parseInt(tp);
            Student bara = new Student(nums[i], number);
            Asperant asp = new Asperant(nums[i], number);
            bara.getScholarship();
            asp.getScholarship();
        }
    }
}