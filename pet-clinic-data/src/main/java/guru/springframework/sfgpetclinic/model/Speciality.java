package guru.springframework.sfgpetclinic.model;

/**
 * Created by Ag on 5.1.2020
 */
public class Speciality extends BaseEntity  {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
