//public class AfishaRepository {
//
////    private Afisha[] items = new Afisha[0];
////
////    public void save(Afisha item) {
////        Afisha[] tmp = new Afisha[items.length + 1];
////        for (int i = 0; i < items.length; i++) {
////            tmp[i] = items[i];
////        }
////        tmp[tmp.length - 1] = item;
////        items = tmp;
////    }
////
////    public void removeById(int id) {
////        Afisha[] tmp = new Afisha[items.length - 1];
////        int copyToIndex = 0;
////        for (Afisha item : items) {
////            if (item.getId() != id) {
////                tmp[copyToIndex] = item;
////                copyToIndex++;
////            }
////        }
////        items = tmp;
////    }
////
////    public Afisha[] getItems() {
////        return items;
////    }
//
//}
