
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=0;
        int num2=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(num1+" ");
            int next=num1+num2;
            num1=num2;
            num2=next;
        }
    }
}
;