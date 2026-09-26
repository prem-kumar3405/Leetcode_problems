class Solution {
    int i;

    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();

        for (List<String> li : knowledge) {
            map.put(li.get(0), li.get(1));
        }

        StringBuilder ans = new StringBuilder();
        i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                String key = getbracString(s);
                ans.append(map.getOrDefault(key, "?"));
         