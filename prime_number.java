import java.util.Scanner;

class prime_number{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int a = sc.nextInt();

        boolean flag  = true;
        for(int i = 2; i <= a/2; ++i){
            if (a % i == 0) {
                flag = true;
                break;
        }

        if(flag){
            System.out.print(a+ " is a prime number");
        }
        else{
            System.out.print(a+ " is not a prime number");
        }
    }
  }
}
