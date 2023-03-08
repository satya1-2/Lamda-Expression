package lamdaExpression;

public class UserRegistrations {
    public static void main(String[] args) {
        System.out.println("welome to lamada expression Solutions");
    }
}
interface FirstName{
    public String checkName(String name);
    public class UserRegistration {
        public static void main(String[] args) {
            // Lambda expression with single parameter.
            FirstName name1 = (name) -> {
                return  name;
            };
            System.out.println(name1.checkName("Satya"));

        }
    }}