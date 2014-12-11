public class RegexTester {

    public static void main(String[] args) {

        PatMatchI validator = new RegexMonger();

        System.out.println(validator.isUSPhoneNumber("+1(301) 538-3207 ext 4"));
        System.out.println(validator.isUSPhoneNumber("+13015383207"));
        System.out.println(validator.isUSPhoneNumber("+1(301)5383207"));
        System.out.println(validator.isUSPhoneNumber("+1 ( 301 ) 538 - 3207"));
        System.out.println(validator.isUSPhoneNumber("1 301 538 3207"));
        System.out.println(validator.isUSPhoneNumber("+(301)5383207"));

        System.out.println();

        System.out.println(validator.isZipCode("20906-8372"));
        System.out.println(validator.isZipCode("20906"));
        System.out.println(validator.isZipCode("20906-"));

    }
}
