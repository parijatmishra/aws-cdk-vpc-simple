#!/bin/bash
exec java -cp target/classes:$(cat .classpath.txt) net.nihilanth.aws.awscdkvpcsimple.App app $@
