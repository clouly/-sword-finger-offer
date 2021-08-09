package ArraysAndStrings;

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 */
public class ReverseLeftWords {

    public String reverseleftWords(String s, int n) {
        String res = "";
        int len = s.length();
        for (int i = n; i < len; i++) {
            res += s.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        ReverseLeftWords r = new ReverseLeftWords();
        System.out.println(r.reverseleftWords("abcdefg", 2));
        System.out.println(r.reverseleftWords("lrloseumgh", 6));
    }

}
