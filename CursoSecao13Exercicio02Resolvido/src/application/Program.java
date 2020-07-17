package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		/*tradu��o: Tenha uma boa viagem!*/
		Comment c1 = new Comment("Have a nice trip!");
		/*tradu��o: Uau, isso � incr�vel!*/
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				/*tradu��o: Viajar para a Nova Zel�ndia*/
				"Traveling to new Zealand",
				/*tradu��o: Eu vou visitar este pa�s maravilhoso!*/
				"I'm going to visit this wonderful country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		/*tradu��o: Boa noite*/
		Comment c3 = new Comment("Good night");
		/*tradu��o: Que a for�a esteja com voc�*/
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				/*tradu��o: Boa noite, galera*/
				"Good night guys",
				/*tradu��o: Te vejo amanh�*/
				"See you tomorrow", 
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
