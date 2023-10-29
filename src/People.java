public enum People {
    Artem("Артем"), Bob("Боб"), Gosha("Гоша");

    private String translation;

    People(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский " + translation;
    }
}
