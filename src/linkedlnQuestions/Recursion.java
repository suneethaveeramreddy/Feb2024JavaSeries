package linkedlnQuestions;

public class Recursion {

	int func(int n)
	{
		int result;
		if(n==1)
			return 1;
		result = func(n-1);
		return result;
	}

	}


