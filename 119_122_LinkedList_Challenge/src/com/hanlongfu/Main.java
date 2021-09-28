package com.hanlongfu;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.61);
        album.addSong("Love don't mean a thing", 4.61);
        album.addSong("Holy man", 4.61);
        album.addSong("Hold on", 4.61);
        album.addSong("Lady double dealer", 4.61);
        album.addSong("You can't do it right", 4.61);
        albums.add(album);

        //new keyword create a totally new object (album)
        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.44);
        album.addSong("Let's go", 2.44);
        album.addSong("Evil walks", 5.44);
        album.addSong("Inject the venom", 5.44);
        album.addSong("Snowballed", 5.44);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        //first album and song
        albums.get(0).addToPlaylist("Love don't mean a thing", playList);
        albums.get(0).addToPlaylist("Holy man", playList);
        albums.get(0).addToPlaylist("Hold on", playList);
        albums.get(0).addToPlaylist(5, playList);

        albums.get(1).addToPlaylist("For those about to rock", playList);
        albums.get(1).addToPlaylist("Let's go", playList);
        albums.get(1).addToPlaylist("Evil walks", playList);
        albums.get(1).addToPlaylist(5, playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward= false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list.");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                           "1 - to play next song \n" +
                           "2 - to play the previous song\n"+
                           "3 - to replay the current song\n"+
                           "4 - list songs in the playlist\n"+
                           "5 - print available actions.");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==============================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("==============================");
    }



}
