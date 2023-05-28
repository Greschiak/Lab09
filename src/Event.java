import java.util.Objects;

public class Event {
    int Dd,wiek,participantId=0;
    String name;
    public int getWiek(){
        return  wiek;
    }

    public Event(String name,int wiek){
        this.wiek =wiek;
        this.name = name;
        this.Dd =participantId++;
    }

    @Override
    public String toString() {
        return "Event{" +
                "Dd=" + Dd +
                ", wiek=" + wiek +
                ", participantId=" + participantId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return Dd == event.Dd && wiek == event.wiek && Objects.equals(name, event.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Dd, wiek, name);
    }
}
