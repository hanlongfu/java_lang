package com.hanlongfu;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//        Gearbox mclaren = new Gearbox(6);
//
//        mclaren.operatorClutch(true);
//        mclaren.changeGear(1);
//        mclaren.operatorClutch(false);
//        System.out.println(mclaren.wheelSpeed(1000));
//        mclaren.changeGear(2);
//        System.out.println(mclaren.wheelSpeed(3000));

//        class ClickListener implements Button.OnclickListener{
//            public ClickListener(){
//                System.out.println("I'v been attached");
//            }
//            @Override
//            public void onClick(String title){
//                System.out.println(title + " was clicked");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());

        btnPrint.setOnClickListener(new Button.OnclickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                  quit = true;
                  break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }





}
