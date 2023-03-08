package lamdaExpression;
@FunctionalInterface
interface FirstName{
    public abstract String checkName(String name);
     class UserRegistration {
        public static void main(String[] args) {
            // Lambda expression with single parameter.
            FirstName name1 = (name) -> {
                return  name;
            };
            System.out.println(name1.checkName("Satya"));

        }
    }}