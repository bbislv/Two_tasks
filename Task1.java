public class Task1 {
    public static void main(String[] args) {
        String text = "HelloWorldJava";
        int partSize = 3;

        for (int i = 0; i < text.length(); i += partSize) {
            int end = Math.min(i + partSize, text.length());
            System.out.println(text.substring(i, end));
        }
    }
}
