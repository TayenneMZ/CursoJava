package Exercicios.GenericSetMap.Exercicio1.Entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
    private String username;
    private Date moment;

    public LogEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntry)) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(getUserName(), logEntry.getUserName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName());
    }
}