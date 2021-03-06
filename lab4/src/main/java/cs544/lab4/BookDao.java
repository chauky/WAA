package cs544.lab4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cs544.lab4.NoSuchResourceException;

public class BookDao implements IBookDao {
	private static int idCount = 1;
	private Map<Integer, Book> books = new HashMap<>();

	public BookDao() {
		add(new Book("WAA", "CS545", "Orlando", 1234));
		add(new Book("EA", "CS544", "Arocha", 5465));
	}

	@Override
	public List<Book> getAll() {
		return new ArrayList<Book>(books.values());
	}

	@Override
	public void add(Book book) {
		book.setId(idCount);
		books.put(idCount, book);
		idCount++;
	}

	@Override
	public Book get(int id) {
		Book result = books.get(id);

		if (result == null) {
			throw new NoSuchResourceException("Book", id);
		}

		return result;
	}

	@Override
	public void update(int bookId, Book book) {
		books.put(bookId, book);
	}

	@Override
	public void delete(int bookId) {
		Book removed = books.remove(bookId);
		if (removed == null) {
			throw new NoSuchResourceException("Book", bookId);
		}
	}
}
