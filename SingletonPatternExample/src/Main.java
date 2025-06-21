public class Main {
    public static void main(String[] args) {
    Logger log1 =  Logger.getLogger();
    Logger log2 =  Logger.getLogger();
    log1.log("First Log message");
    log2.log("Second Log message");
    if(log1 == log2) {
        System.out.println("both instances are the same");
        }
    else{
        System.out.println("both instances are not the same");
    }
    }
}