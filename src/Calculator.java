import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    public List<Integer> getResult(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        int countWins = 0;
        int countDraws = 0;
        int countLoses = 0;
        int score = 0;
        int conceded = 0;
        int points = 0;

        for (int i = 0; i < list.size(); i+=2){
            score += list.get(i);
            conceded += list.get(i+1);
            if (list.get(i) > list.get(i+1)) {
                countWins++;
                points += 3;
            }
            if (list.get(i) < list.get(i+1)) {
                countLoses++;
            }
            if (list.get(i) == list.get(i+1)) {
                countDraws++;
                points++;
            }
        }
        result.addAll(Arrays.asList(countWins, countDraws, countLoses, score, conceded, points));

        return result;
    }
}
