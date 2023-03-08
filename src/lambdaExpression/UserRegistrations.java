package lambdaExpression;

@FunctionalInterface
interface LambdaExpression {
    public abstract String checkPassword(String password);

    class UserRegistration {
        public static void main(String[] args) {
            // Lambda expression with single parameter.
            LambdaExpression password1 = (password) -> {
                return "password:" + password;
            };
            System.out.println(password1.checkPassword("Satya124@3456.com"));

        }
    }
}