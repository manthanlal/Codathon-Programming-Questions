class Vowel_Consonant {
    public static void main(String[] args) {
        String word = args[0];
        int countVowel, countConsonant;
        countVowel = countConsonant = 0;
        
        word = word.toLowerCase();
        
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                countVowel++;
            else
                countConsonant++;
        }

        System.out.println("Vowel = " + countVowel + " and Consonant = " + countConsonant);
    }
}
