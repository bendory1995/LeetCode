import java.util.*;
public class ImplementQueueUsingStack {
    public static Stack<Integer> input = new Stack<Integer>();
    public static Stack<Integer> output  = new Stack<Integer>();
    public static void main(String[] args){

    }
    public static void push(int x){
        input.push(x);
    }
    public static int pop(){
        if(output.empty()){
            output.peek();
        }
        return output.pop();
    }
    public static int peek(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public static boolean empty(){
        return input.isEmpty() && output.isEmpty();
    }
}
