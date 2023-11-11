package model.entitiy;

import model.enums.Status;

import java.time.LocalDateTime;

public class BaseEntitiy {

    private int id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Status status;

    public BaseEntitiy(int id, LocalDateTime createdDate, LocalDateTime updatedDate, Status status) {
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.status = status;
    }

    public BaseEntitiy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BaseEntitiy{" +
                "id=" + id +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", status=" + status +
                '}';
    }
}
