import java.util.Date;

public final class ImmutableClass {


    private final Integer immutable1;

    private final String immutable2;

    private final Date date;

    public ImmutableClass(Integer immutable1, String immutable2, Date date) {
        this.immutable1 = immutable1;
        this.immutable2 = immutable2;
        this.date = new Date(date.getTime());
    }


    public Integer getImmutable1() {
        return immutable1;
    }

    public String getImmutable2() {
        return immutable2;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }


}
