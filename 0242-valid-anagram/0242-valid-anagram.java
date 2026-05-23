class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;

        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);

            else map.put(s.charAt(i),1);
        }

        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);

            if(map.containsKey(ch)) map.put(ch,map.get(ch)-1);

            else return false;

            if(map.get(ch)==0) map.remove(ch);

        }

        return map.isEmpty();


    }
}