package dev;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1)
                ans.add(i);
        }
        return ans;

    }
}