class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            int len=s.length();
            sb.append(len).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {

            // 4#Hello5#World
           
           List<String> s=new ArrayList<>();
            if(str.isEmpty()){
                return s;
            }

             int i=0;
             int j=str.length();
             StringBuilder digit=new StringBuilder();
             while(i<j){
                
                
                if(str.charAt(i)!='#'){
                    digit.append(str.charAt(i++));
                }
                if(str.charAt(i)=='#'){
                    int len=Integer.parseInt(digit.toString());
                s.add(str.substring(i+1,i+1+len));
                i=i+1+len;
                digit.setLength(0);
                }
                
             

             }
             return s;
    
}}
