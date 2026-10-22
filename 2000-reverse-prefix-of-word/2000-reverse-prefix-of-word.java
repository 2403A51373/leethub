
class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int c = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                c = i;
                break;
            }
        }
        if (c == -1) {    return word;    }
        for (int i = 0; i <= c; i++) {    str1.append(word.charAt(i));    }
        str1.reverse();
        str2.append(str1);
        for (int i = c + 1; i < word.length(); i++) {    str2.append(word.charAt(i));    }
        return str2.toString();
    }
}
