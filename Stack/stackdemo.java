import java.util.Scanner;
import java.util.Arrays;
class stackdemo{
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the stack");
        Stack s1=new Stack(sc.nextInt());
        while (true){
            System.out.println("push--> 1 or pop--> 2 or end--> press any");
            num=sc.nextInt();
            if (num==1){
                System.out.println("enter a number to push");
                s1.push(sc.nextInt());
            }
            else if (num==2){
                System.out.println(s1.pop());
            }
            else{
                break;
            }
        }
        System.out.println(Arrays.toString(s1.arr));    
    }
    
}
