package com.hanlongfu;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    //add song
    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title, duration));
        }
        return false;
    }

    private Song findSong(String title){
        //foreach loop
          for(Song checkedSong : this.songs){
              if(checkedSong.getTitle().equals(title)){
                  return checkedSong;
              }
          }
          return null;
    }


    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1;
        if(index >= 0 && index <= this.songs.size()){
            //add element from ArrayList to LinkedList
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track number: " + trackNumber);
        return false;
    }


    public boolean addToPlaylist(String title, LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album.");
        return false;
    }



}
