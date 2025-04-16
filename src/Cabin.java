import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CABIN")
public class Cabin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CABIN_ID")
    private int id;

    @Column(name = "CABIN_NAME")
    private String name;

    @Column(name = "CABIN_DECK_LEVEL")
    private int deckLevel;


    public Cabin() {
    }

    // Getters e Setters
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

    public int getDeckLevel() {
        return deckLevel;
    }

    public void setDeckLevel(int deckLevel) {
        this.deckLevel = deckLevel;
    }

    @Override
    public String toString() {
        return "Cabin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deckLevel=" + deckLevel +
                '}';
    }
}