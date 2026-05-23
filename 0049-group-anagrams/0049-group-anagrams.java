class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> map=new HashMap<>();

        for(String s:strs)
        {
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String s_key=new String(arr);
            // so here we are using sorted version as a key...
            map.computeIfAbsent(s_key,k->new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}