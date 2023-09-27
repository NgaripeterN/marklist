package marklist;

import java.util.Scanner;

public class Marklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 long[] roll = new long[4];
	        String[] name = new String[4];
	        int[] mark1 = new int[4];
	        int[] mark2 = new int[4];
	        int[] mark3 = new int[4];
	        int[] total = new int[4];
	        float[] average = new float[4];
	        String[] grade = new String[4];
	        char[] result = new char[4];

	        // Initialize the roll numbers to 101-104
	        for (int i = 0; i < 4; i++) {
	            roll[i] = 101 + i;
	        }

	        for (int i = 0; i < 4; i++) {
	            System.out.print("Enter Name: ");
	            name[i] = scanner.next();

	            System.out.print("Enter Mark1: ");
	            mark1[i] = scanner.nextInt();

	            System.out.print("Enter Mark2: ");
	            mark2[i] = scanner.nextInt();

	            System.out.print("Enter Mark3: ");
	            mark3[i] = scanner.nextInt();

	            total[i] = mark1[i] + mark2[i] + mark3[i];
	            average[i] = (float) total[i] / 3;

	            String formattedVariable1 = String.format("%.1f", average[i]);

	            if (average[i] >= 80 && average[i] <= 100) {
	                grade[i] = "A";
	            } else if (average[i] >= 75 && average[i] < 80) {
	                grade[i] = "B+";
	            } else if (average[i] >= 65 && average[i] < 75) {
	                grade[i] = "B";
	            } else if (average[i] >= 55 && average[i] < 65) {
	                grade[i] = "C+";
	            } else if (average[i] >= 50 && average[i] < 55) {
	                grade[i] = "C";
	            } else if (average[i] >= 40 && average[i] < 50) {
	                grade[i] = "C+";
	            } else if (average[i] <= 39) {
	                grade[i] = "F";
	            }

	            result[i] = (total[i] >= 210) ? 'P' : 'F';
	        }
	        //Display header
	        System.out.println("***************************************************************************************");
	        System.out.println("\t\t\t\t STUDENT MARKLIST   ");
	        System.out.println("************************************************************************************** ");
	        System.out.println("ROLL\t" + "NAME\t\t" + "MARK1\t" + "MARK2\t" + "MARK3\t" + "TOTAL\t" + "RESULT\t" + "AVERAGE\t" + "GRADE\t");
	        for (int i = 0; i < 4; i++) {
	            System.out.print("" + roll[i] + "\t" + "" + name[i] + "\t\t" + "" + mark1[i] + "\t" + mark2[i] + "\t" + mark3[i] + "\t" + total[i] + "\t");
	            String formattedVariable1 = String.format("%.1f", average[i]);
				System.out.println("" + result[i] + "\t" +formattedVariable1+ "\t  " + grade[i]);
	        }
	    }
	}


