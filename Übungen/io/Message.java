package io;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

// Serializable zeigt an, dass das Objekt serialisiert werden kann
public class Message implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private LocalDateTime createdAt;

    private String text;

    private boolean active;

    public Message() {
    }

    public Message(LocalDateTime createdAt, String text, boolean active) {
        this.createdAt = createdAt;
        this.text = text;
        this.active = active;
    }

    public Message(String text) {
        this(LocalDateTime.now(), text, true);
    }

    public Message(LocalDateTime createdAt, String text) {
        this(createdAt, text, true);
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(createdAt)
            .append(", ")
            .append(text)
            .append(", ")
            .append(active ? "aktiv": "nicht aktiv")
            .append("\n");
        return sb.toString();
    }
}
