class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,ArrayList<String>> map=new HashMap<>();
        for (String s:strs){

            char [] ch= s.toCharArray(); 
            Arrays.sort(ch);
            String ss=new String (ch);
            if (map.containsKey(ss))
            map.get(ss).add(s);
            else {
                map.put(ss,new ArrayList<>());
                map.get(ss).add(s);
            }
            

            }
            return new ArrayList<>(map.values());
        }
        
    }

