package ch05.ex10;

public class Dictionary extends PairMap 
{
	private int count;//현재 배열에 들어있는 아이템의 갯수
	
	public Dictionary(int capacity) {
		keyArray = new String[capacity];
		valueArray = new String[capacity];
		count=0;
	}

	@Override
	String get(String key) {
		
		for(int i=0; i<count; i++) {
			if(key.equals(keyArray[i]))
				return valueArray[i];
		}
		
		return null;//없으면 null
	}

	@Override
	void put(String key, String value) {
		//1.키값이 같은게 있는지 검사
		//1-1.있으면 해당 위치에 value를 넣어주면 된다(사실상 교체)
				
		//1-2.없으면
		//이 경우 또한번 더 검사. 꽉찬건지
		int i=0;
		for(i=0; i<count; i++) {
			if(key.equals(keyArray[i])){
				break;
			}
		}
		
		//다 돌았는데 없고, 그경우 꽉 찼는지 검사
		if(i==count) {
			if(i<keyArray.length) {
				keyArray[i] = key;
				valueArray[i] = value;
				count++;
			}
		}
		else {
			keyArray[i] = key;
			valueArray[i] = value;
		}
	}

	@Override
	String delete(String key) {
		
		//같은게 있는지 검사부터
		int i=0;
		for(i=0; i<count; i++) {
			if(key.equals(keyArray[i])){
				break;
			}
		}
		
		if(i==count)//같은게 없다. 지울 수 없어요~
			return null;

		String s = valueArray[i];
		//지운거 위치에서 그 뒤에있는 애를 앞으로 땡긴다.
		//시작, 끝
		int start = i;
		int end= count-1;
		for(int j=start; j<end; j++)
		{
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];			 
		}
		count--;
					
		return s;
	}

	@Override
	int length() {		
		return count;
	}

}
