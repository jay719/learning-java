
public class HelloGoodbye {
    static void Hello(String fname1,String fname2) {
        System.out.println("Hello " + fname1 + " and " + fname2 + ".");

    }
    static void Goodbye(String fname1,String fname2){
        System.out.println("Goodbye " + fname2 + " and " + fname1 + "." );
    }
    public static void main(String[] args) {
        Hello(args[0],args[1]);
        Goodbye(args[0],args[1]);
    }

} 