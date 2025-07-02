public class DefangIPaddress {
    public static void main(String[] args) {
        String input = "255.100.50.0" ;
        String oldspliter = ".";
        String newspliter = "[.]";

        String output = input.replace(oldspliter, newspliter);

        System.out.println("The new output is : " +output);

    }
}
