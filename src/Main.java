import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Н.Н.Таллеб", "Черный лебедь", 735));
        bookList.add(new Book("Н.Н.Таллеб", "Антихрупкость", 768));
        bookList.add(new Book("А.Курпатов", "Красная таблетка", 375));
        bookList.add(new Book("А.Курпатов", "Красная таблетка-2", 352));
        bookList.add(new Book("А.Курпатов", "Чертоги разума", 416));
        bookList.add(new Book("А.Курпатов", "Троица", 417));
        bookList.add(new Book("А.Курпатов", "Четвертая мировая война", 400));
        bookList.add(new Book("А.Курпатов", "Складка времени", 240));
        bookList.add(new Book("Г.Марш", "Призвание", 320));
        bookList.add(new Book("Г.Марш", "Не навреди", 336));
        bookList.add(new Book("Ф.Углов", "Сердце хирурга", 512));
        bookList.add(new Book("П.Каланити", "Когда дыхание растворяется в воздухе", 208));
        bookList.add(new Book("Б.Веббер", "Империя ангелов", 448));

        Set<Book> bookSet = new TreeSet<>(new ComparatorPages());

        bookSet.addAll(bookList);

        for (Book book : bookSet) {
            System.out.println(book.getName() + " - " + book.getPages() + " страниц");
        }
    }
}
