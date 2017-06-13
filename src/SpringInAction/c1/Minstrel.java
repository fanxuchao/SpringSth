package SpringInAction.c1;

import java.io.PrintStream;

public class Minstrel {
	public PrintStream stream;
	public Minstrel(){};
	
	public Minstrel(PrintStream stream){
		this.stream = stream;
	}
	
	public void singBeforeQuest(){
		stream.println("Before");
	}
	
	public void singAfterQuest(){
		stream.println("After");
	}
}
