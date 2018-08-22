package net.nihilanth.aws.awscdkvpcsimple;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public class App extends software.amazon.awscdk.App {
    public App(@Nullable List<String> argv) {
        super(argv);
        new SimpleVPCStack(this, "simple-vpc");
    }

    public static void main(final String[] argv) {
        System.out.println(new App(Arrays.asList(argv)).run());
    }
}
