package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		/*tradução: Tenha uma boa viagem!*/
		Comment c1 = new Comment("Have a nice trip!");
		/*tradução: Uau, isso é incrível!*/
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				/*tradução: Viajar para a Nova Zelândia*/
				"Traveling to new Zealand",
				/*tradução: Eu vou visitar este país maravilhoso!*/
				"I'm going to visit this wonderful country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		/*tradução: Boa noite*/
		Comment c3 = new Comment("Good night");
		/*tradução: Que a força esteja com você*/
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				/*tradução: Boa noite, galera*/
				"Good night guys",
				/*tradução: Te vejo amanhã*/
				"See you tomorrow", 
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
