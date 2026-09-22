class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            // Write length + separator + string
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // Find the separator #
            int slash = str.indexOf("#", i);
            
            // Get the length (number before the #)
            int length = Integer.parseInt(str.substring(i, slash));
            
            // Move pointer to the start of the actual string
            i = slash + 1;
            
            // Extract the string based on the length
            res.add(str.substring(i, i + length));
            
            // Move pointer to the start of the next length prefix
            i += length;
        }
        return res;
    }
}
