package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            if(!Character.isDigit(args[0]) && !args[0].equals("-"))
                System.err.println("Please provide only integers to add");
            else if(args.length < 2)
                System.err.println("Not enough arguments were input. Please enter two or more integers to add, or use \"-\" as the first argument.");
            else
                System.err.println("Be sure that all arguments are integers, or the first argument is a \"-\"");
        }
    }

    private static int addArguments(String[] args) {
        int sum = 0;
        for(int i = 0; i < args.length - 1; i++)
        {
            sum += Integer.valueOf(args[i]);
        }

        return sum;
    }
}
