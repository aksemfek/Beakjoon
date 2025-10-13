class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i = 0; i < dic.length; i++){
            String str = dic[i];
            int count = 0;
            for(int j = 0; j < spell.length; j++){
                for(int k = 0; k < str.length(); k++){
                    if (spell[j].equals(String.valueOf(str.charAt(k)))){
                        count++;
                        break;
                    }
                }
            }
            if(count == spell.length) answer=1;;
            
        }
        return answer;
    }
}