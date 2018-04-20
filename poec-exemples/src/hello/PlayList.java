package hello;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlayList {
	
	private ArrayList<Song> songs;
	
	public PlayList() {
		songs = new ArrayList<Song>();
	}
	
	public void add(Song song) {
		songs.add(song);
	}

	public List<Song> songsByTitle() {
		SongByTitleComparator comparator = new SongByTitleComparator();
		songs.sort(comparator);
		return songs;
	}
	
	@Override
	public String toString() {
		return songs.toString();
	}

}