public class StudentMain{
public static void main(String str[]){
StudentDetails student= new StudentDetails();
/*student.data(1,"Sham",90,'A');*/
if(marks>=80){
System.out.println("grade is A");
}else
if(marks>=60 && marks<80){
System.out.println("Garde is B");
/*student.data(1,"Shami",80,'B');*/
}
else{
System.out.println("grade is c");
}
}