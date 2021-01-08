package com.mycompany.horstmann.chapter1.ex14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MagicSquare {

    public static boolean isMagicSquare(InputStream is) {
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<ArrayList<Integer>> elements = new ArrayList<>();
        int count = -1;
        try {
            String line = null;
            while (!(line = br.readLine()).trim().equals("")) {
                String[] element = line.split(" ");
                elements.add(new ArrayList<>());
                count++;
                for (String e : element) {
                    try {
                        elements.get(count).add(Integer.parseInt(e));
                    } catch (NumberFormatException e1) {
                        continue;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < elements.size(); i++) {
            if (elements.size() != elements.get(i).size()) {
                return false;
            }
        }
        if ((elements.size() == 0) || (elements.get(0).size() == 0)) {
            return false;
        }

        for (int i = 0; i < elements.size(); i++) {
            for (int j = 0; j < elements.size() - 1; j++) {
                for (int k = i; k < elements.size(); k++) {
                    for (int l = j + 1; l < elements.size(); l++) {
                        if (elements.get(i).get(j) == elements.get(k).get(l)) {
                            return false;
                        }
                    }
                }
            }
        }

        int valuesSum = 0;
        int checkValue = 0;
        for (int i = 0; i < elements.size(); i++) {
            valuesSum += elements.get(0).get(i);
        }
        //Check rows
        for (int i = 1; i < elements.size(); i++) {
            for (int j = 0; j < elements.size(); j++) {
                checkValue += elements.get(i).get(j);
            }
            if (checkValue != valuesSum) {
                return false;
            }
            checkValue = 0;
        }
        //Check columns
        for (int i = 0; i < elements.size(); i++) {
            for (int j = 0; j < elements.size(); j++) {
                checkValue += elements.get(j).get(i);
            }
            if (checkValue != valuesSum) {
                return false;
            }
            checkValue = 0;
        }
        //Check diagonals
        int mainDiagonal = 0;
        int secondDiagonal = 0;
        for (int i = 0; i < elements.size(); i++) {
            mainDiagonal += elements.get(i).get(i);
            secondDiagonal += elements.get(i).get(elements.size() - 1 - i);
        }
        if ((mainDiagonal != valuesSum) || (secondDiagonal != valuesSum)) {
            return false;
        }
        return true;
    }
}
