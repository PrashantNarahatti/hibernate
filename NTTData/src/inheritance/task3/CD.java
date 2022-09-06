package inheritance.task3;

public class CD extends MediaItem{
	private String artist;
	private String genre;
	
	public boolean equals(Object obj){
	if(obj == null)
	return false;
	MediaItem otherMediaItem = (MediaItem) obj;
	return super.equals(otherMediaItem) && runTime == otherMediaItem.runTime;
	}
	}
