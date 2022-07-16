package Exercises;

public class DNA {

    public static String dnaCompliment(String s) {
        //write your code here
        String[] splitDNA = s.split("");
        String[] reverseDNA = new String[splitDNA.length];
        for (int i = splitDNA.length - 1; i >= 0; i--) {
            String letter = splitDNA[i];
            reverseDNA[reverseDNA.length - 1 - i] = letter;
        }
//        System.out.println(Arrays.toString(reverseDNA));
        for (int i = 0; i < reverseDNA.length; i++) {
            if (reverseDNA[i].equals("A")) {
                reverseDNA[i] = "T";
            } else if (reverseDNA[i].equals("T")) {
                reverseDNA[i] = "A";
            } else if (reverseDNA[i].equals("G")) {
                reverseDNA[i] = "C";
            } else if (reverseDNA[i].equals("C")) {
                reverseDNA[i] = "G";
            }
        }
        return String.join("", reverseDNA);
    }

    static String DNA = "GTCAG";

    public static void main(String[] args) {
        System.out.println(dnaCompliment(DNA));
    }
}
