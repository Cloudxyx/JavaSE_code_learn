package java_base;

public class StringBuildtest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("dha");
        System.out.println(sb);
        sb.append("hifi");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        String s = sb.toString();

        String s2 = "fsfsf";
        StringBuilder s3 = new StringBuilder(s2);
        System.out.println(s+","+s3);

    }
}
