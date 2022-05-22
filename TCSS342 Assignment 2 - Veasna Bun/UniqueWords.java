import java.io.IOException;

public class UniqueWords {
	// implement UniqueWords
	private BookReader book;

	// constructor UniqueWords
	public UniqueWords() throws IOException {
		book = new BookReader("WarAndPeace.txt");
		addUniqueWordsToArrayList();
		addUniqueWordsToLinkedList();
		addUniqueWordsToOrderedList();
	}

	// UniqueWords Methods
	public void addUniqueWordsToLinkedList() {
		// testing adding duration
		long duration = 0;
		long start = System.currentTimeMillis();
		// testing adding duration
		MyLinkedList<String> MLL = new MyLinkedList<>();
		try {
			book.words.first();
			while (book.words.current() != null) {
				if (!(MLL.contains(book.words.current()))) {
					MLL.addBefore(book.words.current());
				}
				book.words.next();
			}
		} catch (NullPointerException e) {
			// testing adding duration
			long now = System.currentTimeMillis();
			duration = (now - start) / 1000;
			System.out.println("Adding unique words to a linked list... in " + duration + " seconds.");
			System.out.println(MLL.size() + " unique words");
			// testing adding duration
			System.out.println(MLL.comparisons + " comparisons");
			// testing sort duration
			duration = 0;
			start = System.currentTimeMillis();
			MLL.sort();
			now = System.currentTimeMillis();
			duration = (now - start) / 1000;
			System.out.println("Bubble sorting linked list... in " + duration + " seconds.");
			System.out.println();
			// testing sort duration
		}

	}

	public void addUniqueWordsToArrayList() {
		// testing adding duration
		long duration = 0;
		long start = System.currentTimeMillis();
		// testing adding duration
		MyArrayList<String> MAL = new MyArrayList<>();
		try {
			book.words.first();
			while (book.words.current() != null) {
				if (!(MAL.contains(book.words.current()))) {
					MAL.insert(book.words.current(), MAL.size());
				}
				book.words.next();
			}
		} catch (NullPointerException e) {
			long now = System.currentTimeMillis();
			duration = (now - start) / 1000;
			// testing adding duration
			System.out.println("Adding unique words to a array list... in " + duration + " seconds.");
			System.out.println(MAL.size() + " unique words");
			System.out.println(MAL.comparisons + " comparisons");
			// testing sort duration
			duration = 0;
			start = System.currentTimeMillis();
			MAL.sort();
			now = System.currentTimeMillis();
			duration = (now - start) / 1000;
			System.out.println("Bubble sorting array list... in " + duration + " seconds.");
			System.out.println();
			// testing sort duration

		}
	}

	public void addUniqueWordsToOrderedList() {
		// testing adding duration
		long duration = 0;
		long start = System.currentTimeMillis();
		// testing adding duration
		MyOrderedList<String> MOL = new MyOrderedList<>();
		try {
			book.words.first();
			while (book.words.current() != null) {
				if ((MOL.binarySearch(book.words.current()))) {	
				}
				else {
					MOL.add(book.words.current());
				}
				book.words.next();
			}
		} catch (NullPointerException e) {
			long now = System.currentTimeMillis();
			duration = (now - start) / 1000;
			System.out.println("Adding unique words to an ordered list... in " + duration + " seconds.");
			System.out.println(MOL.size() + " unique words");
			System.out.println(MOL.comparisons + " comparisons");
		}

	}

	public static void main(String[] args) throws IOException {
		UniqueWords u = new UniqueWords();
	}
}
