package com.score.pics.client.helper;

import java.util.List;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.list.celllist.CellList;
import com.googlecode.mgwt.ui.client.widget.header.HeaderPanel;
import com.score.pics.client.resources.AppBundle;

public class GUIHelper {

	
	public HeaderPanel getHeaderPanel(String text){
		HeaderPanel headerPanel = new HeaderPanel();
		headerPanel.getElement().getStyle().setBackgroundColor("#3498DB");
		headerPanel.setWidth("100%");
		
		Label label = new Label(text);
		label.setStyleName(AppBundle.INSTANCE.getCss().headerLabel());
		
		headerPanel.add(label);
		
		return headerPanel;
	}
	
	public HeaderPanel getHeaderPanel(String text, Widget widget1, Widget widget2){
		HeaderPanel headerPanel = new HeaderPanel();
		headerPanel.getElement().getStyle().setBackgroundColor("#3498DB");
		headerPanel.setWidth("100%");
		
		Label label = new Label(text);
		label.setStyleName(AppBundle.INSTANCE.getCss().headerLabel());
		
		
		headerPanel.add(widget1);
		headerPanel.add(label);
		headerPanel.add(widget2);
		
		return headerPanel;
	}
	
	/*
	 * boolean gibt an ob das Widget links oder rechts vom Label stehen soll
	 * 
	 * True = Widget left of label
	 * false = Widget right of label
	 * 
	 * */
	public HeaderPanel getHeaderPanel(String text, Widget widget1, boolean left_or_right){
		HeaderPanel headerPanel = new HeaderPanel();
		headerPanel.getElement().getStyle().setBackgroundColor("#3498DB");
		headerPanel.setWidth("100%");
		
		Label label = new Label(text);
		label.setStyleName(AppBundle.INSTANCE.getCss().headerLabel());
		
		if(left_or_right){
			headerPanel.add(widget1);
			headerPanel.add(label);
			
		}else{
			headerPanel.add(label);
			headerPanel.add(widget1);
		}
		
		return headerPanel;
	}
	
	/*
	 * boolean gibt an ob das Widget links oder rechts vom Label stehen soll
	 * */
	public HeaderPanel getHeaderPanel(Label label, Widget widget1, boolean left_or_right){
		HeaderPanel headerPanel = new HeaderPanel();
		headerPanel.getElement().getStyle().setBackgroundColor("#3498DB");
		headerPanel.setWidth("100%");
		
		label.setStyleName(AppBundle.INSTANCE.getCss().headerLabel());
		
		if(left_or_right){
			headerPanel.add(widget1);
			headerPanel.add(label);
			
		}else{
			headerPanel.add(label);
			headerPanel.add(widget1);
		}
		
		return headerPanel;
	}
	
	/*
	 * boolean gibt an ob das Widget links oder rechts vom Label stehen soll
	 * */
	public HeaderPanel getHeaderPanel(Label label, Widget widget1, Widget widget2){
		HeaderPanel headerPanel = new HeaderPanel();
		headerPanel.getElement().getStyle().setBackgroundColor("#3498DB");
		headerPanel.setWidth("100%");
		
		label.setStyleName(AppBundle.INSTANCE.getCss().headerLabel());
		
		headerPanel.add(widget1);
		headerPanel.add(label);
		headerPanel.add(widget2);	
		
		return headerPanel;
	}
	
	public HeaderPanel getHeaderPanel(Label label){
		HeaderPanel headerPanel = new HeaderPanel();
		headerPanel.getElement().getStyle().setBackgroundColor("#3498DB");
		headerPanel.setWidth("100%");
		
		label.setStyleName(AppBundle.INSTANCE.getCss().headerLabel());
		
		headerPanel.add(label);
		
		return headerPanel;
	}
	
	public Label distance10PX(){
		Label distance = new Label();
		distance.setStyleName(AppBundle.INSTANCE.getCss().distance());
		
		return distance;
	}
	
	public Label distance5PX(){
		Label distance = new Label();
		distance.setStyleName(AppBundle.INSTANCE.getCss().distanceSmall());
		
		return distance;
	}
	
	public Label ueberschrift(String text){
		Label distance = new Label(text);
		distance.setStyleName(AppBundle.INSTANCE.getCss().ueberschrift());
		
		return distance;
	}
	
	public Label errorLabel(){
		Label error = new Label();
		error.setStyleName(AppBundle.INSTANCE.getCss().resultLabel());
		
		return error;
	}
	
	public Label resultLabel(){
		Label result = new Label();
		result.setStyleName(AppBundle.INSTANCE.getCss().resultLabel());
		
		return result;
	}
	
	
	public void setBackGroundColorInCellList(CellList cellList, List list){
		for(int i = 0; i < list.size(); i++){
		   cellList.getElement().getElementsByTagName("li").getItem(i).getStyle().setBackgroundColor("white");
	       cellList.getElement().getElementsByTagName("li").getItem(i).getStyle().setColor("#1F3A93");//3498DB
	   }
	}
	

}
