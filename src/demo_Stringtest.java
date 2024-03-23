public class demo_Stringtest {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);
        String s2 = new String("test");
        System.out.println(s2);
        char[] chars = {'a', 'b', 'c'};
        String s3 = new String(chars);
        System.out.println(s3);
        System.out.println(chars);
        byte[] bytes1 = {97,98,99};
        byte[] bytes2 = {-97,-98,-99};
        byte[] bytes3 = {-28,-67,-96};
        String s4 = new String(bytes1);
        String s5 = new String(bytes2);
        String s6 = new String(bytes3);
        System.out.println(bytes1);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        String s7 = "test7";
        System.out.println(s7);
    }
}
