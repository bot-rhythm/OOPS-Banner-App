/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This program prints "OOPS" in banner format using:
 * - String array (to store lines)
 * - for-each loop (to print lines)
 *
 * @author Developer
 * @version 4.0
 */

public class UC4BannerApp {

    public static void main(String[] args) {

        // Store banner lines in array
        String[] lines = {

            " ***   ***   *****   ***** ",
            "*   * *   *  *    *  *     ",
            "*   * *   *  *    *  *     ",
            "*   * *   *  *****   ***** ",
            "*   * *   *  *            *",
            "*   * *   *  *            *",
            " ***   ***   *      ***** "

        };

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}