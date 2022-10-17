package vn.thanhhai.model;

public class MailBox {

    private String languages;
    private int size;
    private String spamsFilter;
    private String signature;

    public MailBox(String languages, int size, String spamsFilter, String signature) {
        this.languages = languages;
        this.size = size;
        this.spamsFilter = spamsFilter;
        this.signature = signature;
    }

    public MailBox() {
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSpamsFilter() {
        return spamsFilter;
    }

    public void setSpamsFilter(String spamsFilter) {
        this.spamsFilter = spamsFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
