import java.util.Scanner;
public class EvenOdd{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("ENter Number");
//reading value from the 
int num=sc.nextInt();
//method calling
findEvenOdd(num);
}

public static void findEvenOdd(int num)
{
if(num%2==0){
System.out.println(num+ "Even Number");
}
else{
System.out.println(num+ "odd Number");

}
}
}


