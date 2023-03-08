package lambdaExpression;

@FunctionalInterface
interface LambdaExpression {
    public abstract String checkPhoneNumber(String phoneNumber);

    class UserRegistration {
        public static void main(String[] args) {
            // Lambda expression with single parameter.
            LambdaExpression phoneNumber1 = (phoneNumber) -> {
                return phoneNumber;
            };
            System.out.println(phoneNumber1.checkPhoneNumber("+91789543456"));

        }
    }
}