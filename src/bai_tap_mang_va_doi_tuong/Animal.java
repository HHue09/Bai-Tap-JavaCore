package bai_tap_mang_va_doi_tuong;

public class Animal {
    private int id;
    private String name;
    private String description;
    private Boolean gender;

    public Animal(int id, String name, String description, Boolean gender) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.gender = gender;
    }

    public Animal() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", gender=" + gender +
                '}';
    }
}
