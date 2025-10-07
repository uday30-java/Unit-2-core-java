import java.util.Scanner;

class Scannermethod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two num:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Largest:"+(a > b ? a : b));
        System.out.println(a > b ? "A is the Biggest value" : "B is the Biggest value");

        sc.close();
    }

    
}
