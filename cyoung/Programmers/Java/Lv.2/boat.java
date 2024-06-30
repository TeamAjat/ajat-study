import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {//가장 많이 나가는 사람 + 가장 적게 나가는 사람
        int answer = 0;
         Arrays.sort(people);//배열을 오름차순으로 정렬
        int index = 0;
        for(int i = people.length-1; i >= index ; i--){//큰 수에서 시작하여 작은 수로 작아지기
           if(people[i]+people[index] <= limit){//큰 수 + 작은 수 제한보다 같거나 작을 경우, 
               index++;// 해당된 숫자는 다음에 사용되지 않게 하기 위해 index의 값을 증가 
               answer++;// return 될 정답을 증가
           }else{
               answer++; // 만약 위의 조건을 만족하지 않았다면, 가장 큰 수는 혼자 태워보내야 하기 
                            // 때문에 answer의 값만 증가한다.
           }
        }
        return answer;
    }
}
