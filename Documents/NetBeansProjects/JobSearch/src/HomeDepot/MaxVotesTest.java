/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeDepot;

/**
 *
 * @author Dotmons
 */
import java.util.*;
import java.util.stream.Collectors;

public class MaxVotesTest {

    public static void main(String[] args) {
        String[] votes = {"a", "c", "b", "b", "a", "d", "a", "b", "a", "c", "y", "y", "y", "y", "y", "y"};
        getMaxVote(votes);
        List<String> voteList = Arrays.asList(votes);
        Map<String, Long> voteCountMap = voteList.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        Long max = voteCountMap.values().stream().max(Comparator.comparing(Long::longValue)).get();
        Map<String, Long> maxVotesMap = voteCountMap.entrySet().stream().filter(e -> e.getValue()
                == max).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
        List<String> maxVotedMembers = maxVotesMap.keySet().stream().collect(java.util.stream.Collectors.toList());
        Collections.sort(maxVotedMembers);
        System.out.println(maxVotedMembers.get(maxVotedMembers.size() - 1));
    }

    public static char getMaxVote(String[] votes) {
        Arrays.sort(votes);
        int count = 0;

        int lastvalue = 0;
        char lastChar = votes[0].charAt(0);
        char initValue = votes[0].charAt(0);

        for (String vote : votes) {
            if (vote.charAt(0) == initValue) {
                count++;
            } else {
                if (count > lastvalue) {
                    lastChar = initValue;
                    lastvalue = count;
                }
                initValue = vote.charAt(0);
                count = 1;
            }
        }

        if (count > lastvalue) {
            lastChar = initValue;
            lastvalue = count;
        }

        System.out.println("Last char : " + lastChar + " Total: " + lastvalue);
        return lastChar;
    }
}
