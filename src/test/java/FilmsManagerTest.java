import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    FilmsManager manager = new FilmsManager();

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

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item11);

}
    @Test
    public void shouldShowAllTheFilmsReversed() {

        Afisha[] expected = {item11, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        Afisha[] actual = manager.getItemsReversed();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAddedFilmsReversedDefault() {


        Afisha[] expected = {item11, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        Afisha[] actual = manager.getLastItems();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldShowLastFourAddedFilmsReversed() {

        FilmsManager manager = new FilmsManager(4);

        Afisha item1 = new Afisha(1, "Бладшот", "боевик", "url1");
        Afisha item2 = new Afisha(2, "Вперед", "мультфильм", "url2");
        Afisha item3 = new Afisha(3, "Отель Белград", "комедия", "url3");
        Afisha item4 = new Afisha(4, "Джентельмены", "боевик", "url4");
        Afisha item5 = new Afisha(5, "Человек невидимка", "ужасы", "url5");
        Afisha item6 = new Afisha(6, "Тролли. Мировой тур", "мультфильм", "url6");
        Afisha item7 = new Afisha(7, "Номер один", "комедия", "url7");
        Afisha item8 = new Afisha(8, "Операция Ы", "комедия", "url8");
        Afisha item9 = new Afisha(9, "Груз 200", "комедия", "url9");
        Afisha item11 = new Afisha(11, "Жесть", "комедия", "url11");

            manager.save(item1);
            manager.save(item2);
            manager.save(item3);
            manager.save(item4);
            manager.save(item5);
            manager.save(item6);
            manager.save(item7);
            manager.save(item8);
            manager.save(item9);
            manager.save(item11);

        Afisha[] expected = {item11, item9, item8, item7};
        Afisha[] actual = manager.getLastItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDeleteFilmsById() {

        manager.removeById(item2.getId());
        manager.removeById(item5.getId());

        Afisha[] expected = {item1, item3, item4, item6, item7, item8, item9, item11};
        Afisha[] actual = manager.getItems();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddNewFilms() {
        manager.save(item10);

        Afisha[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item11, item10};
        Afisha[] actual = manager.getItems();
        Assertions.assertArrayEquals(expected, actual);

    }
}
