import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int [][] m= new int[3][3];
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                m[i][j]= t.nextInt();

            }

        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
