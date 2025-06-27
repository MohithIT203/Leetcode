class Solution {
    public int firstUniqChar(String str) {
        Map<Character,Integer> map=new LinkedHashMap<>();
	    for(int i=0;i<str.length();i++){
	       char n=str.charAt(i);
	        if(map.containsKey(n)){
	            map.put(n,map.get(n)+1);
	        }
	        else{
	            map.put(n,0);
	        }
	    }
        int min=0;
		for(Map.Entry<Character,Integer> n:map.entrySet()){
		    if(n.getValue()==0){
		        return str.indexOf(n.getKey());
		    }
		}
        return -1;
    }
}