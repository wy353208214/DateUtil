
public class DateUtil {

    public static void main(String[] args) {
        DateUtil.getInstance().hello();
    }

    private DateUtil() {

    }

    public static DateUtil getInstance() {
        return new DateUtil();
    }

    public void hello() {
        System.out.println("hello world");
    }
}
