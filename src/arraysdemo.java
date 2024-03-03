import java.util.Scanner;
public class arraysdemo {
    public static void main(String[] args) {
        int[] arr={12,14,16,24,42};
        @SuppressWarnings("resource")
        Scanner input =new Scanner(System.in);
        System.out.println("Choose an operation(+,-,/,*,%)");
        input.nextLine();
        //read the operation
        String operation=input.nextLine();
        //check the decision
        if (operation.equals("+")){
            //sum
            int[] sum= {arr[2] + arr[3]};
            System.out.println("Your sum is" +sum);

        }
        else if (operation.equals("-")){
            //sum
            int[] difference= {arr[2] - arr[3]};
            System.out.println("Your difference is" +difference);

    }
         else if (operation.equals("/")){
        //sum
        int[] quotient= {arr[2] / arr[3]};
        System.out.println("Your quotient is" +quotient);
    
}
         else if (operation.equals("*")){
    //sum
    int[] product= {arr[2] * arr[3]};
    System.out.println("Your product is" +product);

}
         else if (operation.equals("%")){
    //sum
    int[] modulus= {arr[2] % arr[3]};
    System.out.println("Your modulus is" +modulus);


}
         else{
    System.out.println("operation not found");
}
    }
}