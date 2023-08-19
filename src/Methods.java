public class Methods {
    public static void printFirstFiveLetters(String[] obj) {
        for (String element : obj) {
            if (element.length() < 5) {
                System.out.println("ERROR: Short String");
            } else if (element.length() >= 5) {
                System.out.println(element.substring(0, 5));
            }
        }
    }

    /*
    obj array
    n numero di array da prendere in considerazione
    k da dove partire con la concatenazione
     */
    public static String thirdLettersChains(String[] obj, int n, int k) {
        String result = "";
        for (int i = k; i < n; i++) {
            result += obj[i].charAt(2);
        }
        return result;
    }

}
