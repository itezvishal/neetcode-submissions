class Solution {

    public String sortedString(String s){
        return s.chars()
        .sorted()
        .mapToObj(c->String.valueOf((char) c))
        .collect(Collectors.joining());

    }

    public boolean isAnagram(String s, String t) {
         
         if(s.length()!=t.length()){
            return false;
         }

         s=sortedString(s);
         System.out.println(s);
         t=sortedString(t);
         System.out.println(t);


        return s.equals(t);
    }
}
