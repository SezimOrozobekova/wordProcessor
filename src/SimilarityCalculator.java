import java.util.HashSet;
import java.util.Set;

public class  SimilarityCalculator {
    public double similaritycalculator(HashSet<String> set1, HashSet<String> set2){
        int similarity_coefficient = 0;

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        if (union.isEmpty()) { // To avoid division by zero
            return 0;
        }

        return (double) intersection.size() / union.size();

    }
}
