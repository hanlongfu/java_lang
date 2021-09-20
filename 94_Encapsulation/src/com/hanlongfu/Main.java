package com.hanlongfu;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50,false);
        printer.fillUpToner(30);
        System.out.println("The current toner level is " + printer.getTonerLevel());
        printer.printedAPage(33);
    }
}
