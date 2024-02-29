import java.util.Scanner;
class GradeSystem1 {  
    public static void main(String[] args) {
        double test1, test2, test3, averageScore;
        char letterGrade;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first test score");
        test1 = sc.nextDouble();
        System.out.print("Enter second test score");
        test2 = sc.nextDouble();
        System.out.print("Enter third test score");
        test3 = sc.nextDouble();

        averageScore = (test1 + test2 + test3) / 3;
        System.out.println("Average score:" + averageScore);

        if (averageScore >= 90 && averageScore <= 100) {
            letterGrade = 'A';
            System.out.println("Letter grade" + letterGrade);
        } else if (averageScore >= 80 && averageScore <= 89) {
            letterGrade = 'B';
            System.out.println("Letter grade" + letterGrade);
        } else if (averageScore >= 70 && averageScore <= 79) {
            letterGrade = 'C';
            System.out.println("Letter grade" + letterGrade);
        } 
          else if (averageScore >= 60 && averageScore <= 69)   
        {
            letterGrade = 'D';
            System.out.println("Letter grade" + letterGrade); 
        }
        else if (averageScore < 60){                             
            letterGrade = 'E';
            System.out.println("Letter grade" + letterGrade);
        }
         else{
            System.out.println("The score you entered is not valid!");
        }
    }
}

  // after completinng your grade calculation you are need to close main method and class
//like this
//  }   this is for method
// }     this is for class
