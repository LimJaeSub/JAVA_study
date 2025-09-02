package ClassData_01;
import java.io.*;

public class ClassTest1  {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StudentClass[] stdarr = new StudentClass[3];

        for(int i=0;i<stdarr.length;i++){
            String name = bf.readLine();
            int age = Integer.parseInt(bf.readLine());
            int grade = Integer.parseInt(bf.readLine());

            stdarr[i] = new StudentClass();
            stdarr[i].name = name;
            stdarr[i].age = age;
            stdarr[i].grade = grade;
        }

        for(StudentClass std : stdarr){
            System.out.println(std.toString());
        }
    }

}
