package codesquad.domain;

import support.domain.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class Issue extends AbstractEntity {
    private String subject;
    private String comment;

    public Issue() {
    }

    public Issue(String subject, String comment) {
        this(0L, subject, comment);
    }

    public Issue(long id, String subject, String comment) {
        super(id);
        this.subject = subject;
        this.comment = comment;
    }

    public String getSubject() {
        return subject;
    }

    public String getComment() {
        return comment;
    }
}
