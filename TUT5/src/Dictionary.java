class Dictionary extends Book {
    private int words; // number of words in the dictionary
    Dictionary(int words, int pages) {
        super(pages);
        this.words = words;
    }
    public String toString() {
        String pages = super.toString();
        return "Number of pages: " +pages+ ", Number of words: " + words;
    }
}
