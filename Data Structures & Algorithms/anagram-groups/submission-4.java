class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Map<Integer,List<String>> m=new HashMap<>();

        // for(String s:strs){
        //     if(!m.containsKey(s.length())){
        //         m.put(s.length(),new ArrayList<>());
        //     }
        //     m.get(s.length()).add(s);
        // }

        // return new ArrayList<>(m.values());


        Map<String,List<String>> m=new HashMap<>();


        for(String s:strs){
            
            char[] c=s.toCharArray();
            Arrays.sort(c);

           String sortedString=new String(c);

           if(!m.containsKey(sortedString)){
            m.put(sortedString,new ArrayList<>());
           }
    
           m.get(sortedString).add(s);

        }

    return new ArrayList<>(m.values());

    }
}
