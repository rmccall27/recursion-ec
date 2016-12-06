import java.awt.Color;

public class omega {
	public static void SierpinskiCarpet(Turtle t, int levels, double length){
		for(int i = 0; i <= levels ; i++){
			square(t, i, length, 0, 0);
		}
		}
	public static void square(Turtle t, int levels, double length, double x, double y){
		t.goTo(x, y);
		t.setDelay(0);
		t.setColor(Color.WHITE);
		
	
			if(levels == 0){
				t.pickPenUp();
				t.forward(length/2);
				t.left(90);
				t.forward(length/2);
				t.right(180);
				t.putPenDown();
				for(int i = 0; i < length/2 ; i++){
		
					t.forward(length-1);
					t.right(90);
					t.forward(1);
					t.right(90);
					t.forward(length-1);
					t.left(90);
					t.forward(1);
					t.left(90);
				}
				t.pickPenUp();
			}
			else{
				t.pickPenUp();
				square(t, levels-1, length/3, x-length, y);
				square(t, levels-1, length/3, x-length, y+length);
				square(t, levels-1, length/3, x-length, y-length);
				square(t, levels-1, length/3, x+length, y);
				square(t, levels-1, length/3, x+length, y+length);
				square(t, levels-1, length/3, x+length, y-length);
				square(t, levels-1, length/3, x, y+length);
				square(t, levels-1, length/3, x, y-length);
			}	
	}
	public static void main(String[] args){
		World w = new World(600, 600, Color.BLACK);
		Turtle t = new Turtle(w);
		SierpinskiCarpet(t, 4, 150);
	}
	
	
}


