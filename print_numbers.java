
public class print_numbers {
    public static void main(String[] args) {
        // decleration and initialization of an output string
        String[] outString = {"Baz", "inga!"};
        
        int mod2;
        int mod5;

        // loop to go through numbers 0 to 100 (without boundaries)
        for(int i = 1; i < 100; i++) {
            
            mod2 = i % 2;
            mod5 = i % 5;

            if(mod2 == 0) {
                System.out.println(outString[0]);
            }
            if(mod5 == 0) {
                System.out.println(outString[1]);
            }
            if(mod2 == 1 && mod2 == 1) {
                System.out.println(i);
            }

        }
    }
}
