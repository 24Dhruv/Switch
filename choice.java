import java.util.Scanner;

public class swi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
              int choice =  sc.nextInt();

              switch (choice) {
                case 0:
                System.out.println("stop");
                    break;
                case 1:
                {
                    int marks = sc.nextInt();
                    if (marks >= 90) {
                        System.out.println("This is Good");
                    }
                    else if (89 <= marks ){
                    System.out.println("This is ALSO good");
                    }
                    else if (marks>= 60 ){
                        System.out.println("This is ALSO a good");
                        }
                    else if (marks <=59){
                        System.out.println("good");
                    }
                    break;
                }

                default: System.out.println("invalid");
                    break;
              }
        }
    }
