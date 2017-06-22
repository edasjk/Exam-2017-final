package lt.akademija.exam.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClientService {

	private static List<Client> clients = new ArrayList<Client>();
	private static Long id = 3L;

	/*
	 * Add some clients for testing
	 */
	
	static {
		
	clients.add(new Client(1L, "Jonas", "Jonaitis", "1990.01.01", "8677 12345"));
	clients.add(new Client(2L, "Petras", "Petraitis", "1991.01.02", "8677 222222"));
	clients.add(new Client(3L, "Juozas", "Juozaitis", "1992.01.02", "8677 222222"));
	clients.add(new Client(4L, "Kestas", "Keistutis", "1993.01.01", "8677 12345"));
	clients.add(new Client(5L, "Danys", "Danaitis", "1994.02.02", "8677 11223"));
	clients.add(new Client(6L, "Ona", "Onaite", "1995.02.02", "8677 11223"));
	clients.add(new Client(7L, "Birute", "Birutyte", "1996.02.02", "8677 11223"));
	
	}
	
	/*
	 * Client list
	 * (add filter to show 5 clients with largest inventory weight) 
	 */
    public List<Client> getClients() {
        List<Client> listClient = new ArrayList<Client>();
        for (Client client : listClient) {
			listClient.add(client);
		}
        return listClient;
    }
//    
//    public Book getBook(Long id) {
//    	for (Book book : books) {
//			if (book.getId()==id) {
//				return book;
//			}
//		}
//    	return null;
//    }
//		
//
////    public void addBook(String title, String author) {
////        books.add(new Book(++id, title, author));
////    }
//
//    public void deleteBook(Long id) {
//        Iterator<Book> iterator = books.iterator();
//        while (iterator.hasNext()) {
//            Book book = iterator.next();
//            if (book.getId() == id) {
//                iterator.remove();
//            }
//        }    	
//    }
	
	
}
