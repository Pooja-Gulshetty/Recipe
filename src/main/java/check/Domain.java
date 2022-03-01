package check;

public class Domain {
    private String type;
    private String expryDate;
    private String seriolnumber;

    public Domain(String type, String expryDate, String seriolnumber) {
        this.type = type;
        this.expryDate = expryDate;
        this.seriolnumber = seriolnumber;
    }

    public String getType() {
        return type;
    }

    public String getExpryDate() {
        return expryDate;
    }

    public String getSeriolnumber() {
        return seriolnumber;
    }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                ", expryDate='" + expryDate + '\'' +
                ", seriolnumber='" + seriolnumber;
    }
}
