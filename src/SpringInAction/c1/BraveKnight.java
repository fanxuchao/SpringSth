package SpringInAction.c1;

public class BraveKnight implements Knight{
	public Quest quest;
	
	public BraveKnight() {	}

	public BraveKnight(Quest quest){
		this.quest = quest;
	}
	
	public void embarkQuest(){
		quest.embark();
	}
	
}
