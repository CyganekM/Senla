package ThirdTask;

public class Word {
    private String word;
    private Integer vowelsСount;

    public Word(String word) {
        this.word = word;
        vowelsСount = setVowelsCount(word);
    }
    public Integer getVowelsСount() {
        return vowelsСount;
    }

    public String getWord() {
        return word;
    }
    @Override
    public String toString() {
        return word;
    }

    private int setVowelsCount(String word){
        String vowels = "аеёиоуэыюяэ";
        int count = 0;
        int keyLetters = 0;
        for (Character ch : word.toCharArray()) {
            if(vowels.contains(ch.toString())) {
                count++;
                if (count == 1) {
                    this.word = word.substring(0, keyLetters) + word.substring(keyLetters, keyLetters + 1).toUpperCase() + word.substring(keyLetters + 1);
                }
            }
            keyLetters++;
        }
        return count;
    }
}
