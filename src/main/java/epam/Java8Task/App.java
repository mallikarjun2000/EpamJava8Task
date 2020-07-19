package epam.Java8Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> listOfNumbers = new ArrayList<Integer>();
        System.out.println("Average of the numbers :");
        listOfNumbers.add(1);
        listOfNumbers.add(23);
        listOfNumbers.add(45);
        //Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<listOfNumbers.size();i++)
        {
        	sum += listOfNumbers.get(i);
        }
        System.out.println(sum/listOfNumbers.size());
        System.out.println("\nNon Palindromic numbers :");
        List<String> listOfStrings = new ArrayList<String>();
        listOfStrings.add("Hello");
        listOfStrings.add("racecar");
        listOfStrings.add("impossilbe");
        listOfStrings.add("eleven");
        listOfStrings.add("topSpot");
        listOfStrings.add("NolemonnomeloN");
        listOfStrings.add("good morning");
        listOfStrings.add("bob");
        UseStreamTask useStreamTask = new UseStreamTask();
        listOfStrings = useStreamTask.filerPalindromes(listOfStrings);
        for(int i=0;i<listOfStrings.size();i++)
        {
        	System.out.println(listOfStrings.get(i));
        }
        List<String> listOfStr = new ArrayList<String>();
        listOfStr.add("ant");
        listOfStr.add("Aeroplane");
        listOfStr.add("add");
        listOfStr.add("Balloon");
        listOfStr.add("Elephant");
        System.out.println("\nString starting with A and of Length 3: ");
        listOfStr = useStreamTask.filterStrings(listOfStr);
        for(int i=0;i<listOfStr.size();i++)
        {
        	System.out.println(listOfStr.get(i));
        }
        return ;
    }
}
