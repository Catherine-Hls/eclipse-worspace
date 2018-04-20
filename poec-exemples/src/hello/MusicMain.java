package hello;

import java.util.ArrayList;

import java.util.List;

public class MusicMain {

	public static void main(String[] args) {

		Personne auteur1 = new Personne("Bob", "Dylan", 52);
		Song song1 = new Song("titre chanson 1", auteur1, "rock", 12345678);
		Song song2 = new Song("titre chanson 2", auteur1, "pop", 34567890);

		PlayList playList = new PlayList();

		playList.add(song1);
		playList.add(song2);		
		
		List<Song> songsOrderedByTitle = playList.songsByTitle();
		System.out.println(songsOrderedByTitle);
		
		System.out.println(playList);
//		List<Song> songOrderedByGenre = playList.songsByGenre();
//		List<Song> songOrderedByDuration = playList.songsByDuration();
//		List<Song> songOrderedByAuthorName = playList.songsByAuthorName();
	}

}
	
