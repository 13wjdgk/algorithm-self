import java.util.*;
public class program176963 {
	class Solution {
		public int[] solution(String[] name, int[] yearning, String[][] photo) {
			int[] answer = new int[photo.length];
			//사람별 그리움을 map 형태로 저장한다
			Map<String,Integer> nameYearn = new HashMap<>();
			for(int i =0;i<name.length;i++){
				nameYearn.put(name[i],yearning[i]);
			}
			for(int j=0;j<photo.length;j++){
				int value = 0;
				for(int k=0;k<photo[j].length;k++){
					Integer yearn = nameYearn.get(photo[j][k]);
					if(yearn!=null){
						value+=yearn;
					}
				}
				answer[j]=value;
			}

			return answer;
		}
	}
}
