package com.how2java.tmall.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order_")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "uid")
    private User user;

    private String orderCode;
    private String address;
    private String post;
    private String receiver;
    private String mobile;
    private String userMessage;
    private Date createDate;
    private Date payDate;
    private Date deliverDate;
    private Date confirmDate;
    private String status;

    @Transient
    private List<OrderItem> orderItems;

    @Transient
    private float total;

    @Transient
    private int totalNumber;

    @Transient
    private String statusDesc;

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public String getAddress() {
        return address;
    }

    public String getPost() {
        return post;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getMobile() {
        return mobile;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public String getStatus() {
        return status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public float getTotal() {
        return total;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public String getStatusDesc() {
        if (null != statusDesc)
            return statusDesc;
        String desc = "未知";
        switch (status) {

        }
        statusDesc = desc;
        return statusDesc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }
}
