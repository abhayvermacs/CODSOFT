import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int subjects = sc.nextInt();
        int total_marks = 0;
        int marks[] = new int[subjects];
        System.out.println("Enter the marks of subjects out of 100");
        for(int i = 0; i<marks.length; i++){
            marks[i] = sc.nextInt();
            total_marks += marks[i];
        }
        int average_percentage = total_marks/subjects;
        String grade;
        if(average_percentage > 80 && average_percentage <=100){
            grade = "A";
        }
        else if(average_percentage > 65 && average_percentage <=80){
            grade = "B";
        }
        else if(average_percentage > 50 && average_percentage <=65){
            grade = "C";
        }
        else if(average_percentage > 33 && average_percentage <=50){
            grade = "D";
        }
        else{
            grade = "Fail";
        }
        System.out.println("Your Overall Result : ");
        System.out.println("Total marks obtained : " + total_marks);
        System.out.println("Average percentage : " + average_percentage);
        System.out.println("Grade : " + grade);
        sc.close();
    }
}
