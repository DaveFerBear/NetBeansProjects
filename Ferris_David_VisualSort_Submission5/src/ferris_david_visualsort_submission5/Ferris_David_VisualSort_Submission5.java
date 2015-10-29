/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_visualsort_submission5;

import static ferris_david_visualsort_submission5.SortBar.sortList;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author davidferris
 */
public class Ferris_David_VisualSort_Submission5 {

    /**
     * @param args the command line arguments
     */
    public static BarPanel barPanel = new BarPanel();

    public static void main(String[] args) throws InterruptedException, LineUnavailableException {

        int listSize = 50;
        int speed = 10;
        //set up GUI
        JFrame barFrame = new JFrame();

        barFrame.setContentPane(barPanel);
        barFrame.setSize(barPanel.getHeight(), barPanel.getWidth());
        barFrame.setVisible(true);
        barFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //MAIN LOOP
        generate(listSize);
        while (true) {

            //generate random numbers into the array List
            randomize();
            selectionSort(SortBar.sortList);
            barPanel.repaint();
            check();

            randomize();
            insertionSort(SortBar.sortList);
            barPanel.repaint();
            check();
        }
    }

    public static void generate(int size) {
        for (int x = 0; x < size; x++) {
            SortBar.sortList.add(new SortBar(x * 8));
            //SortBar.sortList.get(x).setValue(x*400);
        }
    }

    public static void randomize() {
        for (int x = 0; x < SortBar.sortList.size(); x++) {
            Collections.swap(SortBar.sortList, x, (int) (Math.random() * SortBar.sortList.size()));
        }
    }

    public static void swap(ArrayList<SortBar> list, int index1, int index2) throws InterruptedException, LineUnavailableException {
        //tones
        byte[] byte1 = new byte[1];;
        AudioFormat audio = new AudioFormat((float) 44100, 8, 1, true, false);
        SourceDataLine audioLine = AudioSystem.getSourceDataLine(audio);
        audioLine = AudioSystem.getSourceDataLine(audio);
        audioLine.open(audio);
        audioLine.start();
        
        
        SortBar.sortList.get(index1).setColor(Color.RED);
        SortBar.sortList.get(index2).setColor(Color.RED);
        Collections.swap(list, index1, index2);
        barPanel.repaint();
        
        double c = SortBar.sortList.get(index1).getValue();
        //play tone
         for (int i = 0; i < 1000; i++) {
                double angle = i * c * c / (double) (5000);
                byte1[0] = (byte) (Math.sin(angle) * 100);
                audioLine.write(byte1, 0, 1);
            }
         double d = SortBar.sortList.get(index2).getValue();
        //play tone
         for (int i = 0; i < 1000; i++) {
                double angle = i * d * d / (double) (5000);
                byte1[0] = (byte) (Math.sin(angle) * 100);
                audioLine.write(byte1, 0, 1);
            }
        
        
        Thread.sleep(5);
        SortBar.sortList.get(index1).setColor(Color.BLACK);
        SortBar.sortList.get(index2).setColor(Color.BLACK);
    }

    public static void print(ArrayList<SortBar> list) {
        for (int c = 0; c < list.size(); c++) {
            System.out.print(c + ": ");
            System.out.println(SortBar.sortList.get(c).getValue());
        }
    }

    public static void mergeSort(ArrayList<SortBar> list) throws InterruptedException {

        if (list.size() <= 1) {
            // Recursive case. First, *divide* the list into equal-sized sublists.
            ArrayList<SortBar> left = new ArrayList<>();
            ArrayList<SortBar> right = new ArrayList<>();
            int midpoint = list.size() / 2;
            for (int x = 0; x < midpoint; x++) {
                left.add(SortBar.sortList.get(x));
            }
            for (int y = midpoint; y < list.size(); y++) {
                right.add(list.get(y));
            }

            // recursion
            mergeSort(left);
            mergeSort(right);
            // *Conquer*: merge the now-sorted sublists.
            merge(left, right);
            SortBar.sortList = left;
        }

    }

    public static void check() throws InterruptedException, LineUnavailableException {
        //tones
        byte[] byte1 = new byte[1];;
        AudioFormat audio = new AudioFormat((float) 44100, 8, 1, true, false);
        SourceDataLine audioLine = AudioSystem.getSourceDataLine(audio);
        audioLine = AudioSystem.getSourceDataLine(audio);
        audioLine.open(audio);
        audioLine.start();

        for (int c = 0; c < SortBar.sortList.size(); c++) {
            SortBar.sortList.get(c).setColor(Color.GREEN);
            for (int i = 0; i < 1000; i++) {
                double angle = i * c * c / (double) (5000);
                byte1[0] = (byte) (Math.sin(angle) * 100);
                audioLine.write(byte1, 0, 1);
            }
            barPanel.repaint();
            Thread.sleep(20);

        }
        barPanel.repaint();
        Thread.sleep(100);
        for (int c = 0; c < SortBar.sortList.size(); c++) {
            SortBar.sortList.get(c).setColor(Color.black);

        }
    }

    public static void merge(ArrayList<SortBar> list1, ArrayList<SortBar> list2) {
        int startingPoint = list1.size();
        for (int t = 0; t < list2.size(); t++) {
            list1.add(startingPoint + t, list2.get(t));
        }
    }

    public static void selectionSort(ArrayList<SortBar> list) throws InterruptedException, LineUnavailableException {

        int min;
        for (int m = 0; m < list.size(); m++) {
            min = m;
            for (int j = m; j < list.size(); j++) {
                if (SortBar.sortList.get(j).getValue() < SortBar.sortList.get(min).getValue()) {
                    min = j;
                    Thread.sleep(10);
                }
            }
            swap(SortBar.sortList, min, m);

        }
    }

    public static void insertionSort(ArrayList<SortBar> list) throws InterruptedException, LineUnavailableException {
        int index;
        for (int m = 0; m < list.size(); m++) {
            for (int x = list.size() - 1; x >= 1; x--) {
                for (int y = x - 1; y >= 0; y--) {
                    if (list.get(x).getValue() < list.get(y).getValue()) {
                        swap(SortBar.sortList, y, y + 1);
                    }
                }
            }
        }
    }
}
