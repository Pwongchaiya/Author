import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Main {


    public static void main(String[] args) {
        ArrayList<String> catalog = new ArrayList<>();
        catalog.add("On the Road");
        Authors jack = new Authors("Jack Kerouac", catalog);
        System.out.println(jack);
    }
    public static void addToLibraryUsers(String userName, ArrayList<String> list){
        list.add(userName);
        System.out.println(userName +" was added");
    }
    public static void removeUser(String userName, ArrayList<String> list){
        list.remove(userName);
        System.out.println(userName +" was removed");

    }
    public static String searchUser(String userName, ArrayList<String> list){

        if (list.contains(userName)){
            for (int i = 0; i <= list.size()-1; i++) {
                if (userName.equals(list.get(i))){
                    return userName+" is at index " + i;
                }
            }
        }
        return "User "+userName+" does not exist";
    }

    public static int randomNum(int[] arr){
        Random rand = new Random();

        return arr[rand.nextInt(arr.length-1)];
    }

    static void stringManipulation(String s){
        StringBuilder newString = new StringBuilder(s.charAt(0));
        for (int i = s.length()-1; i > 0; i--) {
            newString.append(s.charAt(i));
        }
        System.out.println(newString);
    }

    static boolean prime(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                System.out.println(num + " is divisible by "+i+" therefore it is not a prime number");
                return false;
            }
        }
        System.out.println(num+ " is a Prime Number");
        return true;
    }

    static int sumArray(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int productOfTwoArray(int[] arr1, int[] arr2){
        return sumArray(arr1) * sumArray(arr2);
    }
}
