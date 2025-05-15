import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {
        Locale zhLocale = new Locale("zh");
        Locale enLocale = new Locale("en");
        Locale jaLocale = new Locale("ja");

        ResourceBundle rb = ResourceBundle.getBundle("messages",jaLocale);
        ResourceBundle rb2 = ResourceBundle.getBundle("messages",zhLocale);


        IBIO.output(rb.getString("greeting"));
        IBIO.output(rb.getString("goodbye"));
        IBIO.output(rb2.getString("greeting"));

    }
}
