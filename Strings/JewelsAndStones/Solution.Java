public class JewelsAndStones {

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            if (jewels.contains(String.valueOf(ch))) {
                count++;
            }
        }
        System.out.println(count);
    }
}