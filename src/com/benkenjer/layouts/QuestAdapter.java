package com.benkenjer.layouts;

import java.util.LinkedList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.benkenjer.dataStructs.QuestItemData;

public class QuestAdapter extends ArrayAdapter<QuestItemData>{

	private int clicked;
	
	public QuestAdapter(Context context, int resource, LinkedList<QuestItemData> data ) {
		super(context, resource);
		//initialise the fields 
		clicked = -1;
	}
	
	public void clicked(int clickedIndex){
		clicked = clickedIndex;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(clicked != -1 && clicked == position){
			// fire the clicked background
		}else{
			//fire the non clicked background 
		}
		
		return super.getView(position, convertView, parent);
	}

	
}
