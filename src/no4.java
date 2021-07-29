public class no4 {
    public static void main(String[] args) {

        String r = reverse ("Handoyo");
        System.out.println();
        System.out.println(r);
    }

    public static String reverse (String s){
        char[] kalimat = new char[s.length()];

        int letterIndex = 0;
        for(int i = s.length() - 1; i>=0; i--) {
            kalimat[letterIndex] = s.charAt(i);
            letterIndex++;

        }
        String reverse = "";
        for(int i = 0 ; i < s.length(); i++){
            reverse = reverse + kalimat[i];
        }
        return reverse;
    }
}
