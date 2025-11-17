package ch04.problem;

class Rectangle
{
	int x;
	int y;
	int w;//width (너비)
	int h;//height (높이)
	
	public Rectangle(int x, int y, int w, int h) 
	{
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public void show()
	{
		System.out.print("("+x+","+y+")에서 크기가 ");
		System.out.println(w + "x" + h +" 인 사각형");
	}

	public int square() 
	{
		return w*h;
	}

	public boolean contains(Rectangle r) 
	{
		if((x < r.x && x+w > r.x+r.w) &&
		   (y < r.y && y+h > r.y+r.h) )//r이 나에게 포함이 되면
			return true;
		else
			return false;
	}
}

public class Ex04 {

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		
		if(t.contains(r)) { 
			System.out.println("t는 r을 포함합니다.");
		}
		
		if(t.contains(s)) { 
			System.out.println("t는 s를 포함합니다.");
		}
	}

}
