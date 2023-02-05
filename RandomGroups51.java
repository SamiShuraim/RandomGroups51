import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomGroups51{
    public static void main(String[] args) {
        System.out.println("Working Fine");

        ArrayList<String> arr  = readStudents();
        System.out.println(arr);

        randomGroups(arr, 5);
        System.out.println("Testing commits");
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


    public static void randomGroups(ArrayList<String> students,int numOfGroups){

        Collections.shuffle(students);
        ArrayList<ArrayList<String>> groups = new ArrayList<>();
        
        for (int i = 0; i< numOfGroups;i++){
            groups.add(new ArrayList<String>());
        }
        for (int i = 0; i< students.size();i++){
            groups.get(i%numOfGroups).add(students.get(i));
        }

        System.out.println(groups);
    }
}