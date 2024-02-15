// Interfaz Iterator
interface MyIterator<T> {
    hasNext(): boolean;
    next(): T | null;
}

// Clase concreta que implementa Iterator para libros
class BookIterator implements MyIterator<string> {
    private books: string[];
    private position: number = 0;

    constructor(books: string[]) {
        this.books = books;
    }

    hasNext(): boolean {
        return this.position < this.books.length;
    }

    next(): string | null {
        if (this.hasNext()) {
            return this.books[this.position++];
        }
        return null;
    }
}

// Interfaz Iterable
interface MyIterable<T> {
    iterator(): MyIterator<T>;
}

/* Clase concreta que implementa Iterable para una colección de libros*/
class BookCollection implements MyIterable<string> {
    private books: string[];

    constructor(books: string[]) {
        this.books = books;
    }

    iterator(): MyIterator<string> {
        return new BookIterator(this.books);
    }
}

// Cliente
function test() {
    // Crear una colección de libros
    const booksArray: string[] = [
        "Libro 1",
        "Libro 2",
        "Libro 3",
        "Libro 4",
        "Libro 5",
    ];
    const bookCollection: MyIterable<string> = new    
    BookCollection(booksArray);

    /* Utilizar el iterador para recorrer la 
       colección */
    const iterator: MyIterator<string> = 
    bookCollection.iterator();
    while (iterator.hasNext()) {
        const book: string = iterator.next()!;
        console.log("Libro:", book);
    }
}

test();
