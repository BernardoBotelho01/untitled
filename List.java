import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> v=new ArrayList<>();
        for (int i=0;i<=10000;i++){
            v.add(i);
        }
        v.set(0,-1);
        v.remove(10000-1);
        for(int i : v){
            System.out.println(i);
        }
    }
}
