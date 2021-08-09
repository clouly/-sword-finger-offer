package ArraysAndStrings;

/**
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。 例如输入字符串 "I am a
 * student."，则输出 "student. a am I"。
 */
public class ReverseWords {

    public String reverseWords(String s) {
        String tmp = s.trim();
        int start = tmp.length() - 1;
        int end = tmp.length() - 1;
        String res = "";
        while (start >= 0) {
            while (start >= 0 && tmp.charAt(start) != ' ') {
                start--;
            }
            res += tmp.substring(start + 1, end + 1) + " ";
            while (start >= 0 && tmp.charAt(start) == ' ') {
                start--;
            }
            end = start;
        }
        return res.trim();
    }

    public static void main(String[] args) {
        String s = "I am a student.";
        ReverseWords r = new ReverseWords();
        System.out.println(r.reverseWords(s));
    }

}
