package linkedlistbook;

class Linkedbook {
    public static void main(String[] args) {

        Append objAppend = new Append();

        objAppend.add(new Book(1, "Java", "Aman"));
        objAppend.add(new Book(2, "C++", "Aman"));
        objAppend.add(new Book(3, "Python", "Aman"));

        objAppend.showBook();

        objAppend.show();

        objAppend.showBook();

    }
}
