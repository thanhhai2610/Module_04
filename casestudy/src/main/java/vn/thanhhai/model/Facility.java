package vn.thanhhai.model;

import javax.persistence.*;

@Entity
@Table
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double area;
    private double cost;
    private int max_people;
    @ManyToOne
    @JoinColumn(name = "rentType_id", referencedColumnName = "id")
    private RentType rentType;
    @ManyToOne
    @JoinColumn(name = "facilityType_id", referencedColumnName = "id")
    private Facility facilityType;

    public Facility() {
    }

    public Facility(int id, String name, double area, double cost, int max_people, RentType rentType, Facility facilityType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.max_people = max_people;
        this.rentType = rentType;
        this.facilityType = facilityType;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMax_people() {
        return max_people;
    }

    public void setMax_people(int max_people) {
        this.max_people = max_people;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public Facility getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(Facility facilityType) {
        this.facilityType = facilityType;
    }
}
