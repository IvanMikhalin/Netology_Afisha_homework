import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaRepositoryTest {

    Afisha item1 = new Afisha(1, "Бладшот", "боевик", "url1");
    Afisha item2 = new Afisha(2, "Вперед", "мультфильм", "url2");
    Afisha item3 = new Afisha(3, "Отель Белград", "комедия", "url3");
    Afisha item4 = new Afisha(4, "Джентельмены", "боевик", "url4");
    Afisha item5 = new Afisha(5, "Человек невидимка", "ужасы", "url5");
    Afisha item6 = new Afisha(6, "Тролли. Мировой тур", "мультфильм", "url6");
    Afisha item7 = new Afisha(7, "Номер один", "комедия", "url6");


    @Test
    public void shouldDeleteFilmsById() {
        AfishaRepository repo = new AfishaRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.removeById(item2.getId());
        repo.removeById(item5.getId());

        Afisha[] expected = {item1, item3, item4, item6, item7};
        Afisha[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddnewFilms() {
        AfishaRepository repo = new AfishaRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);

        Afisha[] expected = {item1, item2, item3, item4, item5, item6, item7};
        Afisha[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);

    }


}
