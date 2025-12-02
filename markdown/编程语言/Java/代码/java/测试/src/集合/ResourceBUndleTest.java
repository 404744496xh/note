package 集合;

import java.util.*;

public class ResourceBUndleTest {
    public static void main(String[] args) {
        ResourceBundle rb=ResourceBundle.getBundle("test");
        System.out.println(rb.getString("name"));
        System.out.println(rb.getString("sex"));
        System.out.println(rb.getString("age"));
    }
}
