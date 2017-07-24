package SpringInAction.c3_unfinish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	
	
	@Autowired
/*	private ZhouCd zcd;
	public void zplay(){
		zcd.play();
	}
*/
	private  CD cd;
	
	public CDPlayer() {
	}

	public CDPlayer(CD cd){
		this.cd = cd;
	}
	public void palycd(){
		cd.play();
	}
	
	
	
	
}
