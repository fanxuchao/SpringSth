package SpringInAction.c2;

import org.springframework.stereotype.Component;

@Component(value="SongsCD")
public class SongsCD implements CD {
	
	
	@Override
	public void play() {
		System.out.println("songscd");
	}

}
