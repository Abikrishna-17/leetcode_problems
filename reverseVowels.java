class Solution {
    public String reverseVowels(String s) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch== 'u'
            ||ch =='A' || ch == 'E' || ch=='I' || ch=='O' || ch== 'U'){

            list.add(i);
        }
        }
        
        char[] arr = s.toCharArray();
        Collections.reverse(list);
        int j=0;
        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch== 'u'
            ||ch =='A' || ch == 'E' || ch=='I' || ch=='O' || ch== 'U'){
          arr[i] = s.charAt(list.get(j)); 
          j++;           }
        }
        return new String(arr);
    }
    
}
