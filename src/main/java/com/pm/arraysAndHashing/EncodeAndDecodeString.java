package com.pm.arraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {
    public List<String> decode(String str) {
        //first find a number until it reaches #
        //based in the number, take the number of letters
        //store it into the list
        char[] charArr = str.toCharArray();
        StringBuilder num = new StringBuilder();
        List<String> result = new ArrayList<>();
        for (int i = 0 ; i < charArr.length; i++) {
            if (charArr[i] != '#') {
                num.append(charArr[i]);
            } else {
                int count = Integer.parseInt(num.toString());
                int index = 1;
                StringBuilder word = new StringBuilder();
                while (index <= count) {
                    word.append(charArr[i + index]);
                    index++;
                }
                i += count;
                result.add(word.toString());
                num = new StringBuilder();
            }
        }
        return result;
    }
}
