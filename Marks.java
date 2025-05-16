import java.util.Scanner;
 public class Marks{
    public void display(){
    String P;
    System.out.println("enter your marks");
    Scanner scan= new Scanner(System.in);
    int M=scan.nextInt();
   
    if (M>=90&&M<=100){
        P="A+";
    }
    else if (M>=80&&M<90){
        P="A";
    }
    else if (M>=70&&M<80){
        P="B+";
    }
    else if (M>=60&&M<70){
        P="B";
    }
    else if (M>=50&&M<60){
        P="C+";
    }
    else if (M>=45&&M<50){
        P="C";
    }
    else if(M<45){
        P="F";
    }
    else{
        P="invalid input";
    }
    
    System.out.println("the grade you've gotten is "+P);
    scan.close();
 }
   
 public static void main(String[] args){
    Marks calc=new Marks();
    calc.display();
 }
 
}
