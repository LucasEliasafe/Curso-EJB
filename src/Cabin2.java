
@Entity
@Table(name="CABIN")
public class Cabin2 {
    private int id;
    private String name;
    private int deckLevel;

    @Column(name="NAME")
    public String getName() {return name;}
    public void setName(String str) {name = str;}

    @Column(name="DECK_LEVEL")
    public int getDeckLevel() {return deckLevel;}
    public void setDeckLevel(int level) {deckLevel = level; }

    @Id
    @Column(name="ID")
    public int getID() {return id; }
        public void setID(int id) { this.id;}
}
