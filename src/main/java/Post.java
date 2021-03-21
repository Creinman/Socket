import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    private final int status;
    private final boolean verified;
    private final int sentCount;
    private final String feedback;
    private final String type;
    private final boolean deleted;
    private final String _id;
    private final String user;
    private final String text;

    public Post(
            @JsonProperty("status") int status,
            @JsonProperty("verified") boolean verified,
            @JsonProperty("sentCount") int sentCount,
            @JsonProperty("feedback") String feedback,
            @JsonProperty("type") String type,
            @JsonProperty("deleted") boolean deleted,
            @JsonProperty("_id") String _id,
            @JsonProperty("user") String user,
            @JsonProperty("text") String text
    ) {
        this.status = status;
        this.verified = verified;
        this.sentCount = sentCount;
        this.feedback = feedback;
        this.type = type;
        this.deleted = deleted;
        this._id = _id;
        this.user = user;
        this.text = text;
    }

    public int getStatus() {
        return status;
    }

    public boolean getVerified() {
        return verified;
    }
    // … все getters
    @Override
    public String toString() {
        return "Post" +
                "\n status=" + status +
                "\n verified=" + verified +
                "\n sentCount=" + sentCount +
                "\n feedback=" + feedback +
                "\n id=" + _id +
                "\n type" + type +
                "\n deleted" + deleted +
                "\n user=" + user +
                "\n text=" + text;
    }
}
