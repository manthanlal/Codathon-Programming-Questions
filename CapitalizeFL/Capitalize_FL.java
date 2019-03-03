class Capitalize_FL {
    public static void main(String[] args) {
        String word = args[0];
        int length = word.length();
        String Fl = word.substring(0, 1);
        String Ll = word.substring((length-1), (length));
        String newWord = Fl.toUpperCase() + word.substring(1, word.length()-1) + Ll.toUpperCase();
        System.out.println(newWord);
    }
}