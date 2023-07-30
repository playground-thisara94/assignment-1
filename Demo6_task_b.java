public class Demo6_task_b {
    public static void main(String[] args) {

        final String TITLE = "\033[34;1m";
        final String BORDER = "\033[33m";
        final String NAME = "\033[0m";
        final String AGE = "\033[31m";
        
        System.out.printf("%s+----------+---+\n", BORDER);
        System.out.printf("%2$s|%1$s%3$-10s%2$s|%1$s%4$3s%2$s|\n", TITLE,BORDER,"NAME","AGE");
        System.out.printf("%s+----------+---+\n", BORDER);
        System.out.printf("%2$s|%1$s%4$-10s%2$s|%3$s%5$3d%2$s|\n", NAME,BORDER,AGE,"Alice",24);
        System.out.printf("%2$s|%1$s%4$-10s%2$s|%3$s%5$3d%2$s|\n", NAME,BORDER,AGE,"Bob",30);
        System.out.printf("%s+----------+---+\n", BORDER);

    }
}
