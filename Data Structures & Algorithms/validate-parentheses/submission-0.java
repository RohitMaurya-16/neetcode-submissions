class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map=Map.of('}','{',']','[',')','(');
        Deque<Character> q= new ArrayDeque<>();

        for(char ch:s.toCharArray())
        {
            if(map.containsKey(ch))
            {
              if(q.isEmpty() || q.peek()!=map.get(ch))return false;
              else q.poll();
            }

            else
            {
                q.push(ch);
            }
        }

        return q.isEmpty();
    }
}
