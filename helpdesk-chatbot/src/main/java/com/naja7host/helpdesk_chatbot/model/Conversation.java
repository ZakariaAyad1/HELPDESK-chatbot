package com.naja7host.helpdesk_chatbot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;


@Entity
@Table(name = "conversations")
@Data // Lombok: Generates getters, setters, toString(), equals(), and hashCode()
@NoArgsConstructor
@AllArgsConstructor
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_email", nullable = false)
    private String userEmail;


    /**
     * Storing messages as a JSON string.
     * @Lob indicates that this is a large object, suitable for TEXT or JSON types.
     */
    @Lob
    @Column(name = "messages", columnDefinition = "JSON")
    private String messages; // Store messages as a JSON formatted string

    @Column(name = "title")
    private String title;

    @Column(name = "category")
    private String category;

    @CreationTimestamp // Automatically sets the value on creation
    @Column(name = "started_at", updatable = false)
    private Timestamp startedAt;

    @Column(name = "ended_at")
    private Timestamp endedAt;

}
