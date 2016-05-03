package Controller;

import java.util.TimerTask;

import model.PlaySplash;

public class PlaySplashController extends TimerTask{
	PlaySplash ps;

	public PlaySplashController(PlaySplash ps){
		this.ps = ps;
	}
	
	@Override
	public void run() {
		ps.dispose();
//		ps.getTimer().cancel();
	}
}
