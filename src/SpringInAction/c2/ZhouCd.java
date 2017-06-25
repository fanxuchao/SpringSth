package SpringInAction.c2;

import org.springframework.stereotype.Component;

@Component(value="ZhouCd")
public class ZhouCd implements CD {

	@Override
	public void play() {
		System.out.println("zhou");
	}

}
