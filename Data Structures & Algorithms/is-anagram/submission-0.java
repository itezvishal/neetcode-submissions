class Solution {
    
    public String sortString(String s){
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
        return new String(arr);
    }
    
    public boolean isAnagram(String s, String t) {
        
        return sortString(s).equals(sortString(t)) ;
    }
}
