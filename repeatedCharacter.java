class Solution {
    public char repeatedCharacter(String s) {
        
        ArrayList<Character> list = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(list.contains(ch)){
                return ch;
            }
            list.add(ch);
        }
        return 'a';
    }
}
