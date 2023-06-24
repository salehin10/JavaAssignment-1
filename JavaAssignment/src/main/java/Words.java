//15. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//"I live in Bangladesh"
public class Words {
    public void countOfWords(){
        String str = "I live in Bangladesh";
        int words = 0;
        int vowel = 0;
        int cons =  0;
        int chars = 0;
        //Words
        for (int i =0; i<str.length();i++){
            if (str.charAt(i) == ' '){
                words++;
            }
            else {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowel++;
                } else if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {

                    vowel++;
                } else {
                    cons++;
                }
            }

        }
        words++;
        chars = vowel+cons;
        System.out.println("Number of words :" +words);
        System.out.println("Number of characters without spaces :"+chars);
        System.out.println("Number of vowels : "+vowel);
        System.out.println("Number of consonants : "+cons);

    }
}
