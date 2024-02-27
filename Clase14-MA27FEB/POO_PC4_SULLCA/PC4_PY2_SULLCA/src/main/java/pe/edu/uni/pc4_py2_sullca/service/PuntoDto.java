package pe.edu.uni.pc4_py2_sullca.service;

import java.util.Random;

public class PuntoDto {

	private int x;
	private int y;

	public PuntoDto() {
		int signo;
		Random rand = new Random();
		signo = rand.nextBoolean() ? 1 : -1;
		this.x = signo * (10 + rand.nextInt(90));
		signo = rand.nextBoolean() ? 1 : -1;
		this.y = signo * (10 + rand.nextInt(90));
	}

	public double getDistancia() {
		return Math.sqrt(x * x + y * y);
	}

	public int getCuadrante() {
		if (y > 0) {
			return (x > 0) ? 1 : 2;
		}
		return (x < 0) ? 3 : 4;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + "; " + y + ")";
	}

}
