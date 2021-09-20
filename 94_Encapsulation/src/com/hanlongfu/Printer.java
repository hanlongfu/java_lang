package com.hanlongfu;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    //constructor
    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel >-1 && tonerLevel <=100) this.tonerLevel = tonerLevel;
        else this.tonerLevel = -1;
        this.numberOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }


    public int fillUpToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public void reduceToner(int numPagesPrinted){
        if(tonerLevel >0){
            this.tonerLevel -= numPagesPrinted;
        }
    }

    public void printedAPage(int numPagesPrinted){
        this.numberOfPagesPrinted += numPagesPrinted;
        reduceToner(numPagesPrinted);
        System.out.println("After printing " + numberOfPagesPrinted + " pages, toner is reduced to " + tonerLevel + "%.");
    }

    //getters
    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
