public class FilmsManager {

    private Afisha[] items = new Afisha[0];
    int limit;

    public FilmsManager() {
        limit = 10;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void save(Afisha item) {
        Afisha[] tmp = new Afisha[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public void removeById(int id) {
        Afisha[] tmp = new Afisha[items.length - 1];
        int copyToIndex = 0;
        for (Afisha item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

    public Afisha[] getItemsReversed() {
        Afisha[] findAll = getItems();
        Afisha[] reversed = new Afisha[findAll.length];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = findAll[findAll.length - 1 - i];
        }
        return reversed;
    }

    public Afisha[] getItems() {
        return items;
    }

    public Afisha[] getLastItems() {

        int maxArrayLenght;
        if (items.length < limit) {
            maxArrayLenght = items.length;
        } else {
            maxArrayLenght = limit;
        }
        Afisha[] reversed = new Afisha[maxArrayLenght];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }
}
