package com.benkenjer.dataStructs;

import java.util.LinkedList;

/**
 * Reads from the database , and creates each quest item individually Use quest
 * master to interact with the quest items
 * 
 * @author Benjamin
 * 
 */
public class QuestMaster {
	private LinkedList<QuestItem> questList;

	public QuestMaster() {
		// load the database?

	}

	private void readFromDataBase() {
		// read from the database and get the full aggregate of information that
		// is requuired to build the list
	}

	private void createQuest() {
		// create a quest from the database information
	}

	/**
	 * Finds the quest item that is enquiured for, will return null if the index
	 * does not exist
	 * 
	 * @param index
	 *            the index of the item on the list
	 * 
	 */
	public QuestItem getQuest(int index) {
		QuestItem retItem = null;
		if ((questList.size() - 1) >= index) {
			retItem = questList.get(index);
		} else {
			retItem = null;
		}
		return retItem;
	}

	/**
	 * If quest parameters have changed, you must replace the quest using this
	 * 
	 * @param index
	 *            the quest that you want replaced
	 * @param replacement
	 *            the QuestItem with updated parameters
	 * @return will return 1 if the quest is successfully made, else will return
	 *         0
	 */
	public int editQuest(int index, QuestItem replacement) {
		int success = 0;
		if ((questList.size() - 1) >= index) {
			questList.set(index, replacement);
			success = 1;
		} else {
			success = 0;
		}
		return success;
	}

	public void commitChangesToList() {
		// push the linked list to the database
		 
		//thereby committing the changes to the phone memory
	}
}
