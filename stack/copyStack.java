package stack;



import java.util.Scanner;
import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack : ");
        int n =sc.nextInt();
        System.out.println("Enter the values of stack : ");

        while(n>0){
            st.push(sc.nextInt());
            n--;
        }
        System.out.println(st);
        while(st.size()>0){
            int a=st.pop();
            st1.push(a);
        }
        System.out.println(st1);
        while(st1.size()>0){
            int a= st1.pop();
            st2.push(a);
        }
        System.out.println(st2);

    }

}
