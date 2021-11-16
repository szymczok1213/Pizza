package pl.szymon.pizza.remote.rest.dto.response;


import com.fasterxml.jackson.annotation.JsonFormat;
import pl.szymon.pizza.domain.model.OrderStatusType;

import java.util.Date;

public class OrderStatusDto {
    private OrderStatusType status;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date exceptedAt;

    public OrderStatusDto(OrderStatusType status, Date updateAt, Date exceptedAt, Date createdAt, Date createdAt1) {
        this.status = status;
        this.updateAt = updateAt;
        this.exceptedAt = exceptedAt;
        this.createdAt = createdAt;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getExceptedAt() {
        return exceptedAt;
    }

    public void setExceptedAt(Date exceptedAt) {
        this.exceptedAt = exceptedAt;
    }

    public Date getCreatedAt() {return createdAt;}

    public void setCreatedAt(Date createdAt) {this.createdAt = createdAt;}

    public OrderStatusDto() {


    }
}
