class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map= new LinkedHashMap<>();
        for(String st:arr){
            map.put(st,map.getOrDefault(st,0)+1);
        }
       for (Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                k--;
            }
            if(k==0){
                return entry.getKey();
            }
        }
        return "";
    }
}