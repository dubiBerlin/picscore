package com.score.pics.client;

import java.util.List;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.score.pics.client.login.LoginView;
import com.score.pics.client.passwordForgotten.PasswordForgottenView;
import com.score.pics.client.register.RegisterMobileView;
import com.score.pics.client.side2.SideView2;
import com.score.pics.client.side3.SideView3;
import com.score.pics.client.side4.SideView4;
import com.score.pics.client.side5.SideView5;
import com.score.pics.client.start.StartView;
import com.score.pics.client.tablet.TabletMainContentPresentationView;
import com.score.pics.client.tabletNavBlank.TabletNavViewImpl;
import com.score.pics.client.widgets.ChangePasswordView;
import com.score.pics.client.widgets.SettingsView;
import com.score.pics.shared.CellContent;

public interface ClientFactory {

	public EventBus getEventBus();

	public PlaceController getPlaceController();

	public RegisterMobileView getRegisterMobileView();
	
	public LoginView getLoginViewImpl();

	public StartView getStartViewImpl();
		
	public SideView2 getSide2ViewImpl();
	
	public SideView3 getSide3ViewImpl();
	
	public SideView4 getSide4ViewImpl();
	
	public SideView5 getSide5ViewImpl();
	
	public TabletNavViewImpl getTabletNavBlankImpl();
	
	public TabletMainContentPresentationView getTabletMainBlankImpl();
	
	public ChangePasswordView getChangePasswordViewImpl();
	
	public PasswordForgottenView getPasswordForgottenViewImpl();
	
//	public AddTopicView getTopicViewWidget();
	
	/*=========== Widgets ===========*/
	public SettingsView getSettingsWidget();
	
	
	public String getUserName();
	
	public void setUserName(String text);
	
	public String getSideLocation();
	
	public void setSideLocation(String text);
	
	
	/* Necessary for the ancestorpath for the entities in DS */
	public void setIDOFPreviousSide(String text);
	
	public String getIDOFPreviousSide();
	
	public void clearAncestorPath();
	
	/*  */
	public void pushHistoryTracker(String key);
	public List<String> getAncestorPath();
	public void deleteLastTokenAncestorPath();
	public void setCellContentList(List<CellContent> list);
	public List<CellContent> getCellContentList();
}
