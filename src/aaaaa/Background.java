package aaaaa;
//this is to handle background scrolling in a game


public class Background {
	
	private int bgX, bgY, speedX;
//constructor	
	public Background(int x, int y){
		bgX = x;
		bgY = y;
		speedX = 0;
	}
//method	
	public void update() {
		bgX += speedX;

		if (bgX <  -1920*3){
			bgX = 1920;
		}
                if (bgX >  1920*2){
                    bgX = -1920*2;
                }
	}
//getter and setter methods
	public int getBgX() {
		return bgX;
	}

	public int getBgY() {
		return bgY;
	}

	public int getSpeedX() {
		return speedX;
	}

	public void setBgX(int bgX) {
		this.bgX = bgX;
	}

	public void setBgY(int bgY) {
		this.bgY = bgY;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	
	
	
}
