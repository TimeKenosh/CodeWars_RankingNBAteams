import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Info {
    public List<String> getListOfMatches() {
        String[] listOfMatches1 = resultSheet3.split(",");
        List<String> listOfMatches2 = new ArrayList<>();
        for (String s : listOfMatches1) {
            listOfMatches2.add(s + " ");
        }
        return listOfMatches2;
    }

    public List<String> getNecessaryTeam(List<String> list, String teamName) {
        List<String> necessaryTeam = new ArrayList<>();
        for (String s : list) {
            if (s.contains(teamName)) {
                necessaryTeam.add(s);
            }
        }
        return necessaryTeam;
    }

    public List<Integer> result(List<String> list, String name) {
        List<Integer> resultIntegerList = new ArrayList<>();
        List<Integer> listScoreBothTeams = new ArrayList<>();
        int myTeamScore = 0;
        Pattern myTeamPattern = Pattern.compile(name + " \\d+ ");
        Pattern bothTeamsPattern = Pattern.compile(" \\d+ ");
        for (String s : list) {
            Matcher myTeamMatcher = myTeamPattern.matcher(s);
            Matcher bothTeamsMatcher = bothTeamsPattern.matcher(s);
            while (myTeamMatcher.find()) {
                Pattern myTeamScorePattern = Pattern.compile(" \\d+ ");
                Matcher myTeamScoreMatcher = myTeamScorePattern.matcher(myTeamMatcher.group());
                while (myTeamScoreMatcher.find()) {
                    String myTeamScoreString = myTeamScoreMatcher.group();
                    myTeamScoreString = myTeamScoreString.trim();
                    myTeamScore = Integer.parseInt(myTeamScoreString);
                }
                while (bothTeamsMatcher.find()) {
                    String check = bothTeamsMatcher.group();
                    check = check.trim();
                    listScoreBothTeams.add(Integer.valueOf(check));
                }
            }

            if (myTeamScore != listScoreBothTeams.get(listScoreBothTeams.size() - 2)) {
                Collections.addAll(resultIntegerList, listScoreBothTeams.get(listScoreBothTeams.size() - 1), listScoreBothTeams.get(listScoreBothTeams.size() - 2));
            } else {
                Collections.addAll(resultIntegerList, listScoreBothTeams.get(listScoreBothTeams.size() - 2), listScoreBothTeams.get(listScoreBothTeams.size() - 1));
            }
        }
        return resultIntegerList;
    }

    String resultSheet1 = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
            + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
            + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
            + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
            + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
            + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
            + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 95,";
    String resultSheet2 = "San Antonio Spurs 111 Houston Rockets 86,Chicago Bulls 103 Dallas Mavericks 102,Minnesota Timberwolves 112 Milwaukee Bucks 108,"
            + "New Orleans Pelicans 93 Miami Heat 90,Boston Celtics 81 Philadelphia 76ers 65,Detroit Pistons 115 Atlanta Hawks 87,"
            + "Toronto Raptors 92 Washington Wizards 82,Orlando Magic 86 Memphis Grizzlies 76,Los Angeles Clippers 115 Portland Trail Blazers 109,"
            + "Los Angeles Lakers 97 Golden State Warriors 136,Utah Jazz 98 Denver Nuggets 78,Boston Celtics 99 New York Knicks 85,"
            + "Indiana Pacers 98 Charlotte Hornets 86,Dallas Mavericks 87 Phoenix Suns 99,Atlanta Hawks 81 Memphis Grizzlies 82,"
            + "Miami Heat 110 Washington Wizards 105,Detroit Pistons 94 Charlotte Hornets 99,Orlando Magic 110 New Orleans Pelicans 107,"
            + "Los Angeles Clippers 130 Golden State Warriors 95,Utah Jazz 102 Oklahoma City Thunder 113,San Antonio Spurs 84 Phoenix Suns 104,"
            + "Chicago Bulls 103 Indiana Pacers 94,Milwaukee Bucks 106 Minnesota Timberwolves 88,Los Angeles Lakers 104 Portland Trail Blazers 102,"
            + "Houston Rockets 120 New Orleans Pelicans 100,Boston Celtics 111 Brooklyn Nets 105,Charlotte Hornets 94 Chicago Bulls 86,Cleveland Cavaliers 103 Dallas Mavericks 97";
    String resultSheet3 = resultSheet1 + resultSheet2;
}