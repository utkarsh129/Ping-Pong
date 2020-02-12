package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class CompPaddle implements Paddle {
	double y,yVel;
	boolean upAccel,downAccel;
	int player,x;
	final double GRAVITY=0.94;
	Ball b1;
	public CompPaddle(int player, Ball b) {
		upAccel=false; downAccel=false;
		b1=b;
		y=210;yVel=0;
		if(player==1)
			x=20;
		else
			x=660;
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x,(int)y,20,80);
		
	}


	public void move() {
		y=b1.getY()-40;
		
		if(y < 0)
			y=0;
		if(y>420)
			y=420;
	}
	

	public int getY() {
		return (int)y;
		
	}

}
