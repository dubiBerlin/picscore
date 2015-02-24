package com.score.pics.client.login;

import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;

public interface LoginView extends IsWidget {

	public String getUsername();
	public String getPassword();
	public void setResult(String text);
	public HasTapHandlers getLoginButton();
	public HasTapHandlers getRegisterButton();
	
}
