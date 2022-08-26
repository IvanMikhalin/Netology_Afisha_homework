import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    AfishaRepository repo = new AfishaRepository();
    FilmsManager manager = new FilmsManager(repo);


    Afisha item1 = new Afisha(1, "Бладшот", "боевик", "url1");
    Afisha item2 = new Afisha(2, "Вперед", "мультфильм", "url2");
    Afisha item3 = new Afisha(3, "Отель Белград", "комедия", "url3");
    Afisha item4 = new Afisha(4, "Джентельмены", "боевик", "url4");
    Afisha item5 = new Afisha(5, "Человек невидимка", "ужасы", "url5");
    Afisha item6 = new Afisha(6, "Тролли. Мировой тур", "мультфильм", "url6");
    Afisha item7 = new Afisha(7, "Номер один", "комедия", "url7");
    Afisha item8 = new Afisha(8, "Операция Ы", "комедия", "url8");
    Afisha item9 = new Afisha(9, "Груз 200", "комедия", "url9");
    Afisha item10 = new Afisha(10, "Морфий", "комедия", "url10");
    Afisha item11 = new Afisha(11, "Жесть", "комедия", "url11");

    @BeforeEach
    public void setup() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item11);
        manager.add(item10);

    }

    @Test
    public void shouldShowAllTheFilmsReversed() {
        Afisha[] expected = {item10, item11, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        Afisha[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAddedFilmsReversedDeafault() {
        Afisha[] expected = {item10, item11, item9, item8, item7, item6, item5, item4, item3, item2};
        Afisha[] actual = manager.getLastItemsbyDefault();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldShowLastFiveAddedFilmsReversed() {
        Afisha[] expected = {item10, item11, item9, item8};
        Afisha[] actual = manager.getLastItems(4);

        Assertions.assertArrayEquals(expected, actual);
    }
}