package lambdaExpression;

@FunctionalInterface
interface LambdaExpression {
    public abstract String checkGmail(String gmailId);

    class UserRegistration {
        public static void main(String[] args) {
            // Lambda expression with single parameter.
            LambdaExpression gmailId1 = (gmailId) -> {
                return "gmail:"+ gmailId;
            };
            System.out.println(gmailId1.checkGmail("sspra143@gmail"));

        }
    }
}