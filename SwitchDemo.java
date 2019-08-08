import java.util.Scanner;
public class SwitchDemo{
 public static void main(String str[]){
int ch;
int num1;
int num2;
int result=0;

Scanner scan=new Scanner(System.in);
while(true){
System.out.println("Enter the num 1");
num1=scan.nextInt();
System.out.println("Enter the num 2");
num2=scan.nextInt();
System.out.println("1. Add \n 2.subtract \n 3.Divide \n 4.Multiply\n 5.exit");
ch=scan.nextInt();

switch(ch){
case 1: result=num1+num2;
        break;

case 2: result=num1-num2;     
        break;

case 3:result=num1/num2;        
        break;

case 4: result=num1*num2;
        break;

case 5: System.exit(0);

default: System.out.println(" values between 1 to 5");
  }
System.out.println("the result is"+result);
 }
}
}
