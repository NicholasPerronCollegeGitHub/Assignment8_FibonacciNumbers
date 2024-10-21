public class App {
    public static void main(String[] args) throws Exception {
        int length;
        int num1 = 0;
        int num2 = 1;
        if (args.length > 0){
            try {
                length = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Your argument must be an integer.");
                
            }
            for(int i = 0; i < length; i++){
                int temp1 = num1;
                int temp2 = num2;
                num1 = temp2;
                num2 = temp1 + temp2;
            }
            System.out.println(num1);
        } else{
            throw new NullPointerException("Please input an integer as a command line argument.");
        }
    }
}
