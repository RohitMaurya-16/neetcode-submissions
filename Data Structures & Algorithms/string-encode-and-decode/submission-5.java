class Solution {

    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) return "";

        List<String> list = new ArrayList<>();

        for (String s : strs) {
            list.add(String.valueOf(s.length()));
            list.add(",");
        }

        list.add("#");

        for (String s : strs) {
            list.add(s);
        }

        return String.join("", list);
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        if (str == null || str.isEmpty()) return result;

        int hashIndex = str.indexOf('#');

        String lengthPart = str.substring(0, hashIndex);
        String[] nums = lengthPart.split(",");

        int start = hashIndex + 1;

        for (String num : nums) {
            if (!num.isEmpty()) {
                int length = Integer.parseInt(num);
                result.add(str.substring(start, start + length));
                start += length;
            }
        }

        return result;
    }
}