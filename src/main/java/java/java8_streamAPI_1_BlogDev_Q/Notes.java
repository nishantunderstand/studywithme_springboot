package java.java8_streamAPI_1_BlogDev_Q;

public class Notes {
    private long tagId;
    private String tagName;
    private long value;

    public Notes(long tagId, String tagName, long value) {
        this.tagId = tagId;
        this.tagName = tagName;
        this.value = value;
    }

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
