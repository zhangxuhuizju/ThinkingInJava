package chapter2;
import static net.mindview.util.Print.*;
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        print("Test print");
    }
}