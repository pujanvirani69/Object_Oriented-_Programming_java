import java.util.Scanner;

class Student {
    int id_no;
    double spi;
    int subregistered = 6;
    String[] sub_code = new String[subregistered];
    char[] sub_grade = new char[subregistered];
    int[] sub_credit = new int[subregistered];

    Student() {
        spi = 0;
    }

    void getdata(Scanner sc) {
        System.out.print("Enter Student ID :- ");
        id_no = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Details Of Subjects :- ");
        for (int i = 0; i < subregistered; i++) {
            System.out.print("Enter Subject Code :- ");
            sub_code[i] = sc.nextLine();

            System.out.print("Enter credit Of subject :- ");
            sub_credit[i] = sc.nextInt();

            System.out.print("Enter Subject Grade Obtained By Student :- ");
            sub_grade[i] = sc.next().charAt(0);
            sc.nextLine();
        }
    }

    void calspi() {
        int totalcredit = 0;
        int totalpts = 0;
        for (int i = 0; i < subregistered; i++) {
            int gradepts = 0;

            if (sub_grade[i] == 'A') {
                gradepts = 10;
            } else if (sub_grade[i] == 'B') {
                gradepts = 8;
            } else if (sub_grade[i] == 'C') {
                gradepts = 6;
            } else if (sub_grade[i] == 'D') {
                gradepts = 4;
            } else if (sub_grade[i] == 'E') {
                gradepts = 2;
            } else if (sub_grade[i] == 'F') {
                gradepts = 0;
            }
            totalcredit += sub_credit[i];
            totalpts += gradepts * sub_credit[i];
        }
        spi = (double) totalpts / totalcredit;
    }

    void dispspi() {
        System.out.println(id_no + ":" + spi);
        System.out.println("----------------------");
    }
}

public class StudentSpiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Students :- ");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].getdata(sc);
            s[i].calspi();
        }
        for (int j = 0; j < n; j++) {
            System.out.print("SPI Of Students :- ");
            s[j].dispspi();
        }
        sc.close();
    }
}