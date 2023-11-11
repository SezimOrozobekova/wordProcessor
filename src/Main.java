public class Main {
    public static void main(String[] args) {
//        CreateFile cf = new CreateFile();
//        cf.createfile("file2.txt");

//        WriteFile wf = new WriteFile();
//        wf.writefile("file.txt", "I love pizza");
//
//        ReadFile rf = new ReadFile();
//        rf.readfile("file.txt");

        WordProcessor wp = new WordProcessor();
        wp.getDistinctWords("file.txt");

        WordProcessor wp2 = new WordProcessor();
        wp2.getDistinctWords("file2.txt");

//        System.out.println("Quantity of words:" + wp.quantity);
//        System.out.println("Quantity of distinct words:" + wp.count);

        SimilarityCalculator sc = new SimilarityCalculator();
        System.out.println(sc.similaritycalculator(wp.distinct_word, wp2.distinct_word));
    }
}