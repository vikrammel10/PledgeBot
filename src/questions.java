import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

import org.json.simple.JSONObject;
public class questions {
	public static void delay(int time)
	{
		try {
		    Thread.sleep(time);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JSONObject obj=new JSONObject();
		obj.put("name","foo");
		obj.put("num",new Integer(100));
		obj.put("balance",new Double(1000.21));
		obj.put("is_vip",new Boolean(true));
		obj.put("nickname",null);
		try(FileWriter file = new FileWriter("json/out.json")) {
			file.write(obj.toJSONString());
		}
		
		Scanner kb = new Scanner(System.in);
		System.out.println("hey, thanks for coming.");
		delay(2000);
		System.out.println("soo... how do i spell your name?");
		String name = kb.nextLine();
		System.out.println("cool, lemme get a sec to write that down");
		delay(2000);
		System.out.println("just to be PC, could you please specify your gender/sex");
		String gender = kb.nextLine();
		String pronoun = null;
		if(gender.equalsIgnoreCase("male"))pronoun = "He";
		if(gender.equalsIgnoreCase("Female"))pronoun = "She";
		if(!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female"))pronoun = "genderneutral";
		System.out.println(" well " + name + " where are you from?");
		String location = kb.nextLine();
		delay(1000);
		System.out.println("no way, I went there once");
		delay(400);
		System.out.println("what year are you?");
		String year = kb.nextLine();
		delay(500);
		if(year.equalsIgnoreCase("junior") || year.equalsIgnoreCase("Senior"))
		{
			System.out.println("dayumm, almost there");
			delay(1450);
			System.out.println("what are you plans");
			String plan= kb.nextLine();
			delay(390);
			System.out.println("ok okay.. well enough of that stuff");
		}
		else if(year.equalsIgnoreCase("super senior"))
		{
			System.out.println("damn, you like this place too much");
			delay(1000);
			System.out.println("jk jk jk... please dont depledge me");
		}
		System.out.println("soo, why South Carolina");
		String reason = kb.nextLine();
		delay(500);
		System.out.println(" thats cool, not bad. I came here for...");
		delay(500);
		System.out.println("Reasons");
		delay(1111);
		System.out.println("What's your major");
		String major = kb.nextLine();
		if(major.equalsIgnoreCase("CE") ||  major.equalsIgnoreCase("computer engineering"))
		{
			System.out.println("no way, are you part of the CE squad");
			String ans1 = kb.nextLine();
			delay(1534);
			if(ans1.equalsIgnoreCase("yes") || ans1.equalsIgnoreCase("yeet"))
			{
				System.out.println("damn, you too real");
			
			}
			
			else
			{
				System.out.println("not everyone is perfect");
			}
			
		
					
		}
		String randomajor = null;
		Random rn = new Random();
		int rand = rn.nextInt(5) + 1;
		if(major.equalsIgnoreCase("biomed") || major.equalsIgnoreCase("BME") || major.equalsIgnoreCase("biomedical engineering") )
		{
			if(rand == 1)randomajor = "CE";
			if(rand == 2)randomajor = "MechE";
			if(rand == 3)randomajor = "ChemE";
		    if(rand == 4)randomajor = "EE";
		    if(rand == 5)randomajor = "Civil";
					
			System.out.println("there there, I hear " + randomajor + " is a good major ");
		}
		
		
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(name + " is a " + year +" " + major + " from " + location + "." + pronoun + " came to USC because " + reason + ".");
		
		
	}

}
