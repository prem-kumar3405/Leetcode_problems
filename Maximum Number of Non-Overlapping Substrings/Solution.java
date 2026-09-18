class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int[] count = new int[26];
        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        List<Integer> order = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';

            if (count[c] == 0) {
                first[c] = i;
                order.add(c);
            }

            count[c]++;
            last[c] = i;
        }

        List<String> res = new Arr