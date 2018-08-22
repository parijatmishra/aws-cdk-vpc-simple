package net.nihilanth.aws.awscdkvpcsimple;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;

import javax.annotation.Nullable;

public class SimpleVPCStack extends Stack {
    public SimpleVPCStack(@Nullable App parent, @Nullable String name) {
        super(parent, name);
    }
}
