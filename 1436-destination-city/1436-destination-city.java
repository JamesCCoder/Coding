class Solution {
    public String destCity(List<List<String>> ps) {
        Map<String, String> map = new HashMap<>();
        for (List<String> p : ps) {
            map.put(p.get(0), p.get(1));
        }
        String ans = ps.get(0).get(0);
        while (map.containsKey(ans)) ans = map.get(ans);
        return ans;
    }
}
