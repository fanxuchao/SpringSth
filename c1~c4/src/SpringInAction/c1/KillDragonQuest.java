package SpringInAction.c1;

import java.io.PrintStream;

public class KillDragonQuest implements Quest {

	PrintStream stream;
	
	public KillDragonQuest() {	}
	public KillDragonQuest(PrintStream stream) {
		this.stream = stream;
	}
	
	@Override
	public void embark() {
		stream.println("AAAAA");
	}

}
