# aws-cdk-vpc-simple
A simple, low-cost but low-redundancy VPC template using AWS CDK - Java.

## Pre-requisites

You need to have the following software installed:

- [Apache Maven](https://maven.apache.org/)
- [AWS Cloud Development Kit](https://awslabs.github.io/aws-cdk/index.html)
- [AWS CLI](https://aws.amazon.com/cli/)

## Usage

### Credentials and Region

To generate stacks and deploy them, CDK needs your AWS credentials,
and requires you to specify an AWS region.

The easiest way to define credentials and region is via
the AWS CLI's configuration.  Use `aws configure` if you
have not already done so, and specify an AWS access key ID,
secret access key and a default region.  See the CDK docs
for other ways to specify these properties.

### Compiling

Compile the CDK app and stacks:

```
mvn compile
cdk ls -l
```

The second command should give an output like this:

```
-
    name: simple-vpc
    environment:
        name: 825739414361/us-east-1
        account: '825739414361'
        region: us-east-1
```

### Deploying

Run the following to generate the CloudFormation template
for the stack named `simple-vpc` (since this is the only
stack, you can also leave out `simple-vpc`).

```
cdk synth simple-vpc
```

If you have previously deployed this stack, you can see what
changes would be made:

```
cdk diff
```

Deploy the stack:

```
cdk deploy
```

### Developing

This project uses Java for developing CDK apps and stacks.
The project is a standard Maven jar project.

The main app containing all stacks is in
[App.java](src/main/java/net/nihilanth/aws/awscdkvpcsimple/App.java).

There is currently only one stack, in
[SimpleVPCStack.java](src/main/java/net/nihilanth/aws/awscdkvpcsimple/SimpleVPCStack.java).

After changing code, rerun the commands in *Compiling* and *Deploying* sections to update your stack.





