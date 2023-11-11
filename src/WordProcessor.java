import java.util.HashSet;

public class WordProcessor {
//    public int count = 0;
//    public int quantity = 0;
    HashSet<String> distinct_word = new HashSet<String>();
    public void getDistinctWords(String file){
        ReadFile rf = new ReadFile();

        String content = rf.readfile(file);
        String[] words = content.split("\\s+");


        for(String word: words ){
            word = word.replaceAll("^[^a-zA-Z]+|[^a-zA-Z]+$", "").toLowerCase();
            if(!word.isEmpty()){
                distinct_word.add(word);
//                quantity ++ ;
            }
        }
//        for(String word:distinct_word){
//            System.out.println(word);
////            count ++ ;
//        }
    }
}
