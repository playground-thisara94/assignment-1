public class Demo6_task_d {
    public static void main(String[] args) {
        
        final String TITLE = "\033[0;1m";
        final String YELLOW = "\033[33m";
        final String WHITE = "\033[0m";
        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        final String BLUE = "\033[34m";
        
        System.out.printf("%s+----------+--------+------+\n", YELLOW);
        System.out.printf("%2$s|%1$s%3$-10s%2$s|%1$s%4$8s%2$s|%1$s%5$6s%2$s|\n", TITLE,YELLOW,"ITEM","QUANTITY","PRICE");
        System.out.printf("%1$s+%2$s----------%1$s+---------+%2$s-----%1$s+\n", YELLOW,GREEN);
        System.out.printf("%2$s|%1$s%6$-10s%2$s|%4$s%7$8d%2$s|%5$2s$%3$s%8$5.2f%2$s|\n", WHITE,YELLOW,RED,BLUE,GREEN,"Apples",5,0.99);
        System.out.printf("%2$s|%1$s%6$-10s%2$s|%4$s%7$8d%2$s|%5$2s$%3$s%8$5.2f%2$s|\n", WHITE,YELLOW,RED,BLUE,GREEN,"Oranges",10,1.49);
        System.out.printf("%1$s+%2$s----------%1$s+---------+%2$s-----%1$s+\n", YELLOW,GREEN);

    }
}
