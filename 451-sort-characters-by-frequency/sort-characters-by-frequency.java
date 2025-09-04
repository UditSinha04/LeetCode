class Solution {
    public class pair{
        char ch;
        int f;
        pair(char ch,int f){
            this.ch=ch;
            this.f=f;
        }
    }
    public String frequencySort(String s) {
        List<pair> list=new ArrayList<>();
        String str="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int j=0;j<s.length();j++){
            char i=s.charAt(j);
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        for(char i:map.keySet()){
            int value=map.get(i);
            list.add(new pair(i,value));
        }
        //ye syntax se list ke andar jo pair hai uss pair me f ki value reverse order me sort hoti hai 
        list.sort((a, b)->Integer.compare(b.f, a.f));
        for(pair p:list){
            Character ch=p.ch;
            int val=p.f;
            for(int i=0;i<val;i++){
                str=str+ch;
            }
        }
        return str;


    }
}