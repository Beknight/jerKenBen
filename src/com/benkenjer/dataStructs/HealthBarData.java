package com.benkenjer.dataStructs;

/**
 * stats and however we calculate health (?)
 * @author benjamin
 *
 */
public class HealthBarData {
	private int health;
	private int success;
	private int fail;

	public HealthBarData(int health, int success, int fail){
		this.success = success;
		this.fail = fail;
		this.health = health;
	}
	
	public int getHealth(){
		return health;
	}
	
	public int getSuccessCount(){
		return success;
	}
	
	public int getFailCount(){
		return fail;
	}
}
