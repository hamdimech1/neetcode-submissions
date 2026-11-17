class Solution {

    String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for (String s:strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }
      List<String> decode(String encoded_string) {
        List<String>decoded_strs=new ArrayList<>();
        int i=0;
        while (i<encoded_string.length()){
            int j=i;
            while (encoded_string.charAt(j)!='#'){
                j++;

            }
            int length =Integer.parseInt(encoded_string.substring(i,j));
            String word=encoded_string.substring(j+1,j+1+length);
            decoded_strs.add(word);
            i=j+1+length;

        }
        return decoded_strs;
    }
}
