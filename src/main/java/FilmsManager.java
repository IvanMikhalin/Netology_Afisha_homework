public class FilmsManager {
    private AfishaRepository repo;

    public FilmsManager(AfishaRepository repo) {
        this.repo = repo;
    }

    public void add(Afisha item) {
        repo.save(item);
    }

    public Afisha[] getItems() {
        Afisha[] findAll = repo.getItems();
        Afisha[] reversed = new Afisha[findAll.length];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = findAll[findAll.length - 1 - i];
        }
        return reversed;
    }

    public Afisha[] getLastItems(int maxArrLenght) {
        Afisha[] findAll = repo.getItems();
        Afisha[] reversed = new Afisha[maxArrLenght];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = findAll[findAll.length - 1 - i];
        }
        return reversed;
    }

    public Afisha[] getLastItemsbyDefault() {
        int maxArrLenght = 10;
        Afisha[] findAll = repo.getItems();
        Afisha[] reversed = new Afisha[maxArrLenght];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = findAll[findAll.length - 1 - i];
        }
        return reversed;
    }
}
