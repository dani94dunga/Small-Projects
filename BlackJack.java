package Learn;


import java.util.HashMap;

public class BlackJack {
    public static void main(String[] args) {
        String[] blackjack = {"ace","queen"};
        System.out.println(BlackjackHighest(blackjack));

    }

    public static String BlackjackHighest(String[] strArr) {
        if( (strArr[0] == "ace" && strArr[1] == "queen") || (strArr[1] == "ace" && strArr[0] == "queen")){
            return "blackjack ace";
        }
        int total = 0;
        int count = 0;
        String highest = "";
        int number = 0;
        boolean aceCheck = false;
        HashMap<String, Integer> blackjack = new HashMap<>();
        blackjack.put("two", 2);
        blackjack.put("three", 3);
        blackjack.put("four", 4);
        blackjack.put("five", 5);
        blackjack.put("six", 6);
        blackjack.put("seven", 7);
        blackjack.put("eight", 8);
        blackjack.put("nine", 9);
        blackjack.put("ten", 10);
        blackjack.put("jack", 10);
        blackjack.put("queen", 10);
        blackjack.put("king", 10);
        blackjack.put("ace", 11);


        for (int i = 0; i < strArr.length; i++){
            total += blackjack.get(strArr[i]);
            if (strArr[i] == "ace") aceCheck = true;
            if (aceCheck == true && (total > 21) && count == 0){
                blackjack.replace("ace", 1);
                count++;
                i = 0;
                total = blackjack.get(strArr[0]);
            }
            if (number < blackjack.get(strArr[i])){
                highest = strArr[i];
            }
        }

        if (total < 21){
            strArr[0] = "below " + highest;
        }else if (total == 21){
            strArr[0] = "blackjack";
        }else {
            strArr[0] = "above " + highest;
        }


        /*int[] numbers = new int[strArr.length];
        int total = 0;
        int highestCard = 0;
        String card = "";
        if ((strArr[0] == "ace" && strArr[1] == "queen") || (strArr[1] == "ace" && strArr[0] == "queen")){
            return "blackjack ace";
        }
        for(int i = 0; i < strArr.length; i++){
            switch (strArr[i]) {
                case "two":
                    numbers[i] = 2;
                    break;
                case "three":
                    numbers[i] = 3;
                    break;
                case "four":
                    numbers[i] = 4;
                    break;
                case "five":
                    numbers[i] = 5;
                    break;
                case "six":
                    numbers[i] = 6;
                    break;
                case "seven":
                    numbers[i] = 7;
                    break;
                case "eight":
                    numbers[i] = 8;
                    break;
                case "nine":
                    numbers[i] = 9;
                    break;
                case "ten":
                    numbers[i] = 10;
                    break;
                case "ace":
                    numbers[i] = 11;
                    break;
                case "jack":
                    numbers[i] = 10;
                    break;
                case "queen":
                    numbers[i] = 10;
                    break;
                case "king":
                    numbers[i] = 10;
                    break;
            }
            if (highestCard < numbers[i]){
                highestCard = numbers[i];
                card = strArr[i];
            }
            total += numbers[i];
        }
        for(int i = 0; i < strArr.length; i++){
            if (total > 21 && strArr[i] == "Ace"){
                total -= 10;
            }
        }
        if (total < 21){
            strArr[0] = "below" + card;
        }else if (total == 21){
            strArr[0] = "blackjack";
        }else {
            strArr[0] = "above king";
        }
         */
        System.out.println(total);
        return strArr[0];
    }
}