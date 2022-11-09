package vn.thanhhai.model.facility;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Value;
import vn.thanhhai.model.facility.Facility;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class FacilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "facilityType")
    @JsonIgnore
    @JsonBackReference
    private Set<Facility> facility;

    @Value("1")
    private int isDelete;

    public FacilityType() {
    }

    public FacilityType(int id, String name, Set<Facility> facility) {
        this.id = id;
        this.name = name;
        this.facility = facility;
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

    public Set<Facility> getFacility() {
        return facility;
    }

    public void setFacility(Set<Facility> facility) {
        this.facility = facility;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
