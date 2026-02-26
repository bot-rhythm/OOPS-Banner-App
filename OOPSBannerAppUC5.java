public class OOPSBannerAppUC5 {
    public static void main(String[] args) {

        String[] lines = {
            String.join(" ", " *** ", "*   *", "*   *", "*   *", " *** "),
            String.join(" ", "**** ", "*   *", "**** ", "*    ", "*    "),
            String.join(" ", " *** ", "*    ", " *** ", "    *", " *** "),
            String.join(" ", "**** ", "*   *", "**** ", "*  * ", "*   *")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}public class OOPSBannerAppUC5 {
    public static void main(String[] args) {
        // UC5: Define and populate String array in a single statement (Inline Initialization)
        // Each line uses String.join() to construct the banner characters with spaces
        String[] lines = {
            String.join(" ", " ****", " ***", " ****", " ****"), 
            String.join(" ", "* *", "* *", "* *", "* "),
            String.join(" ", "* *", "* *", "* *", "* "),
            String.join(" ", "* *", "* *", "**** ", " *** "),
            String.join(" ", "* *", "* *", "* ", "    *"),
            String.join(" ", "* *", "* *", "* ", "    *"),
            String.join(" ", " ****", " ***", "* ", "**** ")
        };

        // Use an enhanced for-loop (for-each) to iterate and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
