
public class FormatTest {

    public static void main(String[] args) {
        String name = "Joe Bloggs";
        Integer age = 20;
        Double height = 2.50;
        String myDetails = String.format("%-20s%10d%12.2f", name, age, height);
        System.out.println(myDetails);
    }
}
