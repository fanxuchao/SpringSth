package SpringInAction.c3_unfinish;

import org.springframework.stereotype.Component;

@Component(value="SongsCD")
public class SongsCD implements CD {
	
	@Override
	public void play() {
		System.out.println("songscd");
	}

}
