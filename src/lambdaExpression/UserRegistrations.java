package lambdaExpression;
@FunctionalInterface
interface LambdaExpression{
    public abstract String checkLastName(String name);
     class UserRegistration {
        public static void main(String[] args) {
            // Lambda expression with single parameter.
            LambdaExpression lastName1 = (name) -> {
                return  name;
            };
            System.out.println(lastName1.checkLastName("Yadav"));

        }
    }}