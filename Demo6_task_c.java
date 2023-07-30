public class Demo6_task_c {
    public static void main(String[] args) {
        
        final String TITLE = "\033[0;1m";
        final String YELLOW = "\033[33m";
        final String WHITE = "\033[0m";
        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        
        System.out.printf("%s+---------------+------------+----------+\n", YELLOW);
        System.out.printf("%2$s|%1$s%3$-15s%2$s|%1$s%4$-12s%2$s|%1$s%5$10s%2$s|\n", TITLE,YELLOW,"CITY","STATE","POPULATION");
        System.out.printf("%s+---------------+------------+----------+\n", YELLOW);
        System.out.printf("%2$s|%1$s%4$-15s%2$s|%1$s%5$-12s%2$s|%3$s%6$,10d%2$s|\n", WHITE,YELLOW,RED,"Los Angeles","California",3966936);
        System.out.printf("%2$s|%1$s%4$-19s%2$s|%1$s%4$-16s%2$s|%3$s%5$,10d%2$s|\n", GREEN,YELLOW,RED,"New \033[0mYork",8336817);
        System.out.printf("%s+---------------+------------+----------+\n", YELLOW);
    
    }
}
