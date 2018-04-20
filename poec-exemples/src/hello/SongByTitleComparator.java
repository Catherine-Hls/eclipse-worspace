package hello;

import java.util.Comparator;

public class SongByTitleComparator implements Comparator<Song> {

	@Override
	public int compare(Song s1, Song s2) {
		return s1.getTitle().compareTo(s2.getTitle());
	}
}
