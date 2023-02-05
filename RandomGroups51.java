import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomGroups51{
    public static void main(String[] args) {
        System.out.println("Working Fine");

        ArrayList<String> arr  = readStudents();
        System.out.println(arr);
    }
    public static ArrayList<String> readStudents(){
        ArrayList<String> arr  = new ArrayList<>();

        try {
            File f = new File("Student List.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                arr.add(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return arr;
    }
}