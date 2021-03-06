package com.score.pics.client.widgets;

import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;

public interface AddTopicView extends IsWidget {

	public HasTapHandlers getCancelImageButton();
	public HasTapHandlers getSaveButton();
	public String getTopic();
	public void setMessage(String text);
	
}
