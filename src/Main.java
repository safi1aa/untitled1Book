import com.sun.tools.attach.VirtualMachine;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.getValue();
        System.out.println(counter.getValue());
        counter.c();
        System.out.println(counter.getValue());
        counter.s();
        System.out.println(counter.getValue());
    }
}