package Program;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Initiating");
		Thread.sleep(2000);
		System.out.println("");
		PrintIntroduction();
		
		
	}
	
	public static void PrintIntroduction()
	{
		
		String AnswerMain;
		Scanner IntroAnswer = new Scanner(System.in);
		
		System.out.println("X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X");
		System.out.println("Welcome To The Formula, What Can I Help You With?");
		System.out.println("X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X=X");
		System.out.println("H                                               H");
		System.out.println("H                                               H");
		System.out.println("H                                               H");
		System.out.println("X===============================================X");
		System.out.println(">1. What is The Formula?");
		System.out.println(">2. What is my name?");
		System.out.println(">3. Do you want to order?");
		System.out.println("X===============================================X");
		System.out.print(">> ");
		AnswerMain = IntroAnswer.nextLine();
		
		switch(AnswerMain) {
		
		case "1":
			FormulaFAQ();
			break;
		case "2":
			ChatBotMain();
			break;
		case "3":
			
			break;
		
		}
		
		
		
		
		
	}
	
	public static void FormulaFAQ()
	{
		String FAQMain;
		Scanner FAQAnswer = new Scanner(System.in);
		System.out.println("\nDISCLAIMER!\n");
		System.out.println("X+==============================================================+X");
		System.out.println("\n*ALWAYS USE LOWERCASE WHEN ASKING THE BOT*");
		System.out.println("\nRemember, Feel free to type 'Exit' to return to the main menu");
		System.out.println("X+==============================================================+X");
		
		System.out.println("\n");
		System.out.println("OK, Lets talk about the Frequently Asked Questions.");
		System.out.println("\nAsk Me Anything\n");
		
		System.out.print(">>");
		FAQMain = FAQAnswer.nextLine();
		
		if(FAQMain.contains("what is")) {
			System.out.println("The Formula is a restaurant based in Japan, and is founded by 2021 Formula One driver Yuki Tsunoda.");
		}
			else if (FAQMain.contains("what does")) {
				System.out.println("The Formula provides customers with a wide variety of luxorious consumables, which also includes all Formula One Driver's favorite dishes.");
			}
			else if (FAQMain.contains("when was")){
				System.out.println("The Formula was founded in January 13 2023 by AlphaTauri Racing Engineer, Matsumoto Keshi, With the intent of feeding fans and guest with a wide variety of dishes");
			}
			else if (FAQMain.contains("who owns")) {
				System.out.println("The Formula is owned by Yuki Tsunoda, AlphaTauri Racing's Driver.");
			}
			else if (FAQMain.contains("how was"))
			{
				System.out.println("When Yuki Tsunoda was in an interview at a hamptionship of what he wanted to achieve as a Formula One Driver, He answered to open a Restaurant");
			}
			else if (FAQMain.contains("how much do")) {
				System.out.println("dishes can vary based on the day and time they are served, It will also depend what type of dish the customer has ordered");
				System.out.println("\nFeel free to check out the menu on the homepage");
			}
			else {
				System.out.println("I'm Sorry, It seems that i cannot answer that in the meantime, Would you like to ask me another question?");
			}
		System.out.print(">>");
		FAQMain = FAQAnswer.nextLine();
	
		if(FAQMain.contains("exit")) 
		{
			PrintIntroduction();
		}
	}
	
	public static void ChatBotMain() {
		Scanner Name = new Scanner(System.in);
		System.out.println("Hello, I'm Bottie.");
		System.out.println("\n What is your name?");
		String askName = Name.nextLine();
		System.out.println("\nHello "+ askName);
		
		System.out.println("On a scale of 1-10, How would you rate your mood, "+ askName);
		String status = Name.nextLine();
		
		
		
	}
	
		

		
		
}



//Chatbot
