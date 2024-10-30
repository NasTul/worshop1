
/**
 * Write a description of class StudentMark here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class StudentMark
{
    public static void main(String[] args){
        
        int numberOfStudents = 5; 
        
        float[] marks = new float[numberOfStudents]; 
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Give marks for 5 students");
        
        for(int i = 0; i <numberOfStudents; i++ ){
        
            float temp = scanner.nextFloat();
            
            if(temp < 0 || temp > 30){
                
                System.out.println("Invalide marks, please enter again");
                continue;
            }
            
            marks[i] = temp;
            
            
        }
        
        
        System.out.println("Entered marks");
        for(int i = 0; i <numberOfStudents; i++ ){
        
            
            System.out.println(marks[i]);
            
            
        }
        
        
        
        float total = 0;
        
        for(int i = 0; i <numberOfStudents; i++ ){
        
            total = total + marks[i];
            
                        
        }
        
        float mean = 0; 
        
        mean = total / numberOfStudents;
        
        System.out.println(mean);
        
        
        float sumdiff = 0;
        
        for(int i = 0; i <numberOfStudents; i++ ){
        
            sumdiff = sumdiff + (marks[i] - mean) * (marks[i] - mean);
            
            sumdiff = sumdiff /  numberOfStudents; 
            
            
        }
        
        
        
        
    
    }
    
}
