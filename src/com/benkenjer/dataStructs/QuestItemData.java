package com.benkenjer.dataStructs;

import java.util.LinkedList;

public class QuestItemData {

	private String name;
	private long createTime;
	private long deadLine;
	private LinkedList<String> objectiveList;

	public QuestItemData(String name, long createTime, long deadLine,
			LinkedList<String> objectiveList) {
		this.name = name;
		this.createTime = createTime;
		this.deadLine = deadLine;
		this.objectiveList = objectiveList;
	}
	
	public String getName(){
		return name;
	}

	public long getStartTime(){
		return createTime;
	}
	
	public long getDeadLine(){
		return deadLine;
	}
	
	public LinkedList<String> getObjectiveList(){
		return objectiveList;
	}

}
