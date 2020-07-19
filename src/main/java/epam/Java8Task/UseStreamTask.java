package epam.Java8Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;

public class UseStreamTask {
	
	public Boolean isPalindrome(String word) {
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i) != word.charAt(word.length()-i-1))
				return false;
		}
		return true;
	}
	
	public List<String> filerPalindromes(List<String> list)
	{
		Stream<String> result = list.stream();
		List<String> filteredResult = result
				.filter(word -> isPalindrome(word))
				.collect(Collectors.toList());
		
		return filteredResult;
	}
	
	public Boolean isContainAOfSize3(String str)
	{
		if(str.charAt(0) == 'a' && str.length() == 3)
			return true;
		
		return false;
	}
	
	public List<String> filterStrings(List<String> list)
	{
		Stream<String> stream = list.stream();
		List<String> result = stream
				.filter(word -> isContainAOfSize3(word))
				.collect(Collectors.toList());
		
		return result;
	}
}
