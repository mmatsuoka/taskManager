/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.solidc.taskmanager.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author masayasu
 */
public class Task {
	
	/** タスクを実行する予定日時 */
	private String scheduledDate;
	
	/** タスクの内容 */
	private String taskContents;
	
	public Task(final String sheduledDate, final String taskContents){
		this.scheduledDate = sheduledDate;
		this.taskContents = taskContents;
	}

	/**
	 * タスクを実行する予定日時
	 * @return the scheduledDate
	 */
	public String getScheduledDate() {
		return scheduledDate;
	}

	/**
	 * タスクの内容
	 * @return the taskContents
	 */
	public String getTaskContents() {
		return taskContents;
	}

	
}
