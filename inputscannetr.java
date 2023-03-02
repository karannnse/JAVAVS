import java.util.Scanner;


public class inputscannetr {
    public static void main(String[] args) {
       System.out.println("taking input from the user");
        Scanner sc=new Scanner(System.in);
      /*  System.out.println("enter num one");
        int a=sc.nextInt();
        System.out.println("enter num two");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("this sum of number: ");
        System.out.println(sum);     */

        String str=sc.nextLine();
        System.out.println(str);
    }
}
