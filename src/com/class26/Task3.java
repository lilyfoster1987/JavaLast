package com.class26;

public class Task3 {
private void play() {
	System.out.println("i love activties");
}
private void play(String sport1) {
	System.out.println("i play "+sport1);
}
private void play(String sport1,int day) {
	System.out.println("i play "+sport1+" "+day+"day in a week.");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Task3 player=new Task3();
player.play();
player.play("basketball");
player.play("football",2);

	}

}
