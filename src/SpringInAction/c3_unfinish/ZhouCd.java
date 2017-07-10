package SpringInAction.c3_unfinish;

import org.springframework.stereotype.Component;

@Component(value="ZhouCd")
public class ZhouCd implements CD {

	@Override
	public void play() {
		System.out.println("zhou");
	}

}
