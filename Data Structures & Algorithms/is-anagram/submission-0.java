class Solution {
    public boolean isAnagram(String s, String t) {
        String[] a = s.split("");
        String[] b = t.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b)) return true;
        return false;
    }
}
