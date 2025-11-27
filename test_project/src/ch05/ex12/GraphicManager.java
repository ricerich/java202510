package ch05.ex12;

import java.util.Scanner;

public class GraphicManager 
{
	Scanner sc1;
	
	private Shape start;
	private Shape end;
	
	public GraphicManager()
	{
		start = null;
		end = null;
		
		sc1 = new Scanner(System.in);
	}
	
	void run()
	{
		System.out.println("그래픽 에디터 GV1.0 을 실행합니다.");
		
		while(true) {
			System.out.print("입력(1), 삭제(2), 모두보기(3), 끝내기(4)>>");
			int option = sc1.nextInt();
			
			switch(option) 
			{
				case 1://입력
					System.out.print("Line(1), Rect(2), Circle(3)>>");
					int type = sc1.nextInt();
					if(type<1 || type>3) {
						System.out.println("1~3사이를 입력해주세요");
						break;
					}
					//입력을 처리
					insert(type);
					
					break;
				case 2://삭제
					System.out.print("삭제할 도형의 위치>>");
					int index = sc1.nextInt();
					
//					boolean bOk = delete(index);
					if(!delete(index)) {
						System.out.println("삭제 실패했어요~!");
					}
					
					break;
				case 3://모두보기
					view();
					break;
				case 4://끝내기
					
//					break;
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("(1~4)만 입력해주세요!");
			}
		}
	}

	private void view() {
		Shape s = start;
		while(s != null) {
			s.draw();
			s = s.getNext();
		}
		
	}

	private boolean delete(int index) 
	{
		//1.아무것도 없을경우
		if(start == null)
			return false;
	
		Shape current=start;
		Shape previous=start;
		for(int i=0; i<index; i++) {
			previous = current;//뒤로 가기전에 담아놓음
			current = current.getNext();//뒤로 이동
//			previous.setNext(current.getNext());
			if(current == null)//현재가 없어요!
				return false;//실패
		}
		
		//1.한개 밖에 없을경우
		if(start == end) {
			start = null;
			end = null;
			return true;
		}
		
		//1.1개 이상이 들어있으면서, 첫번째 노드일때
		if(current == start) {
			start = current.getNext();
			//return true;
		}		
		else if(current == end) {
			end = previous;//담아놓고
			current = current.getNext();//뒤로 간다.
			end.setNext(null);
			
		}
		else //첫번째 아니고, 끝도 아닌 경우
		{
			previous.setNext(current.getNext());
			
		}
			
		return true;
	}

	private void insert(int type) 
	{
		Shape obj=null;
		switch(type) {
			case 1:
				obj = new Line();
				break;
			case 2:
				obj = new Rect();
				break;
			case 3:
				obj = new Circle();
				break;
		}
		
		if(start == null) {
			start = obj;
			end = obj;
		}
		else {
			end.setNext(obj);
			end = obj;
		}
		
	}


}




