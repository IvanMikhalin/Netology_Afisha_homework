public class FilmsManager {

    private Afisha[] items = new Afisha[0];

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

    public Afisha[] getLastItems(int maxArrLenght) {
        Afisha[] findAll = getItems();
        Afisha[] reversed = new Afisha[maxArrLenght];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = findAll[findAll.length - 1 - i];
        }
        return reversed;
    }

    public Afisha[] getLastItemsbyDefault() {
        int maxArrLenght = 10; //default
        Afisha[] findAll = getItems();
        Afisha[] reversed = new Afisha[maxArrLenght];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = findAll[findAll.length - 1 - i];
        }
        return reversed;
    }
}
