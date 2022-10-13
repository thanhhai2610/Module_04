package dictionary.model;

public class DictionaryApp {
    private String vie;
    private String eng;

    public DictionaryApp() {
    }

    public DictionaryApp(String vie, String eng) {
        this.vie = vie;
        this.eng = eng;
    }

    public String getVie() {
        return vie;
    }

    public void setVie(String vie) {
        this.vie = vie;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }
}
