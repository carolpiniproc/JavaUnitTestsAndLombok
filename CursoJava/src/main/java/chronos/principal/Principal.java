package chronos.principal;

import chronos.logica.HelloWorld;

public class Principal {

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.setHello("Hello Beautiful World");
        hello.setNum(123);

        System.out.println(hello.getHello());
        System.out.println(hello.getNum());

        hello = new HelloWorld("Bom dia", 10);

        System.out.println(hello.getHello());
        System.out.println(hello.getNum());

        hello = new HelloWorld("Bom dia Sunshine");

        System.out.println(hello.getHello());
        System.out.println(hello.getNum());

    }

}
