// Remove vowels from a string

import java.util.Scanner;

class pg14{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = in.nextLine();

        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    continue;
                default:
                    System.out.print(s.charAt(i));

            }
        }

        }

    }
