package ArraysAndStrings;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class ReplaceSpace {
    public String replaceSpace(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReplaceSpace r = new ReplaceSpace();
        String s = "We are happy.";
        System.out.println(r.replaceSpace(s));
    }
}
