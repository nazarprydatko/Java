package bookshelf.bookstore;

 public abstract class Book implements Cloneable{
    public int ISBN;
    public int pages;
    public String genre;

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    public abstract void printContent();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object cloneObject = null;
        try {
            cloneObject = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("cloning failed");
        }
        return cloneObject;
    }
}
