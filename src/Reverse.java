public class Reverse {
    public static void main(String[] args){
        String s = "omsai ram";
        String rev = "";
        int len = s.length();
         System.out.println("loop starts");
        for (int i = len-1;len>0; len++){
            rev = rev+ s.charAt(i);
        }
        System.out.println(rev);
         System.out.println(rev);
    }
}
