import java.util.Scanner;




public class DecisionMaker {
    // input scanner 
    private Scanner in;
    
    public DecisionMaker() {
        // create the scanner to scan the inputs
        in = new Scanner(System.in);
    }
    // to find whether the number is odd or even
    private boolean isOdd(int number){
        int x = number % 2;
        boolean odd = true;
        if (x==0) odd = false;
        return odd;
    }
    
    public static void main(String[] args) {
        DecisionMaker dm = new DecisionMaker();
        System.out.print("Hello! Enter your name:");
        // get the name of the user
        String name = dm.in.nextLine();
        // to run continuously
        while (true) {            
            System.out.print("\n"+name+", enter a number between 1 and 100:");
            // read the user input number
            int number = dm.in.nextInt();
            // if the number is not valid re start the process
            if(number>=100 || number<=1){
                System.out.println ("\n"+ name + ", you should enter a number between 1 and 100:");
                continue;
            }
            // decide the output
            String output = null;
            if(dm.isOdd(number)){
                // odd
                if(number>60){
                    output = "Odd and over 60.";
                }else{
                    output = number+" and Odd.";
                }
            }else{
                // even
                if (number>=2 && number<25) {
                    output = "Even and less than 25.";
                }else if((number>=26 && number<60)){
                    output = "Even.";
                }else if((number>=60)){
                    output = number+" and Odd.";
                }
            }
            // print the output
            System.out.println("\nOutput:"+output);
            // print the continuous option
            System.out.print("\nContinue?(y/n):");
            // read the user input(y or n)
            dm.in.nextLine();
            String option = dm.in.nextLine();
            if(option.equalsIgnoreCase("y")){
                continue;
            }else if(option.equalsIgnoreCase("n")){
                System.out.println("\nBye, "+name+"!");
                break;
            }
        }
    
    }
}