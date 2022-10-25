package vn.thanhhai.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class InformativeArticlesDto implements Validator {

    private int id;

    @NotEmpty(message = "Ban can nhap gi do")
    private String name;

    @NotEmpty(message = "Ban can nhap gi do")
    private String artist;

    @NotEmpty(message = "Ban can nhap gi do")
    private String kindOfMusic;


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

        InformativeArticlesDto informativeArticlesDto = (InformativeArticlesDto) target;

        if (!informativeArticlesDto.name.matches("^[A-Za-zàáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụ" +
                "ủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ ]{3,800}$")
                && !informativeArticlesDto.name.equals("")) {
            errors.rejectValue("name", "name", "Ban nhap ten bai hat chua dung dinh dang");
        }
        if (!informativeArticlesDto.artist.matches("^[A-Za-zàáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụ" +
                "ủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ ]{3,300}$")
                && !informativeArticlesDto.name.equals("")) {
            errors.rejectValue("artist", "artist", "Ban nhap ten nghe si chua dung dinh dang");
        }
        if (!informativeArticlesDto.kindOfMusic.matches("^[A-Za-zàáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụ" +
                "ủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ, ]{3,1000}$")
                && !informativeArticlesDto.name.equals("")) {
            errors.rejectValue("kindOfMusic", "kindOfMusic", "Ban nhap loai nhac chua dung dinh dang");
        }
    }

    public InformativeArticlesDto() {
    }

    public InformativeArticlesDto(int id, @NotEmpty(message = "Ban can nhap gi do") String name, @NotEmpty(message = "Ban can nhap gi do") String artist, @NotEmpty(message = "Ban can nhap gi do") String kindOfMusic) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.kindOfMusic = kindOfMusic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }
}
