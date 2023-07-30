public class Demo4 {
    public static void main(String[] args) {
        
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        String white = "\033[0m";
        String colour = "\033[";

        System.out.printf("%1$s35m%3$d%2$s/%1$s33m%4$d%2$s/%1$s31m%5$d%2$s %1$s32m%6$d%2$s:%1$s36m%7$d%2$s:%1$s30m%8$d%2$s\n", colour,white,month,day,year,hour,minute,second);

    }
}
