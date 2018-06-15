/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import java.util.Arrays;

/**
 *
 * @author
 * UCD ID: 17209226
 * Name: Maduka Chamod Wijesena
 */
public class Score {

    int noOfLettters; // word lenght
    double roundScore; // total Score of the round
    double bones; //total bones
    int initialBones = 3;
    int maxLenthBones = 5;
    int[] position = {1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int hightScoreBones = 5;

    public void getTotalScore(String word, String letter1, String letter2, String letter3, int unUsedLetter) {
        //calculate total marks of current round with bonus
        noOfLettersUsed(word);
        checkIfInitiolUsed(letter1, letter2, letter3, word);
        getScorePosition(unUsedLetter);
        if (noOfLettters == 11) {
            bones = bones + maxLenthBones;
        }
        roundScore = bones + roundScore;
        System.out.println(String.valueOf(roundScore));
    }

    public void checkHightScore(double[] scoresOfPlayers) {
        //compare score of players and show current round winner
//        Arrays.sort(scoresOfPlayer); 
//        System.out.printf("Modified arr[] : %s", Arrays.toString(scoresOfPlayer));

        int maxAt = 0;
        for (int i = 0; i < scoresOfPlayers.length; i++) {
            maxAt = scoresOfPlayers[i] > scoresOfPlayers[maxAt] ? i : maxAt;
        }

        System.out.println("max value at " + maxAt);
        System.out.println("hight Score is: " + scoresOfPlayers[maxAt] + 5);

        switch (maxAt) {
            case 0:
                System.out.println("Player 1 has hight Score");
                break;
            case 1:
                System.out.println("Player 2 has hight Score");
                break;
            case 2:
                System.out.println("Player 3 has hight Score");
                break;
            case 3:
                System.out.println("Player 4 has hight Score");
                break;
            default:
                break;
        }

    }

    public double calculate(double[] scoresPerRound) {
        //calculate overroll point and return final marks
        double finalMark = 0;
        for (int i = 0; scoresPerRound.length >= i; i++) {
            finalMark = scoresPerRound[i];
        }
        return finalMark;
    }

    public void noOfLettersUsed(String word) {
        //return the length of the letter
        noOfLettters = word.length();
    }

    public void checkIfInitiolUsed(String letter1, String letter2, String letter3, String word) {
        //check given letters has used and retun the value if that letter used
        for (int i = 0; noOfLettters > i; i++) {
            String letter = word.trim().substring(i, i + 1);
            if (letter.equals(letter1) || letter.equals(letter2) || letter.equals(letter3)) {
                bones = bones + initialBones;
            }

            if (letter.equals("J") || letter.equals("Q") || letter.equals("Z")) {
                bones = bones + 8;
            }
        }
    }

    public void getScorePosition(int unUsedLetter) {
        //using lenth of word give the score
        for (int i = 0; noOfLettters > i; i++) {
            roundScore = roundScore + position[i];
        }

        roundScore = roundScore + (11 - noOfLettters) * (-2); // reduse score if not length 11
        roundScore = roundScore + roundScore * (-2);
    }

}
