import java.util.Scanner;
public class GradeCalc {
    public static String gradeclac(float percentage){
        //Grade Caluclate
        if(percentage>=96 && percentage<=100){
            return "A+";
        }
        else if(percentage>=91 && percentage<=95){
            return "A";
        }
        else if(percentage>=86 && percentage<=90){
            return "B+";
        }
        else if(percentage>=81 && percentage<=85){
            return "B";
        }
        else if(percentage>=76 && percentage<=80){
            return "C+";
        }
        else if(percentage>=71 && percentage<=75){
            return "C";
        }
        else if(percentage>=66 && percentage<=70){
            return "D+";
           }
           else if(percentage>=61 && percentage<=65){
            return "D";
        }
        else if(percentage>=56 && percentage<=60){
            return "E+";
        }
        else if(percentage>=51 && percentage<=55){
            return "E";
        }
        else if(percentage>=40){
            return "Pass";
        }
        else{
            return "Fail";
        }
     } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int totalsub;
        System.out.print("How many subject you have: ");
        totalsub = sc.nextInt();
        int score[] = new int[totalsub];
        int totalscore = 0;

        for(int i=0; i < totalsub;i++){
            System.out.print("\nEnter your marks in subject "+(i+1)+": ");
            score[i] = sc.nextInt();
            totalscore += score[i];
        }
        //percentage calculate
        float avgpercentage = (float)totalscore/(totalsub*100)*100;

        //Result
        System.out.println("Your Result is Here....");
        System.out.println("Total Marks obtained: "+totalscore);
        System.out.println("Percentage Obtained: "+avgpercentage);
        String grade = gradeclac(avgpercentage);
        System.out.println("Grade : "+grade);
    } 
}
