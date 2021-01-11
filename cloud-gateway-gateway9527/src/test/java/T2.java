import java.time.ZonedDateTime;

public class T2 {

    public static void main(String[] args) {
        // 默认时区
        ZonedDateTime zbj = ZonedDateTime.now();
        // 2021-01-11T20:22:48.852+08:00[Asia/Shanghai]
        System.out.println(zbj);
    }
}
