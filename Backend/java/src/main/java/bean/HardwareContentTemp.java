package bean;

public class HardwareContentTemp {
    private String id;
    private HardwareJsonContent[] content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HardwareJsonContent[] getContent() {
        return content;
    }

    public void setContent(HardwareJsonContent[] content) {
        this.content = content;
    }
}
