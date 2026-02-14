import java.util.ArrayList;
public class stackusingarraylist {

    ArrayList<Integer> list = new ArrayList<>();
    //push
    public static void push(int value){
        list.add(value);
    }
    //pop
    public static void pop(){
        if(list.size()==0){
            System.out.println("stack is empty");
           return;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        System.out.println()
    }
   public static void main(String args[]){

   }
}