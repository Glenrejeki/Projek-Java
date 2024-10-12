package Music_Player;

import java.util.ArrayList;

public class Album {
 private String name ;
 private String artist;
 private ArrayList<Song> songs;


 public Album (String name, String artist,ArrayList<Song> songs){
  this.name= name;
  this.artist = artist;
  this.songs = new ArrayList<Song>();
 }

 public Song findSong (String title){
  for (Song checkedSong : songs){
    if (checkedSong.getTitle().equals(title) return checkedSong;)
  }
  return null;
 }

 public boolean addSong (String title, double duration){
  if (findSong(title) == null ){
    song.add(new Song(title, duration));
    System.out.println(title + "Sukse ditambahkan ke list");
    return true;
  }else {
    System.out.println("Lagu dengan nama"+title + "telah ada");
    return false;
  }
 }

 public boolean addToPlaylist(int trackNumber, LinkedList<Song> PlayList){
  int index = trackNumber - 1;
  if (index > 0 && index <= this.songs.size()){
    PlayList.add(this.songs.get(index));
  }
 }

}
