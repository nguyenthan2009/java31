import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "anhyeuemnhieulam";
        int count= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập một kí tự bất kì từ bàn phím");
        int tu= sc.nextLine().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==tu){
                count++;
            }

        }
        System.out.println("số lượng kí tự vừa nhập có trong chuỗi là" +count);

    }
}
