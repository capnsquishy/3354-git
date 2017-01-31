package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide only integers to add");
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
