package de.htwsaar.programmierung3;
import com.google.common.base.Joiner;


public class GuaveJoiner {

    public static void main(String[] args) {

        Joiner joiner = Joiner.on(", ");
        String result = joiner.join(args);
        System.out.println("Hellooooooo" + result);

    }
}
