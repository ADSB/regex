import java.util.regex.Pattern;

public class RegexMonger {
    public static Pattern basicNumber = Pattern.compile("(\\+\\d)?\\s*\\(?\\d{3}?\\)?\\s*-?\\s*\\d{3}\\s*-?\\s*\\d{4}");
    /*
    * Conforms to the NANP (North American Numbering Plan) Specification
    * Does not match special numbers such as 911.
    * http://en.wikipedia.org/wiki/North_American_Numbering_Plan
    * */
    public static Pattern rigorousNumber = Pattern.compile("^(?:(?:\\+?1\\s*(?:[.-]\\s*)?)?(?:\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?([0-9]{4})(?:\\s*(?:#|x\\.?|ext\\.?|extension)\\s*(\\d+))?$");

    public static boolean isTelephoneNumber(String input) {
        return rigorousNumber.matcher(input).matches();
    }

}
