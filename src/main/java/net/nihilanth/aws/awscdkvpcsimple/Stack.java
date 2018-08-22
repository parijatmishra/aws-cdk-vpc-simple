package net.nihilanth.aws.awscdkvpcsimple;

import software.amazon.awscdk.App;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public class Stack extends App {
    public Stack(@Nullable List<String> argv) {
        super(argv);
    }

    public static void main(final String[] argv) {
        System.out.println(new Stack(Arrays.asList(argv)).run());
    }
}
