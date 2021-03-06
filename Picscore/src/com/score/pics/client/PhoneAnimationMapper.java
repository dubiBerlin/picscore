package com.score.pics.client;

import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.mvp.client.AnimationMapper;
import com.googlecode.mgwt.ui.client.widget.animation.Animation;
import com.googlecode.mgwt.ui.client.widget.animation.Animations;
import com.score.pics.client.login.LoginPlace;
import com.score.pics.client.passwordForgotten.PasswordForgottenPlace;
import com.score.pics.client.register.RegisterPlace;
import com.score.pics.client.side2.SidePlace2;
import com.score.pics.client.side3.SidePlace3;
import com.score.pics.client.side4.SidePlace4;
import com.score.pics.client.side5.SidePlace5;
import com.score.pics.client.start.StartPlace;

public class PhoneAnimationMapper implements AnimationMapper {

	@Override
	public Animation getAnimation(Place oldPlace, Place newPlace) {
		if(newPlace instanceof RegisterPlace){
			return Animations.FADE;
		}
		if(newPlace instanceof PasswordForgottenPlace && oldPlace instanceof LoginPlace){
			return Animations.SLIDE;
		}
		if(newPlace instanceof LoginPlace&& oldPlace instanceof PasswordForgottenPlace ){
			return Animations.SLIDE_REVERSE;
		}
		if(newPlace instanceof StartPlace){
			return Animations.FADE;
		}
		if(newPlace instanceof SidePlace2 && oldPlace instanceof StartPlace){
			return Animations.FADE;
		}
		if(newPlace instanceof StartPlace && oldPlace instanceof SidePlace2){
			return Animations.FADE_REVERSE;
		}
		if(newPlace instanceof SidePlace3 && oldPlace instanceof SidePlace2){
			return Animations.FADE;
		}
		if(newPlace instanceof SidePlace2 && oldPlace instanceof SidePlace3){
			return Animations.FADE_REVERSE;
		}
		
		if(newPlace instanceof SidePlace3 && oldPlace instanceof SidePlace4){
			return Animations.FADE_REVERSE;
		}
		if(newPlace instanceof SidePlace4 && oldPlace instanceof SidePlace3){
			return Animations.FADE;
		}
		if(newPlace instanceof SidePlace5 && oldPlace instanceof SidePlace4){
			return Animations.FADE;
		}
		if(newPlace instanceof SidePlace4 && oldPlace instanceof SidePlace5){
			return Animations.FADE_REVERSE;
		}
		return Animations.FADE;
	}

}
